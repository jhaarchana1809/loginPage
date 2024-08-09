<%@page import="loginpage.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 20px;
        padding: 20px;
    }
    form {
        background-color: #ffffff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
        margin: auto;
    }
    input[type="text"], input[type="email"], input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<% 
String fname=request.getParameter("fname");
UserBean ub=(UserBean)application.getAttribute("ubean");
%>
<form action="update" method="post">

Address : <input type="text" name="address" value=<%=ub.getAddress() %>><br>
Email : <input type="email" name="email" value=<%=ub.getEmail() %>><br>
Phone No. : <input type="number" name="phno" value=<%=ub.getPhno() %>><br>
<input type="submit" name="update" value="Update Profile">

</form>
</body>
</html>