package com.nearsoft.jresendiz.vertxworkshop.eventbus

import io.vertx.core.Vertx

/**
 * Created by jresendiz on 19/10/16.
 */
def eventBus = vertx.eventBus();
eventBus.consumer("HelloWorldChannel", { message ->
    println("From Groovy ${Thread.currentThread().getId()} { ${message.body()} }")
});

