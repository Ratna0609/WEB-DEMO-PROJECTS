<%@page isELIgnored="false"%>
<html>
<head>
<style>
.myDiv {
  border: 5px outset red;
  background-color: lightblue;    
  text-align: center;
}
</style>
</head>
<body bgcolor="pink">

<div class="myDiv">
  <h1>User Login For Java Expert's</h1>
  <p>java on finger tips</p>
</div>
	<center>
		<marquee>
			<h1>New features launching soon!!!</h1>
		</marquee>
		<h2>Password Reset</h2>
		<font color=red size=5>${MSG}</font>
		<form action="forgotpassword" method="post">
			<table>


				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>


				<tr>
					<td>MobileNumber</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td>Email id</td>
					<td><input type="text" name="email" /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Reset" /></td>
				</tr>


			</table>
		</form>
		<h2>
			<a href="resetpassword.jsp"></a> 
				<!--  || <a href="forgotpassword.jsp"></a> || <a href="delete.jsp">Delete User</a>-->
		</h2> 

			
		</table>
		</form>
	</center>
</body>
</html>