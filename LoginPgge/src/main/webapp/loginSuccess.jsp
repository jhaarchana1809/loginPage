
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="loginpage.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        height: 100vh;
    }
    .container {
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        text-align: center;
        width: 300px;
    }
    .container h1 {
        margin-bottom: 20px;
        color: #333;
    }
    .container p {
        margin-bottom: 20px;
    }
    .container a {
        display: inline-block;
        margin: 10px 0;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    .container a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Welcome</h1>
    <%
    UserBean ub= (UserBean)application.getAttribute("ubean");
    out.println("<p>Welcome : " + ub.getFname() + "</p>");
    String msg=(String)request.getAttribute("msg");
    %>
    <a href="view">View Profile</a>
    <a href="logout">Log Out</a>
</div>

<script type="text/javascript">
window.onload = function() {
    var msg = "<%= msg %>";
    if (msg) {
        confirm(msg);
    }
};
</script>
</body>
</html>

