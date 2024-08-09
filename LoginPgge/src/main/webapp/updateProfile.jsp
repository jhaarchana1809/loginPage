<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
<style>

a {
        display: inline-block;
        margin: 10px 0;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: purple;
    }

</style>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
%>
<a href="view">View Profile</a>
<a href="logout">Log Out</a>
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