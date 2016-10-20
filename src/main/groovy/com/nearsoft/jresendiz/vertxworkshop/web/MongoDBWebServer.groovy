package com.nearsoft.jresendiz.vertxworkshop.web

import io.vertx.groovy.ext.mongo.MongoClient
import io.vertx.groovy.ext.web.Router
import io.vertx.groovy.ext.web.handler.StaticHandler
import io.vertx.lang.groovy.GroovyVerticle

/**
 * Created by jresendiz on 19/10/16.
 */
class MongoDBWebServer extends GroovyVerticle {
    def mongoClient
    def currentWebServer
    def router
    public void start() {
        deployMongoContainer()
//        vertx.setTimer(1000, { handler ->
//            findAllTweets()
//        })
        startWebServer()
        println "Succeded in deploy verticle!!"
    }

    public void stop() {
        println "Verticle has stopped"
    }

    public deployMongoContainer() {
        def config = [
                connection_string:"mongodb://test:test@ds025603.mlab.com:25603/vertx_workshop"
        ]
//        {
//            "who": "jresendiz",
//            "content": "First tweet",
//            "language": "Groovy"
//        }
        mongoClient = MongoClient.createShared(vertx, config, "vertx_workshop");
    }
    public startWebServer () {
        currentWebServer = vertx.createHttpServer()
        router = Router.router(vertx)
        router.get("/tweets").handler({ routingContext -> //closures
            def response = routingContext.response()
            mongoClient.find("content", [:], { res ->
                if(res.succeeded()) {
                    response.putHeader("content-type","application/json").end(groovy.json.JsonOutput.toJson(res.result()))
                }
            });
        });
        router.route().handler(StaticHandler.create()); //uses webroot for default
        currentWebServer.requestHandler(router.&accept).listen(8080)
    }

    public findAllTweets() {
        mongoClient.find("content", [:], { res ->
            if(res.succeeded()) {
                println res.result()
            }
        })
    }
}
