
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author seanz
 */
public class NoteServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // this will have the servlet call upon a JSP to be loaded by the client's browser
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        // stop the code call
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String noteTitle = br.readLine();
        String noteContent = br.readLine();
        
        Note note = new Note(noteTitle, noteContent);
        
        request.setAttribute("note", note);
                
        

        // The request object will be passed through to the JSP by the forward() method.
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        return;
    }
    
    
}
