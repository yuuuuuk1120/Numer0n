package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Player2
 */
@WebServlet("/player2")
public class Player2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Player2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pname1 = request.getParameter("name");
        String p1 = String.valueOf(request.getParameter("player1"));


        if (p1.charAt(0) == p1.charAt(1) || p1.charAt(0) == p1.charAt(2) || p1.charAt(1) == p1.charAt(2)) {
            String error = "数字が重複しています。";
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/top/player1.jsp");
            rd.forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("pname1", pname1);
            session.setAttribute("p1", p1);

            //HttpSession session = request.getSession();
            //session.setAttribute("pname1", pname1);
            //session.setAttribute("p1", p1);

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/top/player2.jsp");
            rd.forward(request, response);
        }
    }

}
