<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>

</head>
<body>
<center>
<form action=distinguishTrafficLightDeal enctype="multipart/form-data" method="post">
	<table align="center">
		<tr><td>选择识别类型:</td><tr/>
		<tr><td>识别出红灯:<input type="radio" name="type" value="red" checked></td></tr>
		<tr><td>识别出绿灯:<input type="radio" name="type" value="green"></td></tr>
		<tr><td>识别出红绿灯:<input type="radio" name="type" value="red and green"></td></tr>
		<tr>
			<td>选择要识别红绿灯的图片：</td>
			<td><input type="file" name="image"/></td>
		</tr>
		<tr>
			<td><input type ="submit" value="上传并识别"/></td>
		</tr>
		<tr><td>注意:红灯用蓝色线条框住，绿灯用黄色线条框住</td></tr>
	</table>
</form>
</center>
</body>
</html>