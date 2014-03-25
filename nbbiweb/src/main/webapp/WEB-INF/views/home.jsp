<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript"
		SRC="/nbbiweb/resources/applet/marvin-bin-6.1.6/marvin.js"></script>
</head>
<body>
	<h1>NBBi Web Service</h1>
	<script type="text/javascript">
		msketch_name = "MSketch";
		msketch_begin("/nbbiweb/resources/applet/marvin-bin-6.1.6", 540, 480);
		msketch_end();
	</script>
	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
