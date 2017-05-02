<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setAttribute("requstName", "request");
    request.getSession().setAttribute("sessionName", "session");
    request.getSession().getServletContext().setAttribute("contextName", "context");
    request.getSession().setAttribute("currentUser", new com.cgj.spring.mvc.entity.User());
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Init attribute page!</title>
</head>
<body>
<button onclick="location.href='<%=request.getContextPath() %>/hello/init'">Init</button>
<button onclick="location.href='<%=request.getContextPath() %>/hello/destroyed'">Destroyed</button>
</body>
</html>