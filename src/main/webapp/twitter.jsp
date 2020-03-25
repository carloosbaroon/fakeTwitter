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
		
		var contenido = $("#contenido").val();
		var id = $("#idUsuario").val();
		var nombre = $("#nameUsuario").val();
		console.log(id);
		console.log(nombre);
		$.ajax({
			type : "POST",
			url : "registercomment.action",
			data : "contenido=" + contenido + "&id=" + id + "&nombre=" + nombre,
			success : function(data) {
				var ht = data.msg;
				$("#resp").html(ht);
			},
			error : function(data) {
				alert("Some error occured.");
			}
		});
	}
	
	function report() {		
		$.ajax({			
			type:"GET",
			url:"report.action",
			success: function(result){
				var tblData="";
				$.each(result.beanList, function() {					
					tblData += 
				    
					   " <div class='media-12 border p-2'>" +
					        "<img src='img_avatar1.png' class='mr-3 mt-3 rounded-circle' style='width:45px'>" +
					       " <div class='media-body'>" + 
					          "<h4>" + this.id_usuario + "<small><i> Posted on " +  this.date + "</i></small></h4> "+
					         " <p>" +this.contenido + "</p>"+ 
					         " <div class='text-rigth'>" +
					         "<button onclick='fetchOldRecord(this);' class='btn btn-sm btn-info' data-toggle='modal' data-target='#updateModal'>Update</button>"+ 
					            "<a href='#'>Editar</a>"+
					            "<a href='#'>Borrar</a>"+
					           "</div>"+
					       " </div>"+
					      "</div>";
					    
					  
				});
				$("#container").html(tblData);
			},
			error: function(result){
				alert("Some error occured.");
			}
		});
	}
	
	function updateNewRecord() {
		
		var id_comentario = $("#idComentario").val();
		$.ajax({
			type:"POST",
			url:"updatecomment.action",
			data:"contenido="+$("#contenido").val()+ "&id_comentario=" + id_comentario,
            success:function(result){
            	var ht= result.msg;
    			$("#resp").html(ht);
            },
            error: function(result){
            	alert("Some error occured.");
            }
		});	
	}	
</script>
<script>
</script>
</head>
<body onload="report();" >


	

<div class="container">
	
	
	<div class="row justify-content-center mb-2">
    	<div class="col-md-10 col-lg-8 aling-self-center">
      		<form action="#" class="d-flex justify-content-end flex-wrap">
        		<textarea class="form-control" rows="5" id="comment" name="text" placeholder="Comentario"></textarea>
        		<button type="button" data-toggle="modal" data-target="#myModal">Comentar</button>
     		</form>
    </div>
  </div>
 
  <div class="row justify-content-center mb-2" >
    <div class="col-md-9 col-lg-9 align-self-center" id="container" >
    <div class="media-12 border p-2">
      <img src="img_avatar1.png" class="mr-3 mt-3 rounded-circle" style="width:45px">
      <div class="media-body">
        <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
        <div class="text-rigth">
          <button type="button" data-toggle="modal" data-target="#myModal">Responder</button>
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
    <div class="col-md-10 col-lg-10 align-self-center">
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
  
  
   <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div  class="modal-dialog modal-lg">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Agregar respuestas</h4>
        </div>
        <div class="modal-body">
          
         <div class="row justify-content-center mb-2">
          <div class="col-md-10 col-lg-8 aling-self-center">
		
			<div class="form-group">
			<s:hidden id="idUsuario" name="usuario.id_usuario"></s:hidden>

			<div class="form-group">
			<s:hidden id="idComentario" name="comentario.id_comentario"></s:hidden>
				
			</div>

			<s:hidden id="nameUsuario" name="usuario.name"></s:hidden>

				
			</div>
			<div class="form-group">
			 <textarea class="form-control" rows="5" id="contenido" name="contenido" placeholder="Comentario"></textarea>
				
			</div>
			<button onclick="registerComment();" type="button" class="btn btn-success btn-block">Register</button>
			<div class="text-center" id="resp" style="margin-top: 14px;"></div>
	      </div>
          
          
          
           		
        </div>
       </div>
        
        
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        </div>
      </div>
      
    </div>
  </div>
  <!-- Fin primer Modal -->
  
  <div class="container" id="updateBlock">
		<div class="modal fade" id="updateModal" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h4 class="modal-title">Update New Information</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6">
								<div class="form-group">
									<input type="text" name="contenido" id="contenido" class="form-control input-sm" placeholder="Contenido">
								</div>
							</div>
							
						<button onclick="updateNewRecord();" class="btn btn-info btn-block">Update</button>
						<div id="resp" class="text-center" style="margin-top: 13px;"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

  
  
</div>
  

	</div>

</div>

</body>
</html>

