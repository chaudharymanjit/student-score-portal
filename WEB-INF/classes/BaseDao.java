package report;

import java.io.*;
import java.sql.*;

public class BaseDao 
{
    Connection con;

     public BaseDao()
     {

     }

    public Connection getConnection()throws ClassNotFoundException,SQLException
    {
        try 
        {
         Class.forName("com.mysql.jdbc.Driver");
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
};