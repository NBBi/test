<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NBBi</title>
<script type="text/javascript"
		SRC="/nbbiweb/resources/applet/marvin-bin-6.1.6/marvin.js"></script>
</head>
<body>
	<table id="molecule list" border="1">
		<tr align="center">
			<th width="200px">Structure</th>
			<th width="200px">Chembl ID</th>
		</tr>
		<c:forEach items="${molInfoList}" var="list">
			<tr>
				<td height="90px">
				<script type="text/javascript">
					mview_begin("/nbbiweb/resources/applet/marvin-bin-6.1.6",
							200, 90);
					mview_param("rows", "1");
					mview_param("cols", "1");
					mview_param("cell0", "|${list.canonical_smiles}\n");
					mview_end();
				</script>
				</td>
				<td>${list.chembl_id}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>