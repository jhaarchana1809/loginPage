
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="loginpage.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Profile</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .profile-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
        text-align: center;
    }
    h1 {
        margin-bottom: 20px;
        color: #333;
    }
    .profile-details {
        text-align: left;
        margin-bottom: 20px;
    }
    .profile-details p {
        margin: 5px 0;
    }
    a {
        display: inline-block;
        margin-top: 10px;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<%
String fn = (String)request.getAttribute("fname");
UserBean ub = (UserBean)application.getAttribute("ubean");
%>

<div class="profile-container">
    <h1>Page belongs to <% out.println(fn); %></h1>
    <div class="profile-details">
        <% 
        out.println("<p><strong>First Name:</strong> " + ub.getFname() + "</p>");
        out.println("<p><strong>Last Name:</strong> " + ub.getLname() + "</p>");
        out.println("<p><strong>Email Id:</strong> " + ub.getEmail() + "</p>");
        out.println("<p><strong>Phone No.:</strong> " + ub.getPhno() + "</p>");
        out.println("<p><strong>Address:</strong> " + ub.getAddress() + "</p>");
        %>
    </div>
    <a href="edit">Edit</a>
    
    <a href="logout">Log Out</a>
</div>

</body>
</html>


 