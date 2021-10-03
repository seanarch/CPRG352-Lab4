<%-- 
    Document   : viewnote
    Created on : Oct 2, 2021, 4:48:02 PM
    Author     : seanz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            ${note.noteTitle}
        <br></p>
        <p><b>Contents: </b>
        ${note.noteContent}
        <p><a href="note?edit">Edit</a></p>
        </div>
    </body>
</html>
