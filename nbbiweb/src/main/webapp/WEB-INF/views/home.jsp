<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
	<title>NBBi</title>
	<script type="text/javascript"
		SRC="/nbbiweb/resources/applet/marvin-bin-6.1.6/marvin.js"></script>
	<script type="text/javascript" src="/nbbiweb/resources/js/jquery-1.8.0.js"></script>
	<script type="text/javascript">
	
	$("#search_exact").live('click', function(){
		var smiles = document.MSketch.getMol('smiles');
		/* var divPoint = inchi_full.indexOf("\n");
		var inchi = inchi_full.substring(0, divPoint); */
		$('#smiles').val(smiles);
		$("#molSearchForm").attr({
			method:"post",
			action:"/nbbiweb/exactSearch",
		}).submit();
	});
	
	$("#search_chembl").live('click', function(){
		var id = $("#chembltxt").val();
		$('#chembl_id').val(id);
		$("#molSearchForm").attr({
			method:"post",
			action:"/nbbiweb/chemblSearch",
		}).submit();
	});
	
	</script>	
		
</head>
<body>
	<h1>NBBi Web Service</h1>
	<form id="molSearchForm" name="molSearchForm">
		<input id="smiles" type="hidden" name="smiles">
		<input id="chembl_id" type="hidden" name="chembl_id">
		<script type="text/javascript">
			msketch_name = "MSketch";
			msketch_begin("/nbbiweb/resources/applet/marvin-bin-6.1.6", 540, 480);
			msketch_end();
		</script>
		<br />
		<input id="search_exact" type="button" value="Exact Search">
		<input id="search_sub" type="button" value="Substructure Search">
		<br />
		<label for="chembltxt">Chembl ID : </label>
		<input id="chembltxt" type="text">
		<input id="search_chembl" type="button" value="Search">
	</form>
</body>
</html>
