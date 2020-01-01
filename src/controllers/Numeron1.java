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
 * Servlet implementation class Numeron1
 */
@WebServlet("/numeron1")
public class Numeron1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Numeron1() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pname2 = request.getParameter("name");
        String p2 = String.valueOf(request.getParameter("player2"));

        if (p2.charAt(0) == p2.charAt(1) || p2.charAt(0) == p2.charAt(2) || p2.charAt(1) == p2.charAt(2)) {
            String error = "数字が重複しています。";
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/top/player2.jsp");
            rd.forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("pname2", pname2);
            session.setAttribute("p2", p2);

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/game/nume1.jsp");
            rd.forward(request, response);
        }
    }

}
