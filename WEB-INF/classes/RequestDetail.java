package report;

public class RequestDetail 
{
   String usn,password;

   public RequestDetail()
   {

   }

   public RequestDetail(String usn,String password)
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
       return(usn.equals(((RequestDetail)o).usn));
   }

   public String toString()
   {
       return usn+" "+password;
   }
};
