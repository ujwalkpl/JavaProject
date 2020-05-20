

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logout")
public class LogoutController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.setContentType("text/html");
//      PrintWriter out = response.getWriter();
      System.out.println("thanq you!!, Your session was destroyed successfully!!");
      HttpSession session = request.getSession(false);
      // session.setAttribute("user", null);
      session.removeAttribute("user");
      session.removeAttribute("pass");
      session.getMaxInactiveInterval();
      response.sendRedirect("homePage.jsp");
   }
}