<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
int empid = Integer.parseInt(request.getParameter("id"));
String driverName = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/";
String dbName = "new1";
String userId = "root";
String password = "";

try {
	Class.forName(driverName);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center">
	<font><strong style="position: absolute;top: 28%;left: 13%;color: #d7213a;font-family: cursive;font-size: 35px;">DETAILS OF THE EMPLOYEE:</strong></font>
</h2>
<table align="center" cellpadding="20"  style="position: absolute;top: 40%;left: 10%;" >
	<tr>

	</tr>
	<tr bgcolor="#5bc0de" style="border: none;font-size: 20px;" >
		<td ><b>Emp ID</b></td>
		<td><b>Name</b></td>
		<td><b>Email</b></td>
		<td><b>DOB</b></td>
	</tr>
	<%
	try {
		connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
		statement = connection.createStatement();
		String sql = "SELECT * FROM employees where empid=" + empid;
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
	%>
	<tr style="font-size: 20px;" >

		<td><b><% out.print(empid); %></b></td>
		<td><b><%=resultSet.getString("name")%></b></td>
		<td><b><%=resultSet.getString("email")%></b></td>
		<td><b><%=resultSet.getString("dob")%></b></td>

	</tr>

	<%
		 }

	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
</table>