package com.capg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/EmpServlet")
public class EmpServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String EmpId = request.getParameter("EmpId");
		String EmpName = request.getParameter("EmpName");
		String EmpSalary = request.getParameter("EmpSalary");
		String Address = request.getParameter("Address");
		String HNO = request.getParameter("HNO");
		String Area = request.getParameter("Area");
		String City = request.getParameter("City");
		String PinCode = request.getParameter("PinCode");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body style = 'background-color:yellow;color:red'>");
		if(EmpId.equals("1001") && EmpName.equals("rani") && EmpSalary.equals ("5000") && Address.equals("indiranagar") && HNO.equals("787")
				&& Area.equals("munshipulia") && City.equals("LKO") && PinCode.equals("226010")) {
			out.println("<h2>Welcome"+EmpName+"happy browse</h2>");
		}
		else {
			out.println("<h2>invalid credentials</h2>");
		}
		out.println("</body></html>");
		out.close();
		
	}

}
