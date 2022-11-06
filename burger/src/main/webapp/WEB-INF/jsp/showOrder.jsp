<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
<% Order order = (Order)request.getAttribute("order"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注文表示</title>
</head>
<body>
<h1>あなたの注文</h1>
<p>
<%for(Product p : order.getList()){ %>
	<%= p.getName() %>（<%= p.getPrice() %>円）<br>
<%  } %>
</p>
総計：<%= order.getTotal() %>円<br>
予算：<%= order.getBudget() %>円<br>
<a href="/burger/RandomOrder">戻る</a>

</body>
</html>