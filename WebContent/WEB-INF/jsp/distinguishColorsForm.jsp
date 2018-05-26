<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action=distinguishColorsDeal enctype="multipart/form-data" method="post">
	<table align="center">
		<tr>
			<td>选择要识颜色的图片：</td>
			<td><input type="file" name="file"/></td>
		</tr>
		<tr>
			<td><input type ="submit" value="上传并识别"/></td>
		</tr>
	</table>
</form>
</center>
</body>
</html>