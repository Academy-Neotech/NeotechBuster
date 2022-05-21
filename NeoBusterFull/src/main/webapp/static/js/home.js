$(document).ready(function () {
	
	var listaUltimiArrivi=fire_ajax_pathvar('api/getMovieByArrival'); 
	
	$.each(listaUltimiArrivi.responseJSON.latestmovies, function (i, movie) {

var box ='<div class="col-md-3">\
      <div class="card card-widget widget-user">\
              <div class="widget-user-header bg-info">\
                <h5 id="titolo" class="widget-user-desc">'+movie.title+'</h5>\
              </div>\
              <div class="widget-user-image">\
                <img class="img-circle elevation-2" src="'+movie.url_image+'" style= "height:90px" alt="User Avatar">\
              </div>\
              <div class="card-footer">\
                <div class="row">\
                  <div class="col-sm-12 border-right">\
                    <div class="description-block">\
                      <h5 id="price" class="description-header">€ '+movie.price+',00</h5>\
                      <span class="description-text">Prezzo</span>\
                    </div>\
                  </div>\
                  </div>\
                  <div class="col-sm-12">\
                    <div class="description-block">\
                      <h5 id="quantity" class="description-header">'+movie.quantity+'</h5>\
                      <span class="description-text">Disponibilita</span>\
                    </div>\
                     <a class="btn btn-primary" href="customer/bookMovie/'+movie.movie_id+'" role="button">Booking</a>\
                  </div>\
                </div>\
    		 </div>\
            </div>\
     </div>';
    $("#contenitore_latestmovies").prepend(box);


});
	
	var listaOfferteSpeciali=fire_ajax_pathvar('api/getMovieByOffer'); 
	
	$.each(listaOfferteSpeciali.responseJSON.movieoffers, function (i, movie) {

var box ='<div class="col-md-3">\
      <div class="card card-widget widget-user">\
              <div class="widget-user-header bg-info">\
                <h5 id="titolo" class="widget-user-desc">'+movie.title+'</h5>\
              </div>\
              <div class="widget-user-image">\
                <img class="img-circle elevation-2" src="'+movie.url_image+'" style= "height:90px" alt="User Avatar">\
              </div>\
              <div class="card-footer">\
                <div class="row">\
                  <div class="col-sm-12 border-right">\
                    <div class="description-block">\
                      <h5 id="price" class="description-header">€ '+movie.price+',00</h5>\
                      <span class="description-text">Prezzo</span>\
                    </div>\
                  </div>\
                  </div>\
                  <div class="col-sm-12">\
                    <div class="description-block">\
                      <h5 id="quantity" class="description-header">'+movie.quantity+'</h5>\
                      <span class="description-text">Disponibilita</span>\
                    </div>\
                    <a class="btn btn-primary" href="customer/bookMovie/'+movie.movie_id+'" role="button">Booking</a>\
                  </div>\
                </div>\
    		 </div>\
            </div>\
     </div>';
    $("#contenitore_offertespeciali").prepend(box);
	
	
	
	});
	
	
	});
	
	
	