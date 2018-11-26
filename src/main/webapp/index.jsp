<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Database Developers</title>
</head>
<body>

<div class="jumbotron text-center">
    <h1>Database Developers</h1>
</div>

<div class="container">
    <div class="row">
                <div class="col-sm">
            <h3>Developer</h3>
        </div>
        <div class="col-sm">
            <h3>Account</h3>
        </div>
        <div class="col-sm">
            <h3>Skill</h3>
        </div>
    </div>
    <div class="row">

        <div class="col-sm">
            <a href="/WEB-INF/pages/add-developer.jsp">Add developer</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/add-project">Add account</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/add-skill">Add skill</a>
        </div>
    </div>
    <div class="row">

        <div class="col-sm">
            <a href="/MyWebApp/edit-developer">Edit developer</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/edit-project">Edit account</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/edit-skill">Edit skill</a>
        </div>
    </div>
    <div class="row">

        <div class="col-sm">
            <a href="/MyWebApp/delete-developer">Delete developer</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/delete-project">Delete account</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/delete-skill">Delete skill</a>
        </div>
    </div>
    <div class="row">

        <div class="col-sm">
            <a href="/MyWebApp/list-developers">List developers</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/list-projects">List account</a>
        </div>
        <div class="col-sm">
            <a href="/MyWebApp/list-skills">List skills</a>
        </div>
    </div>
</div>
</body>
</html>
