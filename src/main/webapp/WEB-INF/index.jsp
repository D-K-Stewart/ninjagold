<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="align-items:center;margin-top:50px">	
		<h1 style="margin-left:50px">Your Gold: <c:out value="${ninjagold.gold}"/></h1>
		<div class="wrap">	
			
			<div class="box">
				<h1>Farm</h1>
				<h3>(earns 10-20 gold)</h3>
				<form action="/run" method="POST">
					<input name="option" type="hidden" value="farm" />
					<input type="submit" value="Find Gold!" />
				</form>
			</div>
			
			<div class="box">
				<h1>Cave</h1>
				<h3>(earns 5-10 gold)</h3>
				<form action="/run" method="POST">
					<input name="option" type="hidden" value="cave" />
					<input type="submit" value="Find Gold!" />
				</form>
			</div>
			
			<div class="box">
				<h1>House</h1>
				<h3>(earns 2-5 gold)</h3>
				<form action="/run" method="POST">
					<input name="option" type="hidden" value="house" />
					<input type="submit" value="Find Gold!" />
				</form>
			</div>
			
			<div class="box">
				<h1>Casino</h1>
				<h3>(earns 0-50 gold)</h3>
				<form action="/run" method="POST">
					<input name="option" type="hidden" value="casino" />
					<input type="submit" value="Find Gold!" />
				</form>
			</div>
			
		</div>
			<div style="margin-top:30px;margin-left:50px">
				<h1>Activities:</h1>
				<div class="results" style="border:solid">	
					<ul>
						<c:out value="${ninjagold.activity }"/>
					</ul>
				</div>
				<a href="/reset" class="btn btn-primary">Reset</a>
			</div>
	</div>	
		
</body>
</html>