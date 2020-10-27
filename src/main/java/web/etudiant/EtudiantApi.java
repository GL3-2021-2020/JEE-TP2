package web.etudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "auth", urlPatterns = {"/authapi"})
public class EtudiantApi extends HttpServlet {
	private static final String Valid_email = "wadhah.mahrouk@gmail.com";
    private static final String Valid_password = "123456";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (email.equals(Valid_email) && password.equals(Valid_password))
            resp.sendRedirect("insert.jsp");
        else
            resp.sendRedirect("echec.html");
    }
}