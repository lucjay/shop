<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function trSelect(key) {
		document.frm.bid.value = key;
		document.frm.submit();
	}
</script>
</head>
<body>

	<div id="wrapp" align="center">
		<form id="frm" name="frm" action="boardgetList.do" method="post">
			<div>
				<h1>Board List</h1>
			</div>
			<div>
				<table border="1">
					<tr>
						<td width="70">No</td>
						<td width="100">Writer</td>
						<td>Title</td>
						<td>Hit</td>
						<td>file</td>
					</tr>
					<c:forEach var="vo" items="${board}">
						<tr onclick="trSelect(${vo.boardId})">
							<td>${vo.boardId}</td>
							<td>${vo.writer }</td>
							<td>${vo.title }</td>
							<td>${vo.hit }</td>
							<td>${vo.fileName }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div>
				<button type="button" onclick="location.href='boardInputForm.do'">글쓰기</button>
			</div>
			<input type="hidden" id="bid" name="bid">

		</form>
		<input>
	</div>
</body>
</html>