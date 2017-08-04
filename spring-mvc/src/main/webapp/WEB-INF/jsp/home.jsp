<%@page import="com.cgj.spring.mvc.entity.User"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    Hello Spring MVC!
    <br /> My name is Guangjin.chen!
    <br /> 当前在线用户人数：${userCount}
    <br />
    <%
        @SuppressWarnings("unchecked")
        Map<String, User> userMap = (Map<String, User>) request.getServletContext().getAttribute("userMap");
        if (userMap != null) {
            for (User user : userMap.values()) {
    %>
    IP:<%=user.getIp()%>, firstTime:<%=user.getFristTime()%>, sessionId:<%=user.getSessionId()%>
    <br />
    <%
        }
        }
    %>
</body>
</html>