package ua.nure.strebkov.Practice9;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/calc")
public class Part1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String x = request.getParameter("x");
        String y = request.getParameter("y");
        String op = request.getParameter("op");
        String res = "";
        if (op.equals("minus")) {
            res = String.valueOf(Integer.parseInt(x) - Integer.parseInt(y));
        }else if (op.equals("plus")){
            res = String.valueOf(Integer.parseInt(x) + Integer.parseInt(y));
        }

        request.setAttribute("res", res);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body><p>" + res + "</p></body></html>");

   //     RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
   //     rd.forward(request, response);

    }
}
