<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.removeAttribute("requstName");
    request.getSession().removeAttribute("sessionName");
    request.getSession().getServletContext().removeAttribute("contextName");
    request.getSession().removeAttribute("currentUser");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>destroyed attribute page!</title>
</head>
<body>
<button onclick="location.href='<%=request.getContextPath() %>/hello/init'">Init</button>
<button onclick="location.href='<%=request.getContextPath() %>/hello/destroyed'">Destroyed</button>
</body>
</html>