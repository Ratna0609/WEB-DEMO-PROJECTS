<%@page isELIgnored="false"%>
<html>
<body bgcolor="Yellow">
	<center>

		<marquee>New Batch Is Comming Soon</marquee>
		<marquee>WE ARE HIRING</marquee>
		<h1>Java Experts Support Portal</h1>
		<h2>Registration form</h2>
		<font color=red size=5>${MSG}</font>
		<form action="register" method="post">
			<table>


				<tr>
					<td>FullName</td>
					<td><input type="text" name="fname" required="required" /></td>
				</tr>


				<tr>
					<td>Email id</td>
					<td><input type="text" name="email" required="required" /></td>
				</tr>

				<tr>
					<td>phone</td>
					<td><input type="text" name="phone" required="required" /></td>
				</tr>

				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" required="required" /></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required="required" /></td>
				</tr>

				<tr>
					<td colspan="2" allign="center"><input type="submit"
						value="Register" /></td>
				</tr>


			</table>
		</form>
	</center>
</body>
</html>