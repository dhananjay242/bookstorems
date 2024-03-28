<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>My Bookstore</title>
<!-- <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet"> -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="mycss/bookstore.css" rel="stylesheet">
</head>
<body>
	<div class="card">
		<c:import url="myheader.jsp" />
	</div>
	<h2>
		<a href="showAllBooks">Display All Books</a>
	</h2>
	<c:import url="myfooter.jsp" />
</body>
</html>