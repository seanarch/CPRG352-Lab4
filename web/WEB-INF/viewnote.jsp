<%-- 
    Document   : viewnote
    Created on : Oct 2, 2021, 4:48:02 PM
    Author     : seanz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
        <p><b>Title: </b> 
        <p name="noteTitle">
            ${note.title}</p>
        <br></p>
        <p><b>Contents: </b>
        <p name="noteContent">
            ${note.content}</p>
        <p><a href="note?edit">Edit</a></p>
        </div>
    </body>
</html>
