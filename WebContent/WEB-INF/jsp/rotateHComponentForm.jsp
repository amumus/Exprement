<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RotateHComponentDeal" enctype="multipart/form-data" method="post">
	<table  align="center"> 
		<tr>
			<td>H分量旋转系数：</td>
			<td><input type="text" name="H_Component" value="120"/></td>
		</tr>
		<tr>
			<td>选择需要矫正的图片：</td>
			<td><input type="file" name="image"/></td>
		</tr>
		<tr>
			<td><input type ="submit" value="上传并矫正"/></td>
		</tr>
		<tr>
			<td>注:据研究当旋转度数为90到140时能够得到较为舒服的结果，默认为120</td>
		</tr>
	</table>
</form>

</body>
</html>