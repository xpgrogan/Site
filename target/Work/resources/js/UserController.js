$(document).ready(function() {
    console.log("in document ready top");
    /*$.ajax({
        type: "GET",
        url: "home"
    }).then(function(data) {
        console.log("SUCCESS: ", data);
        console.log("donezo!!!!");
    });*/
    console.log("in document ready top");
    $.get( "home", function( data ) {
        console.log(data);
        alert( "Load was performed." );
    });

});