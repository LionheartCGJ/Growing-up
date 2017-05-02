<html>
<body>
<h2>Hello World!</h2>
<button onclick="location.href='<%=request.getContextPath() %>/hello/init'">Init</button>
<button onclick="location.href='<%=request.getContextPath() %>/hello/destroyed'">Destroyed</button>
</body>
</html>
