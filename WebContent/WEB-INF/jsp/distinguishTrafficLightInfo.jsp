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
<tr><td>注意:红灯用蓝色线条框住，绿灯用黄色线条框住</td></tr>
<tr>
<td>识别前图像：</td>
<td>识别后图像：</td>
<tr/>
<tr>
<td>
<img src="/upload/${requestScope.distinguishTrafficLightObject.image.originalFilename}">
</td>
<td>
<a href="download?filename=${requestScope.newFilename}">
<img src="/upload/${requestScope.newFilename}">
</a>
</td>
</tr>
<tr>
<td>&nbsp</td>
<td>
<a href="download?filename=${requestScope.newFilename}">
	点击此下载识别后的图片</a></td></tr>
</table>





</body>
</html>