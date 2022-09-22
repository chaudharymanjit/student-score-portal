package report;

public class StudentDetail 
{
   String roll_no;
   int co,dbms,java,se;

   public StudentDetail()
   {

   }
   public StudentDetail(String roll_no,int co,int dbms,int java,int se)
   {
    this.roll_no = roll_no;
    this.co = co;
    this.dbms = dbms;
    this.java = java;
    this.se = se;
   }

   public void setRoll_no(String roll_no)
   {
    this.roll_no = roll_no;
   }
   public String getRoll_no()
   {
    return roll_no;
   }

   public void setCo(int co)
   {
    this.co = co;
   }
   public int getCo()
   {
    return co;
   }

   public void setDbms(int dbms)
   {
    this.dbms = dbms;
   }
   public int getDbms()
   {
    return dbms;
   }

   public void setJava(int java)
   {
    this.java = java;
   }
   public int getJava()
   {
    return java;
   }

   public void setSe(int se)
   {
    this.se = se;
   }
   public int getSe()
   {
    return se;
   }

   public String toString()
   {
    return "This is marks object";
   }

   
};