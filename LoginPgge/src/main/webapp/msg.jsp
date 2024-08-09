<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String msg=(String)request.getAttribute("msg");
%>
<script type="text/javascript">
window.onload = function() {
    var msg = "<%= msg %>";
    if (msg) {
        confirm(msg);
    }
};

</script>

<%@include file="login.html" %>


</body>
</html>