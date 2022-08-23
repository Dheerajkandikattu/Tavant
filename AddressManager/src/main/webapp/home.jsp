<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
adding.....
<form action="saveaddr">
		<input type="text" name="addr"><br>
		<input type="submit"><br>
	</form>
	
	<br><br>
	Searching......
	<form action="getaddr">
		<input type="text" name="ad"><br>
		<input type="submit"><br>
	</form>
	<br><br>
	similar-search.....
	<form action="getsimilar">
	<input type="text" name="word"><br>
	<input type="submit"><br>
	</form>
</body>
</html>