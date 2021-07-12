<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Displaying</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<table>

<h2>Customer List</h2>
<table>
    <tr>
        <th>Company</th>
        <th>Contact</th>
        <th>Country</th>
    </tr>
<!-- Dùng for để duyệt trên các phòng ban (departments) -->
    <c:forEach items="${Customer}" var="customer">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getAddress()}</td>
            <td>${customer.getBirthDate()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>