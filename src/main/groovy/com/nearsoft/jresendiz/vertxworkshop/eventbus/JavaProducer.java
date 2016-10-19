package com.nearsoft.jresendiz.vertxworkshop.eventbus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import java.awt.*;

/**
 * Created by jresendiz on 19/10/16.
 */
public class JavaProducer extends AbstractVerticle {
    @Override
    public void start() {
        EventBus eventBus = vertx.eventBus();
        vertx.setPeriodic(500, id-> {
            eventBus.send("HelloWorldChannel", "Hello World from Java Producer");
        });
    }
}
