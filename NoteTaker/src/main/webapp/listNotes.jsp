<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All notes: Note Taker</title>
    <%@include file="all_js_css.jsp"%>
</head>
<body>
    <div class="container">
        <%@include file="navbar.jsp"%>
        <br>
        <h1 class="text-uppercase">All Notes:</h1>
        <div class="row">
            <div class="col-12">
                <c:forEach var="note" items="${notesList}">
                    <div class="card mt-3">
                        <!-- Display note details here using ${note.propertyName} -->
                        <div class="card-body px-5">
                            <h5 class="card-title">${note.title}</h5>
                            <p class="card-text">${note.content}</p>
                            <p><b class="text-primary">${note.addedDate}</b></p>
                            <div class="container text-center mt-2">
                                <a href="DeleteServlet?note_id=${note.id}" class="btn btn-danger">Delete</a>
                                <a href="edit.jsp?note_id=${note.id}" class="btn btn-primary">Update</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>
