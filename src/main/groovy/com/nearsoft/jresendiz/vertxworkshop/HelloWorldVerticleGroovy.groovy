package com.nearsoft.jresendiz.vertxworkshop

import io.vertx.lang.groovy.GroovyVerticle

/**
 * Created by jresendiz on 17/10/16.
 */
public class HelloWorldVerticleGroovy extends GroovyVerticle {
    public void start() {
        println "Hello World from Groovy Verticle"
    }
    public void stop() {
        println "Bye World from Groovy Verticle"
    }
}
