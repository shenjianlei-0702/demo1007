<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/selectAll" method="post">
        类型:
        <select name="typeId">
            <option value="0">请选择</option>
            <c:forEach var="item" items="${billtypes}">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
        时间:从<input type="text" name="time" />到<input type="text" name="time" />
        <input type="submit" value="搜索" /><a href="/jsp/add.jsp"><input type="button" value="记账" /></a>
    </form>

    <table border="1px" width="700px">
        <tr>
            <td>标题</td>
            <td>记账时间</td>
            <td>类别</td>
            <td>金额</td>
            <td>说明</td>
        </tr>

        <c:forEach items="${bills}" var="item">
            <tr>
                <td>${item.title}</td>
                <td>${item.billtime}</td>
                <td>${item.typename}</td>
                <td>${item.price}</td>
                <td>${item.explains}</td>
            </tr>
        </c:forEach>


    </table>

</body>
</html>
