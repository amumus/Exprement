<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>模拟前图片</td>
<td>模拟后图片</td>
<tr/>
<tr>
<td><img src="/upload/${requestScope.simulatColorBlindnessObject.image.originalFilename}"></td>
<td><a href="download?filename=${requestScope.newFilename}">
<img src="/upload/${requestScope.newFilename}">
</a></td>
<tr/>
<tr>
<td>&nbsp</td>
<td>
<a href="download?filename=${requestScope.newFilename}">
	点击下载模拟后的图片
</a>
</td>
<tr/>
</table>
</body>
</html>