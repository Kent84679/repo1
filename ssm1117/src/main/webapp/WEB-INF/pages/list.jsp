<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/17
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="book">
    ${book.id}
    ${book.book_name}
    ${book.book_num}
    ${book.book_price}
    ${book.open_date}
    <br/>

</c:forEach>

</body>
</html>
