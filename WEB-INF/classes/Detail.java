package report;

import java.io.*;
import java.sql.*;
    
public class Detail
{
    String usn,password;

   public Detail()
   {

   }
   
   public Detail(String usn)
   {
    this.usn = usn;
   }

   public Detail(String usn,String password)
   {
       this.usn = usn;
       this.password = password;
   }
   
   public void setUsn(String usn)
   {
       this.usn = usn;
   }
   public String getUsn()
   {
       return usn;
   }

   public void setPassword(String password)
   {
       this.password = password;
   }
   public String getPassword()
   {
       return password;
   }

   
   public boolean equals(Object o)
   {
       return(((Detail)o).usn.equals(usn) && ((Detail)o).password.equals(password));
   }
   public String toString()
   {
       return usn+" "+password;
   }
};