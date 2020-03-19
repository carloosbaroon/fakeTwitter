<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class="container">
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
  <div class="col-md-2 col-lg-3 d-none d-sm-block d-sm-none d-md-block">
  	<img src="ad.png" style="width:75%;height:100%"/>
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

