/**
 * Created by jresendiz on 19/10/16.
 */
var eventBus = vertx.eventBus();
eventBus.consumer("HelloWorldChannel", function(message) {
    console.log("From JS - {"+ message.body() +"}")
});