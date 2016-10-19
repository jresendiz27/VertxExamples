package com.nearsoft.jresendiz.vertxworkshop.eventbus

import io.vertx.groovy.core.Vertx

/**
 * Created by jresendiz on 18/10/16.
 */
// Let's start the clustering mode
def clusteredOptions = [
        clustered: true,
        logActivity: true
]

Vertx.clusteredVertx(clusteredOptions, { res ->
    if (res.succeeded()) {
        println("We now have a clustered event bus")
    } else {
        println("Failed: ${res.cause()}")
    }
});
