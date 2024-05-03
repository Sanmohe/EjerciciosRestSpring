<!-- Este JSP debe llamarse como se ha indicado en el RETURN del método que devuelve la respuesta -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario completado</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/estilo.css">
</head>
<body>

	<p>
	Hola ${param.nombreIntroducido}
		<!-- ${param.nombreIntroducido} hace referencia al id (NAME) del campo del formulario -->
	</p>
	
	<br>
	
	<h2>ATENCIÓN</h2>
	
	<p>
	${mensajeRespuesta}
		<!-- Llama al ID del atributo que añadimos en el modelo -->
	</p>
	
	<br>
	
	<img alt="logoEviden" src="${pageContext.request.contextPath}/recursos/eviden.jpg">
		<!-- ${pageContext.request.contextPath} indica la raiz del sitio web -->
		<!-- A continuacion se indica la ruta del recurso -->
	
	
	
</body>
</html>