<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Twitter</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	function registerComment() {
		var fecha = $("#fecha").val();
		var contenido = $("#contenido").val();
		$.ajax({
			type : "POST",
			url : "registercomment.action",
			data : "fecha=" + fecha + "&contenido=" + contenido,
			success : function(data) {
				var ht = data.msg;
				$("#resp").html(ht);
			},
			error : function(data) {
				alert("Some error occured.");
			}
		});
	}
</script>
</head>
<body>

<div class="container">
	<div class="col-lg-5">
		
		<div class="form-group">
		<s:hidden name="usuario.id"></s:hidden>
			<input type="text" name="fecha" id="fecha" class="form-control input-sm" placeholder="Fecha">
		</div>
		<div class="form-group">
			<input type="text" name="contenido" id="contenido" class="form-control input-sm" placeholder="Contenido">
		</div>
		<button onclick="registerComment();" type="button" class="btn btn-success btn-block">Register</button>
		<div class="text-center" id="resp" style="margin-top: 14px;"></div>
	</div>
  <div class="row justify-content-center mb-2">
    <div class="col-md-10 col-lg-8 aling-self-center">
      <form action="#" class="d-flex justify-content-end flex-wrap">
        <textarea class="form-control" rows="5" id="comment" name="text" placeholder="Comentario"></textarea>
        <button type="submit" class="btn btn-primary">Comentar</button>
      </form>
    </div>
  </div>
  <div class="row justify-content-center mb-2">
    <div class="col-md-9 col-lg-9 align-self-center">
    <div class="media-12 border p-2">
      <img src="img_avatar1.png" class="mr-3 mt-3 rounded-circle" style="width:45px">
      <div class="media-body">
        <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
        <div class="text-rigth">
          <a href="#">Responder</a>
          <a href="#">Editar</a>
          <a href="#">Borrar</a>
        </div>
        <!-- Nested media object -->
        <div class="media p-2">
          <img src="img_avatar2.png"  class="mr-3 mt-3 rounded-circle" style="width:45px">
          <div class="media-body">
            <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            <div class="text-rigth">
              <a href="#">Responder</a>
              <a href="#">Editar</a>
              <a href="#">Borrar</a>
            </div>
          </div>
        </div>

        <!-- Nested media object -->
        <div class="media p-2">
          <img src="img_avatar2.png"  class="mr-3 mt-3 rounded-circle" style="width:45px">
          <div class="media-body">
            <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
            <div class="text-rigth">
              <a href="#">Responder</a>
              <a href="#">Editar</a>
              <a href="#">Borrar</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="col-md-3 col-lg-3 d-none d-md-block">
  <img src = "images/ad.png" style="width:75%; height:100%"/>

  </div>
  </div>
  <div class="row justify-content-center mb-2">
    <div class="col-md-10 align-self-center">
      <div class="media-12 border p-2">
        <img src="img_avatar1.png" class="mr-3 mt-3 rounded-circle" style="width:45px">
        <div class="media-body">
          <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
          <div class="text-rigth">
            <a href="#">Responder</a>
            <a href="#">Editar</a>
            <a href="#">Borrar</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>

