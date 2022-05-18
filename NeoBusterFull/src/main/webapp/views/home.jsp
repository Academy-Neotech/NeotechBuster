<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>AdminLTE 3 | NEOBUSTER</title>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="static/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="static/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

  </nav>
 
  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
 
        <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item">
            <a href="#" class="nav-link">         
              <p>
                HOME 
              </p>
            </a>
           
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Login 
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Register 
              </p>
            </a>
          </li>
            
          <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Ricerca Film
              </p>
            </a>
          </li>
         <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Prenota Film
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Lista Prenotazioni
              </p>
            </a>
          </li>
         <li class="nav-item">
            <a href="#" class="nav-link">
                 <p>
                Gestione Carta
              </p>
            </a>
          </li>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
     
     
      <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>NEOBUSTER</h1>
         <h4 class="text-right">Latest Movies</h4>

        <section class="content">
    
    <div class ="row">
    <c:forEach items="${listaMovieUltimiArrivi}" var="movie"> 
    <div class ="col-md-40">	
    <div class="card card-widget widget-user">
              <!-- Add the bg color to the header using any of the bg-* classes -->
              <div class="widget-user-header bg-info">
                <h5 class="widget-user-desc"><c:out value ="${movie.title}"/></h5>
                  <span class="description-text">Titolo</span>
              </div>
              <div class="widget-user-image">
                <img class="img-circle elevation-2" src="${movie.url_image}" style= "height:90px" alt="User Avatar">
              </div>
              <div class="card-footer">
                <div class="row">
                  <div class="col-sm-40 border-right">
                    <div class="description-block">
                      <h5 class="description-header"><c:out value ="${movie.price}"/></h5>
                      <span class="description-text">Prezzo</span>
                    </div>
                    <!-- /.description-block -->
                  </div>
              
                  </div>
                  <!-- /.col -->
                  <div class="col-sm-20">
                    <div class="description-block">
                      <h5 class="description-header"><c:out value ="${movie.quantity}"/></h5>
                      <span class="description-text">Disponibilita'</span>
                    </div>
                     <a class="btn btn-primary" href="/prenota_film" role="button">Booking</a>
                    <!-- /.description-block -->
                  </div>
                  <!-- /.col -->
                </div>
    		 </div>
            </div>
   		
    </c:forEach>
   
    </div>
    </section>
		
         <h4 class="text-right">Special Offers</h4>
         <section class="content">
    <div class ="row">
    <c:forEach items="${listaMovieOfferteSpeciali}" var="movie">  
    <div class ="col-md-40">	
   
    <div class="card card-widget widget-user">
              <!-- Add the bg color to the header using any of the bg-* classes -->
              <div class="widget-user-header bg-info">
                <h5 class="widget-user-desc"><c:out value ="${movie.title}"/></h5>
                  <span class="description-text">Titolo</span>
              </div>
              <div class="widget-user-image">
                <img class="img-circle elevation-2" src="${movie.url_image}" style= "height:90px" alt="User Avatar">
              </div>
              <div class="card-footer">
                <div class="row">
                  <div class="col-sm-40 border-right">
                    <div class="description-block">
                      <h5 class="description-header"><c:out value ="${movie.price}"/></h5>
                      <span class="description-text">Prezzo</span>
                    </div>
                    <!-- /.description-block -->
                  </div>
              
                  </div>
                  <!-- /.col -->
                  <div class="col-sm-20">
                    <div class="description-block">
                      <h5 class="description-header"><c:out value ="${movie.quantity}"/></h5>
                      <span class="description-text">Disponibilita'</span>
                    </div>
                     <a class="btn btn-primary" href="/prenota_film" role="button">Booking</a>
                    <!-- /.description-block -->
                  </div>
                  <!-- /.col -->
                </div>
    		 </div>
            </div>
   		
    </c:forEach>
    
    </div>
    </section>
    
    <!-- Main content -->
   
    