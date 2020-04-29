<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="boardInsert.do" id="frm" name="frm">
		<table>
			<tr>
				<td>제목<input type="text" id="title" name="title"></td>
			</tr>
			<tr>
				<td>내용<textarea rows="7" cols="50" id="contents"
						name="contents"></textarea></td>
			</tr>
			<tr>
				<td><input type="file" id="filename" name="filename">파일아직
					넣음안됨ㅋㅋ</td>
			</tr>
		</table>
		<input type="submit" value="저장해보시든지!"> <input type="reset"
			value="취소할고양"> <input type="button"
			onclick="location.href='boardList.do'" value="글목록가염"> <br>
	</form>
</body>
</html>