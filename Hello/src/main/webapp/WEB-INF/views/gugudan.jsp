<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<h1 style="text-align:center">구구단</h1>
<div style="text-align:center">
	<%
		for(int i=1; i<10; i++){
	%>
	<ul style="list-style:none; display:inline-block; padding:0 1.5%;">	
	<%
			for(int j=1; j<10; j++){
	%>
			<li><p><%=i%> X <%=j%> = <%=i*j%></p></li>
	<% 		
			}
	%>
	</ul>
	<% 
		}
	%>
</div>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
