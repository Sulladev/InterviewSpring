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
    </tr>

    <c:forEach var="stud" items="${allStudents}">
        <tr>
            <td>${stud.name}</td>
            <td>${stud.age}</td>
        </tr>
    </c:forEach>

</table>



</body>




</html>