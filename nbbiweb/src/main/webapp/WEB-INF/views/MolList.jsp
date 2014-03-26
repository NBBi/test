<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="molecule list">
		<tr align="center">
			<th width="200px">Structure</th>
			<th width="200px">Remark</th>
		</tr>
		<c:forEach items="${molInfoList}" var="list">
			<tr>
				<td><script type="text/javascript">
					mview_begin("/nbbiview/resources/applet/marvin-bin-6.1.6",
							200, 90);
					mview_param("rows", "1");
					mview_param("cols", "1");
					mview_param("cell0", "|${list.inchi}\n");
					mview_end();
				</script></td>
				<td>${list.standard_inchi }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>