package Servlets;
/**
 *
 * @author 809882
 */
import Models.User;
import Services.AccountService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession session = request.getSession();
        
            if (request.getParameter("logout") != null) {
                //delete session and display message to user that they have logged out
                session.invalidate();
                request.setAttribute("alert", "User logged out");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
            
            else {
                 getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }


}
