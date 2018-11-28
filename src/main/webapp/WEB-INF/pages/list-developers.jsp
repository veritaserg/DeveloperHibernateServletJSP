<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Developer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <meta content="text/html; charset=UTF-8">
    <title>All developers</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
</head>

<body>
<div class="wrapper">
    <div class="container">
        <div class="block block-table">
            <h4>List of all developers</h4>

            <tbody>
            <% List<Developer> developers = (ArrayList<Developer>) request.getAttribute("developers");
                for (Developer developer : developers) {
                    out.print("ID: " + developer.getId());
                    out.print("<br/>");
                    out.print("FirstName: " + developer.getFirstName());
                    out.print("<br/>");
                    out.print("LastName: " + developer.getLastName());
                    out.print("<br/>");
                    out.print("Account: " + developer.getAccount());
                    out.print("<br/>");
                    out.print("Skill: " + developer.getSkills());

                    out.print("<br/>");
                    out.print("<br/>");
                }%>
            </tbody>
        </div>
    </div>
</div>
</body>
</html>