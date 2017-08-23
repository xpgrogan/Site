$(document).ready(function() {
    console.log("in document ready top");
    $.ajax({
        type: "GET",
        url: "home.jsp"
    }).then(function(data) {
        console.log("SUCCESS: ", data);
        $("#user-id").innerHTML(data);
    });
});