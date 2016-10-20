/**
 * Created by jresendiz on 20/10/16.
 */
var eventBus = vertx.eventBus();
vertx.setPeriodic(500, function (value) {
    eventBus.publish("incomingMessage", "This is a message from Js Verticle");
});