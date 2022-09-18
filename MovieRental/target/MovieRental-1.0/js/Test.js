$(document).ready(function (){
    $.ajax({
        type:"GET", 
        dataTyoe: "html",
        url:"./ServletTest",
        data: $.param(),
        success: function(data){
            let parsedData= JSON.parse(data);
            console.log("peticion correcta");
        }
    });
});