<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<body>

<form:form action="showDetails" modelAttribute="emp">
    <br>
    name <form:input path="name"/>
    <br>
    surname <form:input path="surname"/>
    <br>
    salary< form:input path="salary"/>
    <br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>