<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		${vo.boardId} <br />${vo.writer }<br /> ${vo.title } <br />${vo.wDate }
		<br />${vo.contents} <br />
		<input type="button" onclick="location.href='boardList.do'"
			value="목록갈거양">
	</div>
</body>
</html>