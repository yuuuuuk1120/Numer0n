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
@WebServlet("/numeron2")
public class Numeron2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Numeron2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String n1 = String.valueOf(request.getParameter("playerAnticipation1"));
        HttpSession session = request.getSession();
        session.setAttribute("n1", n1);

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/game/nume2.jsp");
        rd.forward(request, response);
    }

}
