<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Neobuster | Neobuster</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../static/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../static/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<!-- Site wrapper -->

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="login" class="nav-link">Login</a>
      </li>
       <li class="nav-item d-none d-sm-inline-block">
        <a href="register" class="nav-link">Register</a>
      </li>
      </ul>
   
   

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Navbar Search -->
      <li class="nav-item">
        <a class="nav-link" data-widget="navbar-search" href="#" role="button">
          <i class="fas fa-search"></i>
        </a>
        <div class="navbar-search-block">
          <form class="form-inline">
            <div class="input-group input-group-sm">
              <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
              <div class="input-group-append">
                <button class="btn btn-navbar" type="submit">
                  <i class="fas fa-search"></i>
                </button>
                <button class="btn btn-navbar" type="button" data-widget="navbar-search">
                  <i class="fas fa-times"></i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>

      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-comments"></i>
          <span class="badge badge-danger navbar-badge">3</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="static/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Brad Diesel
                  <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
           
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="static/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  John Pierce
                  <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="static/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Nora Silvester
                  <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-bell"></i>
          <span class="badge badge-warning navbar-badge">15</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <span class="dropdown-item dropdown-header">15 Notifications</span>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-envelope mr-2"></i> 4 new messages
            <span class="float-right text-muted text-sm">3 mins</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-users mr-2"></i> 8 friend requests
            <span class="float-right text-muted text-sm">12 hours</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-file mr-2"></i> 3 new reports
            <span class="float-right text-muted text-sm">2 days</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="fullscreen" href="#" role="button">
          <i class="fas fa-expand-arrows-alt"></i>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
          <i class="fas fa-th-large"></i>
          
         
          
          
          
          
        </a>
      </li>
    </ul>
    </div>
  </nav>
 
   
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="static/index3.html" class="brand-link">
      <img   class="brand-image img-circle elevation-3" style="opacity: .8">
      <span class="brand-text font-weight-light">Neobuster</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->
     

      <!-- SidebarSearch Form -->
     
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
         
            <li class="nav-item">
            <a href="" class="nav-link">
             <i class="nav-icon fas fa-th"></i>
              <p>
               User
                <span class="right badge badge-danger"></span>
              </p>
            </a>
          </li>
         
         
          <li class="nav-item">
            <a href="home" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Home
                <span class="right badge badge-danger"></span>
              </p>
            </a>
          </li>
        
          <li class="nav-item">
            <a href="search_Movie" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Search/Booking Movie
                <span class="right badge badge-danger"></span>
              </p>
            </a>
          </li>
        
        
              <li class="nav-item">
            <a href="bookingList" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Booking List
                <span class="right badge badge-danger"></span>
              </p>
            </a>
          </li>
         
          <li class="nav-item">
            <a href="card" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
               Card Service
                <span class="right badge badge-danger"></span>
              </p>
            </a>
          </li>
          
          
           </ul>
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
            <h1>Neobuster</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Neobuster</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    
    
    <!--Inizio sezione ricerca --------- -->
    
                        <div class="col-3">
                              <div class="form-group">
                                    <label>Genre</label>
                                    
                                    <select class="select2 select2" style="width: 100%;"  id="genere" tabindex="-1" aria-hidden="true">
                                      
                                    </select>
       
                                </div>
                                
   
   
                            </div>
    
    
    <!-- Titolo -->
    
 <form>
   
    <ul class="pagination justify-content-center">
  <div class="row">
  
    <div class="col">
    
    Title
      <input type="text" class="form-control basicAutoComplete" id="titolo" placeholder="Title"  autocomplete="off">
    
    </div>
    <div class="col">
    Actor
      <input type="text" class="form-control basicAutoComplete" id="attore" placeholder="Actor" autocomplete="off">
    </div> 
  </div>
  </ul>
