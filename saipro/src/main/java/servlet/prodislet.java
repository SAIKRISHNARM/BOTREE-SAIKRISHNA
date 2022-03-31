package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.product;
import Controller.*;
import view.finalcall;


public class prodislet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public prodislet() {
        super();
    }


//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		response.getWriter();
//		response.setContentType("text/html");
//		PrintWriter ou = response.getWriter();
//		String prodId =request.getParameter("productid");
//		ou.print("<h2>"+prodId+"</h2>");
//	}

//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String prodId =request.getParameter("productid");
//		if(prodId.equals("sai"))
//		{
//		response.sendRedirect("productreceive.jsp");	
//		}
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Connection co=null;
//		PreparedStatement pst=null;
//		
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter ou = response.getWriter();
		String prodname=request.getParameter("productname");
		String proddetail =request.getParameter("productdetail");
		int prodid =Integer.parseInt(request.getParameter("productid"));
		int prodprice =Integer.parseInt(request.getParameter("productprice"));
		System.out.println("print");
		System.out.println(prodname+proddetail+prodid+prodprice);
		product p =new product(prodid,prodname,proddetail,prodprice);
		System.out.println(p);
//		finalcall finalcall = new finalcall();
//		controllerset set =new controllerset();
//		try {
//			finalcall.display();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		request.setAttribute("pname",prodname);
//		request.getRequestDispatcher("productreceive.jsp").forward(request, response);
//		request.setAttribute("pid",prodid);
//		request.getRequestDispatcher("productreceive.jsp").forward(request, response);
//		request.setAttribute("pprice",prodprice);
//		request.getRequestDispatcher("productreceive.jsp").forward(request, response);
//		request.setAttribute("pdetail",proddetail);
//		request.getRequestDispatcher("productreceive.jsp").forward(request, response);
//		
		request.setAttribute("Prod",p);
       request.getRequestDispatcher("productreceive.jsp").forward(request, response);
	
	
	}
//	public void init(ServletConfig config) throws ServletException {
//	
//		System.out.println("intial");
//	}
//
//	
//	public void destroy() {
//		
//		System.out.println("servlet destroy");
//	}
//
//	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("service in done ");
//	}

}
