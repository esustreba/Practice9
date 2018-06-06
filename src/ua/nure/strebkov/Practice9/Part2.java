package ua.nure.strebkov.Practice9;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/ask")
public class Part2 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, Integer> map = new HashMap<>();
        map.put("foot", 12);
        map.put("biat", 10);
        map.put("bask", 1);
        String foot = request.getParameter("foot");
        String biat = request.getParameter("biat");
        String bask = request.getParameter("bask");
        String res = "";

        request.setAttribute("foot", request.getParameter("foot"));
        request.setAttribute("biat", request.getParameter("biat"));
        request.setAttribute("bask", request.getParameter("bask"));

        request.setAttribute("map", map);

        RequestDispatcher rd = request.getRequestDispatcher("tableAsk.jsp");
        rd.forward(request, response);

    }


}