
$(document).ready(function () {

    $("#btn_register").click(function (event) {
        //stop submit the form, we will post it manually.
alert("registrazione eseguita");
      var register={
		"registration":{
			"username":$("#email").val(),
			"password":$("#password").val(),
			
			
		}
}
 			fire_ajax_post ("api/addRegistration", register);
    });

});

if (response_object.code=="KO") alert(response_object.descr);