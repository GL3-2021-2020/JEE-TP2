package web.etudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cs", urlPatterns = { "/etudiantapi" })
public class InsertionEtudiant extends HttpServlet {
    private static final long serialVersionUID = -537651513514806891L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cin = req.getParameter("cin");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        Etudiant et = new Etudiant(cin, name, lastName);
        Etudiant.etudiantList.add(et);
        resp.sendRedirect("etudiantlist");
    }
}