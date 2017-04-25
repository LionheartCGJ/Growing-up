<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Demo</title>
</head>
<body>
    <!-- enctype="multipart/from-data"属性是完成文件上传所必需的 -->
    <div align="center">
        <h1>File Upload</h1>
        <form action="/hello/upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file" />
            <input type="submit">
        </form>
    </div>
</body>
</html>