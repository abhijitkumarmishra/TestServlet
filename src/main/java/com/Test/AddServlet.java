package com.Test;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;
import  javax.servlet.Servlet;
public class AddServlet extends HttpServlet
{
	//here we can make service as doGet or doPost method
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
    	int i=Integer.parseInt(req.getParameter("num1"));
    	int j=Integer.parseInt(req.getParameter("num2"));
    	int k=i+j;
    	PrintWriter out=res.getWriter();
    	out.println("result is" + k);
    	res.sendRedirect("sq?k="+k);
    }

}
