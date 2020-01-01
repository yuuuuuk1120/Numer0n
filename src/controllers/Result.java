package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/result")
public class Result extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //String p1 = String.valueOf(request.getParameter("player1"));
        //String p2 = String.valueOf(request.getParameter("player2"));
        //String n1 = String.valueOf(request.getParameter("playerAnticipation1"));
        //request.getAttribute("n1");
        String p1 = (String)request.getSession().getAttribute("p1");
        String p2 = (String)request.getSession().getAttribute("p2");
        String n1 = (String)request.getSession().getAttribute("n1");

        String n2 = String.valueOf(request.getParameter("playerAnticipation2"));
        request.setAttribute("n2", n2);

        int h1 = 0;//プレイヤー1のイート
        if (p1.charAt(0) == n2.charAt(0))
            h1++;
        if (p1.charAt(1) == n2.charAt(1))
            h1++;
        if (p1.charAt(2) == n2.charAt(2))
            h1++;
        request.setAttribute("h1", h1);

        int h2 = 0;//プレイヤー2のイート
        if (p2.charAt(0) == n1.charAt(0))
            h2++;
        if (p2.charAt(1) == n1.charAt(1))
            h2++;
        if (p2.charAt(2) == n1.charAt(2))
            h2++;
        request.setAttribute("h2", h2);

        int b1 = 0;//プレイヤー1のバイト
        if (p1.charAt(0) == n2.charAt(1) || p1.charAt(0) == n2.charAt(2))
            b1++;
        if (p1.charAt(1) == n2.charAt(0) || p1.charAt(1) == n2.charAt(2))
            b1++;
        if (p1.charAt(2) == n2.charAt(0) || p1.charAt(2) == n2.charAt(1))
            b1++;
        request.setAttribute("b1", b1);

        int b2 = 0;//プレイヤー2のバイト
        if (p2.charAt(0) == n1.charAt(1) || p2.charAt(0) == n1.charAt(2))
            b2++;
        if (p2.charAt(1) == n1.charAt(0) || p2.charAt(1) == n1.charAt(2))
            b2++;
        if (p2.charAt(2) == n1.charAt(0) || p2.charAt(2) == n1.charAt(1))
            b2++;
        request.setAttribute("b2", b2);

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/game/result.jsp");
        rd.forward(request, response);
    }

}
