<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>バーガーキングランダム注文</title>
</head>
<body>
<form action="/burger/RandomOrder" method="post">
<p>予算を入力することで、商品をランダムに選択して注文できます。</p>
予算を入力<br>
<input type="number" name="budget">（円）<br>
<input type="submit" value="オーダー生成">
</form>

</body>
</html>