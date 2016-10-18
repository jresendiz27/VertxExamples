package com.nearsoft.jresendiz.vertxworkshop;

import io.vertx.core.Vertx;

/**
 * Created by jresendiz on 18/10/16.
 */
public class EmbeddedVerticle {
    public static void main(String args[]) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle("com.nearsoft.jresendiz.vertxworkshop.HelloWorldVerticle");
        vertx.deployVerticle("groovy:com.nearsoft.jresendiz.vertxworkshop.HelloWorldVerticleGroovy");
        vertx.deployVerticle("HelloWorldVerticle.js");
    }
}
