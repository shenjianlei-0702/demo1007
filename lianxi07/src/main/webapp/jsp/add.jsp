<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/add" method="post">
        <p>类型:
            <input type="radio" name="typeid" checked />支出
            <input type="radio" name="typeid" />收入
            <input type="radio" name="typeid" />转账
            <input type="radio" name="typeid" />借出
            <input type="radio" name="typeid" />借入
            <input type="radio" name="typeid" />还入
            <input type="radio" name="typeid" />还出
        </p>

        <p>标题:<input type="text" name="title"  /></p>
        <p>日期:<input type="text" name="billtime" />金额:<input type="text" name="price" /></p>
        <p>说明:<textarea name="explains" cols="20px" rows="5px"></textarea></p>
        <p><input type="reset" value="重置" /><input type="submit" value="提交" /><input type="button" value="返回" /></p>
    </form>

</body>
</html>
