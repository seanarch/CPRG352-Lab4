
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String noteTitle = br.readLine();
        String noteContent = br.readLine();
        br.close();
        Note note = new Note(noteTitle, noteContent);
        
        request.setAttribute("note", note);
        
        String editNote = request.getParameter("edit");
        
        if(editNote == null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
            return;
            
        } else if (editNote == "") {
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
            
        }
         
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String titleEdit = request.getParameter("title_edit");
        String contentEdit = request.getParameter("content_edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        pw.print(titleEdit);
        pw.print(contentEdit);
        pw.close();
        
        Note note2 = new Note(titleEdit, contentEdit);
        
        request.setAttribute("note", note2);
        // The request object will be passed through to the JSP by the forward() method.
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        return;
    }
    
    
}
