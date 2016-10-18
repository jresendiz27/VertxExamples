package com.nearsoft.jresendiz.vertxworkshop;

import io.vertx.core.AbstractVerticle;

/**
 * Created by jresendiz on 17/10/16.
 */
public class HelloWorldVerticle extends AbstractVerticle {

    @Override
    public void start() {
        System.out.println("Hello World from Vert.x using Java");
    }

    @Override
    public void stop() {
        System.out.println("Bye World from Vert.x using Java");
    }
}
