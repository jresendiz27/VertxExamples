/**
 * Created by jresendiz on 17/10/16.
 */
var Vertx = require("vertx-js/vertx")
var vertx = Vertx.vertx();
vertx.setPeriodic(1000, function (value) {
    console.log("Periodic Hello World from Vert.x using JS");
});