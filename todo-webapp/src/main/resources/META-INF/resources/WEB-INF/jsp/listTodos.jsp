<%@ include file="common/header.jspf" %>

<%@ include file="common/navigation.jspf" %>
    <div class="container">
    <h1> Welcome </h1>

        <table class="table">
            <thead>
                <tr>
                    <th>desc</th>
                    <th>date</th>
                    <th>done?</th>
                    <th>Delete?</th>
                    <th>Update?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
                        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success"> Add TODO </a>
       </div>
<%@ include file="common/footer.jspf" %>
