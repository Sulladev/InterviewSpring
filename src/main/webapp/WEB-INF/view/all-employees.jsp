<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Students</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="stud" items="${allStudents}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="studId" value="${stud.id}"> </c:param>
        </c:url>

        <c:url var="deleteButton" value="/deleteStudent">
            <c:param name="studId" value="${stud.id}"> </c:param>
        </c:url>

        <tr>
            <td>${stud.name}</td>
            <td>${stud.age}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'">
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>

</table>

<br>

<input type="button" value="Add" onclick="window.location.href = 'add'"/>
</body>
</html>