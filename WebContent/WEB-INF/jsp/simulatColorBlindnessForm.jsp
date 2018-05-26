<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="simulatColorBlindnessDeal" enctype="multipart/form-data" method="post">
	<table  align="center">
		<tr><td>选择色盲种类:</td><tr/>
		<tr><td>红色色盲:<input type="radio" name="type" value="r" checked></td></tr>
		<tr><td>绿色色盲:<input type="radio" name="type" value="g"></td></tr>
		<tr><td>蓝色色盲:<input type="radio" name="type" value="b"></td></tr>
		<tr>
			<td>色弱系数：</td>
			<td><input type="text" name="lambda" value="0.0"/></td>
		</tr>
		<tr>
			<td>选择模拟色盲的图片：</td>
			<td><input type="file" name="image"/></td>
		</tr>
		<tr>
			<td><input type ="submit" value="上传"/></td>
		</tr>
	</table>
	<div align="center">注:色弱系数是一个0到1的小数，系数越低色弱越严重，当其为0时就是该颜色色盲，1即为正常人</div>
</form>
</body>
</html>