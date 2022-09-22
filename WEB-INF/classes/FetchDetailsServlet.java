package report;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class FetchDetailsServlet extends HttpServlet 
{
    Connection con;
    StudentDetail details;
    Detail detail;
    StudentPrevDetail prev;
    
    public Connection getConnection()
    {
        try 
        {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Krishna@982002");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }

    public void closeConnection() 
    {
       try 
        {
         con.close();
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }

   protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException 
   {
       response.setContentType("text/html");
       PrintWriter pw = response.getWriter();
       getConnection();
       
       String usn1 = request.getParameter("usn");
       String password = request.getParameter("password");
       RequestDetail rdt = new RequestDetail();
       rdt.setUsn(usn1);
       rdt.setPassword(password);

       try 
       {
       InfoDao idao = new InfoDao(); 

       details = idao.getDetails(usn1);
       detail = idao.getDetail(usn1);
       prev = idao.getPrevDetails(usn1);

       HttpSession hs = request.getSession();
       hs.setAttribute("details",details);
       hs.setAttribute("prevdetails",prev);
       }
       
       catch(Exception e)
       {
         System.out.println(e);
       }
     
        //detail.equals(new Detail(rdt.getUsn(),rdt.getPassword()))
       if(detail.getUsn().equals(rdt.getUsn()) && detail.getPassword().equals(rdt.getPassword())  )
        request.getRequestDispatcher("Display.jsp").forward(request,response);

       else 
        request.getRequestDispatcher("index.html").forward(request,response);
   }

};