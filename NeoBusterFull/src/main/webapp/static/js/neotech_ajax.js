//Chiama l'API e ritorna il JSON
function fire_ajax_post(send_url, send_data) {
var response_data;

  return $.ajax({
        type: "POST",
        contentType: "application/json",
        url: send_url,
        data: JSON.stringify(send_data),
        dataType: 'json',
        cache: false,
        async:false,
       // 200
        success: function (data) {
            response_data=JSON.stringify(data);
            return response_data;
        },
        error: function (e) {
            console.log(e);
        }
    });
}


function fire_ajax_pathvar(send_url) {
var response_data;
  return $.ajax({
        type: "GET",
        contentType: "application/json",
        url: send_url,
        cache: false,
        async:false,
        success: function (data) {
            response_data=JSON.stringify(data);
            return response_data;
        },
        error: function (e) {
            console.log("ERROR : ", e);
        }
    });
}