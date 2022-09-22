package report;

public class StudentPrevDetail 
{
   String roll_no;
   int fafl,ld,dmgt,unix;

   public StudentPrevDetail()
   {

   }
   public StudentPrevDetail(String roll_no,int fafl,int ld,int dmgt,int unix)
   {
    this.roll_no = roll_no;
    this.fafl = fafl;
    this.ld = ld;
    this.dmgt = dmgt;
    this.unix = unix;
   }

   public void setRoll_no(String roll_no)
   {
    this.roll_no = roll_no;
   }
   public String getRoll_no()
   {
    return roll_no;
   }

   public void setFafl(int fafl)
   {
    this.fafl = fafl;
   }
   public int getFafl()
   {
    return fafl;
   }

   public void setLd(int ld)
   {
    this.ld = ld;
   }
   public int getLd()
   {
    return ld;
   }

   public void setDmgt(int dmgt)
   {
    this.dmgt = dmgt;
   }
   public int getDmgt()
   {
    return dmgt;
   }

   public void setUnix(int unix)
   {
    this.unix = unix;
   }
   public int getUnix()
   {
    return unix;
   }

   public String toString()
   {
    return "This is prev marks object";
   }

   
};