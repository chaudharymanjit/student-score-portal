package report;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InfoDao extends BaseDao
{

     public InfoDao()
     {

     }

  /* public Collection getDetail()throws SQLException,ClassNotFoundException
    {
        Vector v = new Vector();
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from studentinfo");

        while(rs.next())
        {
           Detail dt = new Detail();
           dt.setUsn(rs.getString(1));
           dt.setPassword(rs.getString(2));
           v.add(dt);
        }
        stmt.close();
        closeConnection();
        return v;
    }*/



    public StudentDetail getDetails(String usn)throws SQLException,ClassNotFoundException
    {
        StudentDetail sdt = new StudentDetail();
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("select * from studentmarks where roll_no=?");
        pstmt.setString(1,usn);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next())
        {
            sdt.setRoll_no(rs.getString(1));
            sdt.setCo(rs.getInt(2));
            sdt.setDbms(rs.getInt(3));
            sdt.setJava(rs.getInt(4));
            sdt.setSe(rs.getInt(5));
        }
        pstmt.close();
        return sdt;
    }

    public StudentPrevDetail getPrevDetails(String usn)throws SQLException,ClassNotFoundException
    {
        StudentPrevDetail sydt = new StudentPrevDetail();
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("select * from studentprevmarks where roll_no=?");
        pstmt.setString(1,usn);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next())
        {
            sydt.setRoll_no(rs.getString(1));
            sydt.setFafl(rs.getInt(2));
            sydt.setLd(rs.getInt(3));
            sydt.setDmgt(rs.getInt(4));
            sydt.setUnix(rs.getInt(5));
        }
        pstmt.close();
        return sydt;
    }

    public Detail getDetail(String usn)throws SQLException,ClassNotFoundException
    {
        Detail dt = new Detail();
        Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("select * from studentinfo where usn=?");
        pstmt.setString(1,usn);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next())
        {
            dt.setUsn(rs.getString(1));
            dt.setPassword(rs.getString(2));
        }
        pstmt.close();
        return dt;
    }
};