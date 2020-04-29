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
		<h1>Join Us</h1>
		<form action="memberJoinOk.do" id="frm" name="frm" method="post">
			<table>
				<tr>
					<th width="150">Register No.</th>
					<td><input type="text" id="mRegister" name="mRegister"
						placeholder="123-45-678910"></td>
				</tr>
				<tr>
					<th>ID</th>
					<td><input type="text" id="madminId" name="madminId"
						placeholder="ID"></td>
				</tr>
				<tr>
					<th>Company Name</th>
					<td><input type="text" id="mName" name="mName"
						placeholder="Company Name"></td>
				</tr>
				<tr>
					<th>Ceo Name</th>
					<td><input type="text" id="mCeo" name="mCeo"
						placeholder="Ceo Name"></td>
				</tr>
				<tr>
					<th>Business Type</th>
					<td><input type="text" id="mBusinessType" name="mBusinessType"
						placeholder="Business Type"></td>
				</tr>
				<tr>
					<th>Business Cate</th>
					<td><input type="text" id="mBusinessCategory"
						name="mBusinessCategory" placeholder="Business Category"></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><input type="text" id="mAddress" name="mAddress"
						placeholder="Address"></td>
				</tr>
				<tr>
					<th>Tel</th>
					<td><input type="text" id="mTel" name="mTel"
						placeholder="Company Tel"></td>
				</tr>
				<tr>
					<th>Mobile</th>
					<td><input type="text" id="mMobile" name="mMobile"
						placeholder="123-4567-8910"></td>
				</tr>
				<tr>
					<th>Email</th>
					<td><input type="text" id="mEmail" name="mEmail"
						placeholder="Email"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" id="mAdminPasword"
						name="mAdminPasword"></td>
				</tr>
				<tr>
					<th>Password Check</th>
					<td><input type="password" id="password" name="password"></td>
				</tr>
			</table>

			<div>
				<br /> <input type="submit" value="sign in"> <input
					type="reset" value="reset">

			</div>
		</form>
	</div>
</body>
</html>