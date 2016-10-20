package com.nearsoft.jresendiz.vertxworkshop.web

/**
 * Created by jresendiz on 19/10/16.
 */
def server = vertx.createHttpServer();
server.requestHandler({ request ->
    def response =  request.response()
    response.putHeader("content-type", "text/plain")
    response.end("Hello World, from Vert.x Web server");
});
server.liste(8080);