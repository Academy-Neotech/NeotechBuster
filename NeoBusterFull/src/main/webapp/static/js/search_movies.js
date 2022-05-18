

$(document).ready(function () {
$('#titolo').autoComplete({
	resolverSettings: {
		url: 'api/autocompleteForMovies'
		}
		});

 $('#titolo').autoComplete();

$('#attore').autoComplete({
	resolverSettings: {
		url: 'api/autocompleteForActor'
		}
		});

 $('#attore').autoComplete();

var generi=fire_ajax_pathvar("api/genereForFront");
 $.each(generi.responseJSON, function (i, genere) {
    $('#genere').append($('<option>', { 
        value: genere.genre_id,
        text : genere.genre_name
    }));
});


   $("#btn_ricerca").click(function (event) {   
   
    var requestData= {
	       "title":$("#titolo").val().toLowerCase(),
           "person_name":$("#attore").val().toLowerCase(),
		   "genre_name":$("#genere option:selected").text(),
		   "specialoffer":true
     };
    
     
       var response_object=fire_ajax_post("api/searchMovieBy",requestData);
      
 if(response_object.code=="KO") alert(response_object.descr);


$("#listaFilm tr.mia").remove();


$.each(response_object.responseJSON.movies, function(i, responseList){
	var riga="<tr class='mia'>";
	       riga+="<td>"+responseList.movie_id+"</td>";
           riga+="<td>"+responseList.title+"</td>";
           riga+="<td>"+responseList.price+"</td>";
           riga+="<td>"+responseList.quantity+"</td>";
           riga+="<td><button><a href='booking(\""+responseList.movie_id+"\")' type='button' class='btn btn-primary'>booking</a></button></td>";
        riga+="</tr>";
$("#listaFilm").append(riga);
});
 });
});