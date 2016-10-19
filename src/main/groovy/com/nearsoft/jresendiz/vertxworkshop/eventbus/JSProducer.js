/**
 * Created by jresendiz on 19/10/16.
 */
var eventBus = vertx.eventBus();
vertx.setPeriodic(500, function (value) {
    eventBus.send("HelloWorldChannel", "Hello World from JS Producer");
});
// vertx.deployVerticle("./JSConsumer.js");