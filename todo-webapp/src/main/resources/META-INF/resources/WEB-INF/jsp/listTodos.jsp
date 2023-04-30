<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Welcome Page</title>
    </head>
    <body>
    <div> Welcome ${name} </div>

    <div> Welcome ${todos} </div>

        <table>
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
    </body>
</html>