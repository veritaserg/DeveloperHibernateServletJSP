
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<div class="jumbotron text-center">
    <h1>MVC Application</h1>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm">
            <h3>Developer</h3>
        </div>
    </div>
    </div>
    <div class="row">


        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">Add developer</a>

    </div>

        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">Edit developer</a>
        </div>
        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">Edit project</a>
        </div>

    </div>
    <div class="row">

        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">Delete developer</a>
        </div>

    </div>

        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">List developers</a>
        </div>
    </div>
</div>

</body>
</html>
