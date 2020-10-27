package web.etudiant;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "show_etudiant", urlPatterns = { "/etudiantlist" })
public class ShowEtudiant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("data", Etudiant.etudiantList);
        RequestDispatcher rd = req.getRequestDispatcher("etudiant/affiche.jsp");
        rd.forward(req, resp);
    }
}
