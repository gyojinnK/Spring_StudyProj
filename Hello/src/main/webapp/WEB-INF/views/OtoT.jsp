<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>1to10</title>
</head>
<body>
<h1>Hello World~!</h1>
<h1 style="text-align:center">
	1부터 10까지의 수를 더해보자구!  
</h1>
	<%
	int sum = 0;
	for(int i=1; i<=10; i++){
		sum += i;
	}
	%>
<P style="text-align:center"> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = <%=sum %> </P>
</body>
</html>
