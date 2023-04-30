<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <title>Welcome Page</title>
    </head>
    <body>
    <div class="container">
    <h1> Welcome </h1>

        <table class="table">
            <thead>
                <tr>
                    <th>id</th>
                    <th>desc</th>
                    <th>date</th>
                    <th>done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <th>${todo.id}</th>
                        <th>${todo.description}</th>
                        <th>${todo.targetDate}</th>
                        <th>${todo.done}</th>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success"> Add TODO </a>
       </div>
    </body>
</html>