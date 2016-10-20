package com.nearsoft.jresendiz.vertxworkshop.web

/**
 * Created by jresendiz on 20/10/16.
 */
import io.vertx.groovy.ext.web.Router
import io.vertx.groovy.ext.web.handler.StaticHandler
import io.vertx.groovy.ext.web.handler.sockjs.SockJSHandler

def currentWebServer = vertx.createHttpServer();
def router = Router.router(vertx)

def options = [
//        inboundPermitteds : [
//                [
//                        address: "chat.to.server"
//                ]
//        ],
        outboundPermitteds: [
                [
                        address: "incomingMessage"
                ]
        ],
        heartbeatInterval : 2000

]

def sockJSHandler = SockJSHandler.create(vertx).bridge(options)

router.route("/eventbus/*").handler(sockJSHandler)
router.route().handler(StaticHandler.create()); //uses webroot for default
currentWebServer.requestHandler(router.&accept).listen(8080)
// create events on the eventbus
def eventBus = vertx.eventBus()
vertx.setPeriodic(2000, { handler ->
    println "Sending event to bridge"
    eventBus.publish("incomingMessage", "This is a message from GroovyServer");
})
