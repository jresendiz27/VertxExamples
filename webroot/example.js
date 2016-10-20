/**
 * Created by jresendiz on 20/10/16.
 */
var eventBus = new EventBus("http://localhost:8080/eventbus")
eventBus.onopen = function (information) {
    eventBus.registerHandler("incomingMessage", function (err, content) {
        console.log(content);
        $("#messages").append(content.body + "<br>");
    });
};