</form>

    
   
    <!-- Attore -->
    
    <div class="col-3">
    <div class="form-check">
         <input class="form-check-input position-static" type="checkbox" id="specialoffer" value="option1" aria-label="...">Stock Movie
         </div>
         
         <div class="form-check">
         <input class="form-check-input position-static" type="checkbox" id="datearrived" value="option1" aria-label="...">Latest Movie
         </div>
    </div>
    
    
    <!-- Pulsante Ricerca -->
    
   
        <div class="col-11">
           <button type="button"  id="btn_ricerca"  class="btn btn-primary btn-lg float-right">Search</button>
        </div>
      
    
    <!-- Fine Sezione Ricerca -------- -->
   
       
   
      
      
      
      
    <!-- Tabella lista utenti -->
         <table class="table table-white table-striped" id="listaFilm">  
           
           <tr>
      <th scope="col">ID</th>
      <th scope="col">Titolo</th>
      <th scope="col">Costo €/gg</th>
      <th scope="col">Disponibilità</th>
       <th scope="col">Azioni</th>
       
     </tr>
        <tbody>   
        
        <tr>
         
        </tr>
          
     </tbody>
    </table>
   
   
  <!-- Impaginazione foot -->
   
    <ul class="pagination justify-content-end m-0" >
    Previus
              <li class="page-item active"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item"><a class="page-link" href="#">4</a></li>
              <li class="page-item"><a class="page-link" href="#">5</a></li>
              <li class="page-item"><a class="page-link" href="#">6</a></li>
              <li class="page-item"><a class="page-link" href="#">7</a></li>
              <li class="page-item"><a class="page-link" href="#">8</a></li>
              Next
            </ul>
         
 
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="float-right d-none d-sm-block">
      <b>Version</b> 3.2.0
    </div>
    <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
 <aside class="control-sidebar control-sidebar-dark" style="display: block;">
  
   <div class="p-3 control-sidebar-content" style="">
          <h5>Customize AdminLTE</h5>
          <hr class="mb-2">
          <div class="mb-4">
          <input type="checkbox" value="1" class="mr-1">
          <span>Dark Mode</span>
          </div>
          <h6>Header Options</h6>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Fixed</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Dropdown Legacy Offset</span>
          </div>
          <div class="mb-4"><input type="checkbox" value="1" class="mr-1">
          <span>No border</span>
          </div>
          <h6>Sidebar Options</h6>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Collapsed</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Fixed</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" checked="checked" class="mr-1">
          <span>Sidebar Mini</span>
          </div>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Sidebar Mini MD</span>
          </div>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Sidebar Mini XS</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Nav Flat Style</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Nav Legacy Style</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Nav Compact</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Nav Child Indent</span>
          </div>
          <div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Nav Child Hide on Collapse</span>
          </div>
          <div class="mb-4">
          <input type="checkbox" value="1" class="mr-1">
          <span>Disable Hover/Focus Auto-Expand</span>
          </div>
          <h6>Footer Options</h6>
          <div class="mb-4">
          <input type="checkbox" value="1" class="mr-1">
          <span>Fixed</span>
          </div>
          <h6>Small Text Options</h6>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Body</span>
          </div>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Navbar</span>
          </div>
          <div class="mb-1"><input type="checkbox" value="1" class="mr-1">
          <span>Brand</span>
          </div><div class="mb-1">
          <input type="checkbox" value="1" class="mr-1">
          <span>Sidebar Nav</span>
          </div>
          <div class="mb-4">
          <input type="checkbox" value="1" class="mr-1">
          <span>Footer</span>
          </div>
          <h6>Navbar Variants</h6>
          <div class="d-flex">
          <select class="custom-select mb-3 text-light border-0 bg-white">
          <option class="bg-primary">Primary</option>
          <option class="bg-secondary">Secondary</option>
          <option class="bg-info">Info</option>
          <option class="bg-success">Success</option>
          <option class="bg-danger">Danger</option>
          <option class="bg-indigo">Indigo</option>
          <option class="bg-purple">Purple</option>
          <option class="bg-pink">Pink</option>
          <option class="bg-navy">Navy</option>
          <option class="bg-lightblue">Lightblue</option>
          <option class="bg-teal">Teal</option>
          <option class="bg-cyan">Cyan</option>
          <option class="bg-dark">Dark</option>
          <option class="bg-gray-dark">Gray dark</option>
          <option class="bg-gray">Gray</option>
          <option class="bg-light">Light</option>
          <option class="bg-warning">Warning</option>
          <option class="bg-white">White</option>
          <option class="bg-orange">Orange</option>
          </select>
          </div>
          <h6>Accent Color Variants</h6>
          <div class="d-flex"></div>
          <select class="custom-select mb-3 border-0">
          <option>None Selected</option>
          <option class="bg-primary">Primary</option>
          <option class="bg-warning">Warning</option>
          <option class="bg-info">Info</option>
          <option class="bg-danger">Danger</option>
          <option class="bg-success">Success</option>
          <option class="bg-indigo">Indigo</option>
          <option class="bg-lightblue">Lightblue</option>
          <option class="bg-navy">Navy</option>
          <option class="bg-purple">Purple</option>
          <option class="bg-fuchsia">Fuchsia</option>
          <option class="bg-pink">Pink</option>
          <option class="bg-maroon">Maroon</option>
          <option class="bg-orange">Orange</option>
          <option class="bg-lime">Lime</option>
          <option class="bg-teal">Teal</option>
          <option class="bg-olive">Olive</option>
          </select>
          <h6>Dark Sidebar Variants</h6>
          <div class="d-flex"></div>
          <select class="custom-select mb-3 text-light border-0 bg-primary">
          <option>None Selected</option>
          <option class="bg-primary">Primary</option>
          <option class="bg-warning">Warning</option>
          <option class="bg-info">Info</option>
          <option class="bg-danger">Danger</option>
          <option class="bg-success">Success</option>
          <option class="bg-indigo">Indigo</option>
          <option class="bg-lightblue">Lightblue</option>
          <option class="bg-navy">Navy</option>
          <option class="bg-purple">Purple</option>
          <option class="bg-fuchsia">Fuchsia</option>
          <option class="bg-pink">Pink</option>
          <option class="bg-maroon">Maroon</option>
          <option class="bg-orange">Orange</option>
          <option class="bg-lime">Lime</option>
          <option class="bg-teal">Teal</option>
          <option class="bg-olive">Olive</option>
          </select>
          <h6>Light Sidebar Variants</h6>
          <div class="d-flex"></div>
          <select class="custom-select mb-3 border-0">
          <option>None Selected</option>
          <option class="bg-primary">Primary</option>
          <option class="bg-warning">Warning</option>
          <option class="bg-info">Info</option>
          <option class="bg-danger">Danger</option>
          <option class="bg-success">Success</option>
          <option class="bg-indigo">Indigo</option>
          <option class="bg-lightblue">Lightblue</option>
          <option class="bg-navy">Navy</option>
          <option class="bg-purple">Purple</option>
          <option class="bg-fuchsia">Fuchsia</option>
          <option class="bg-pink">Pink</option>
          <option class="bg-maroon">Maroon</option>
          <option class="bg-orange">Orange</option>
          <option class="bg-lime">Lime</option>
          <option class="bg-teal">Teal</option>
          <option class="bg-olive">Olive</option>
          </select>
          <h6>Brand Logo Variants</h6>
          <div class="d-flex"></div>
          <select class="custom-select mb-3 border-0">
          <option>None Selected</option>
          <option class="bg-primary">Primary</option>
          <option class="bg-secondary">Secondary</option>
          <option class="bg-info">Info</option>
          <option class="bg-success">Success</option>
          <option class="bg-danger">Danger</option>
          <option class="bg-indigo">Indigo</option>
          <option class="bg-purple">Purple</option>
          <option class="bg-pink">Pink</option>
          <option class="bg-navy">Navy</option>
          <option class="bg-lightblue">Lightblue</option>
          <option class="bg-teal">Teal</option>
          <option class="bg-cyan">Cyan</option>
          <option class="bg-dark">Dark</option>
          <option class="bg-gray-dark">Gray dark</option>
          <option class="bg-gray">Gray</option>
          <option class="bg-light">Light</option>
          <option class="bg-warning">Warning</option>
          <option class="bg-white">White</option>
          <option class="bg-orange">Orange</option>
          <a href="#">clear</a>
          </select>
          </div>
          
  
  
  
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->



<script src="../static/plugins/jquery/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/gh/xcash/bootstrap-autocomplete@master/dist/latest/bootstrap-autocomplete.min.js"></script>
<script src="../static/js/neotech_ajax.js"></script>
<script src="../static/js/search_movies.js"></script>
<!-- jQuery -->

<!-- Bootstrap 4 -->
<script src="../static/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../static/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->


</body>
</html>
