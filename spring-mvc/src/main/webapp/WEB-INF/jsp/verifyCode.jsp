<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <form action="/verify/code/verify" method="post">
        验证码：<input type="text" name="verifyCode" style="height: 32px;vertical-align: middle;" />
        <img alt="验证码" src="/verify/code/img" style="vertical-align: middle;" onclick="window.location.href='/verify/code/page'"/>
        <input type="submit"/>
   </form>
</div>
</body>
</html>