package web.etudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "show_etudiant", urlPatterns = {"/etudiantlist"})
public class ShowEtudiant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        for (Etudiant it : InsertionEtudiant.etudiantList) {
            out.println("name = " + it.lastName + " lastName = " + it.lastName);
        }
    }
}
