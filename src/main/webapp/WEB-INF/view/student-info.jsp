<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Student Info</h2>
<br>
<form:form action="saveStudent" modelAttribute="student">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Age <form:input path="age"/>
    <br><br>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>