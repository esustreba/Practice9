package ua.nure.strebkov.Practice9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
        String n1 = request.getParameter("txt1");
        String n2 = request.getParameter("txt2");
        String op = request.getParameter("op"); 
        
        System.out.println(request.getParameter("op"));
       
        
        if(op.equals("%2B")){
             System.out.println((Integer.parseInt(n1) + Integer.parseInt(n2)));
        }
        else if(op.equals("-")){
             System.out.println(Integer.parseInt(n1) - Integer.parseInt(n2));
        }
      
        
      
}
	

}
