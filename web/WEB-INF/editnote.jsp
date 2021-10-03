<%-- 
    Document   : editnote
    Created on : Oct 2, 2021, 4:47:46 PM
    Author     : seanz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method = "POST" action = "note">
        <div>
        <p><b>Title: </b>
        <input type="text" name="note_title" value = "${note.title}">
            ${note.title}
        <br></p>
        <p><b>Contents: </b>
        <br>
        <textarea name="note_content" value = "${note.content}"></textarea></p>
        ${note.content}
        <p><a href="note?edit">Edit</a></p>
        </div>
        <input type="submit">
        </form>
    </body>
</html>
