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
<h1 style="text-align:center">약수 구하기</h1>
<%
	for(int i=2; i<= 1000; i++){
		boolean bPrime = true;
		for(int j=2; j<i; j++){
			if(i % j == 0){
				bPrime = false;
				break;
			}
		}
		if(bPrime){
			out.print(i + ", ");
		}
	}
%>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
