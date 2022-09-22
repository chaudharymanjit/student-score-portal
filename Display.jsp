<html>
  <%@ page import="report.*" %> 
  <% StudentDetail dt = (StudentDetail)session.getAttribute("details"); %>

  <body style="background-color:rgb(214, 253, 240)">
    <style>
      td,
      th {
        padding: 15px;
      }
      th {
        color: royalblue;
      }
      body {
        font-family: "Poppins", sans-serif;
        padding: 0 20px 20px 20px;
      }
      h1 {
        text-decoration: underline;
      }
    </style>
    <body style="background-color: rgb(255, 255, 255)">
      <h1
        style="
          text-align: center;
          color: royalblue;
          font-family: 'Poppins', sans-serif;
        "
      >
        The National Institute of Engineering
      </h1>
      <div style="display: flex; justify-content: space-between">
        <h2
          style="
            font-family: 'Poppins', sans-serif;
            display: inline;
            color: royalblue;
            text-decoration: underline;
          "
        >
          4th Semester
        </h2>
        <div style="text-align: right; display: inline; font-size: 17px">
          <a
            style="
              color: black;
              text-decoration: none;
              border: 2px solid royalblue;
              padding: 4px;
              color: royalblue;
              border-radius: 10%;
            "
            href="index.html"
            >Logout</a
          >
        </div>
      </div>

      <br />
      <br /><br />
      <b
        ><td
          style="
            text-align: center;
            font-size: 25px;
            font-family: 'Poppins', sans-serif;
          "
        >
          <%= dt.getRoll_no() %>
        </td></b
      >
      <br /><br />
      <style>
        table,
        th,
        td {
          border: 1px solid black;
          border-spacing: 30px;
          border-collapse: collapse;
          border-style: inset;
        }
      </style>
      <table style="width: 50%">
        <th>Total Credits</th>
        <th>Credits Earned</th>
        <tr>
          <td style="text-align: center"><b>125</b></td>
          <td style="text-align: center"><b>48</b></td>
        </tr>
      </table>
      <br /><br />
      <h3 style="font-size: 25px; font-family: 'Poppins', sans-serif">
        <b>Performance</b>
      </h3>

      <table width="100%" height="30%">
        <tr>
           <th>CO</th>
           <th>DBMS</th>
           <th>JAVA</th>
           <th>SE</th>
        </tr>

        <tr>
          <td style="text-align:center"> <%= dt.getCo() %></td>
          <td style="text-align:center"> <%= dt.getDbms() %></td>
          <td style="text-align:center"> <%= dt.getJava() %></td>
          <td style="text-align:center"> <%= dt.getSe() %></td> 
        </tr>
      </table>
    </body>
  </body>
<br><br>
  <a href="timetable.html">View TimeTable</a>
  <br><br>
  <a href="PrevYear.jsp">Previous Semester Marks</a>
</html>
