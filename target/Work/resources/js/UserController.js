console.log("in document ready top");
$( document ).ready(function() {
    console.log("in document ready");
    $.ajax({
        type : "GET",
        contentType : "application/json",
        url : "UserRest",
        data : "YASSSSS",
        e : "HELPU",
        success : function(data) {
            console.log("SUCCESS: ", data);
            display(data);
        },
        error : function(e) {
            console.log("ERROR: ", e);
            display(e);
        },
        done : function(e) {
            console.log("DONE");
        }
    });
});