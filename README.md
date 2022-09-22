**About**:

A web application wherein the respective candidate can view his/her current semester and previous semester marks.This minor application was developed to refine 
my Advance Java concepts such as JSP, Servlets, JDBC etc.

**Installation**:

Server Installation:

Apache tomcat server(version 7 and above) and carefully read the tomcat readme file to properly install the server.

To check if the server is up or not : apacahe-tomcat folder -> bin -> startup (Windows batch file).Please find the image attached below.
<img width="600" alt="tomcat" src="https://user-images.githubusercontent.com/95494766/179543806-4f357b82-9ded-4db8-a705-b68969478974.png">

**Database Installation**:

The database used in this project is MySQL version 8, inorder to go through the login page you need to have some entries in your database for verification.

Create a database by the name students. Please find the attached images to create the tables.
<img width="418" alt="studentinfo" src="https://user-images.githubusercontent.com/95494766/179545775-a93de380-a3b2-4bbc-bffb-af416ee3c483.png">
<img width="422" alt="studentmarks" src="https://user-images.githubusercontent.com/95494766/179545803-f7959dd0-eb5f-4e2e-b1c5-96099c8b0b57.png">
<img width="430" alt="studentprevmarks" src="https://user-images.githubusercontent.com/95494766/179545838-a5a918ca-4c4e-4bc2-82d5-4260e1afca25.png">

Where to store the files?

Inside apache tomcat you will find a folder by the name webapps. Inside webapps folder create a directory/folder by the name College.
Now put all the files and folders present in this repository inside the folder created by the name College.

**How to use?**

Under  College -> WEB-INF -> web.xml , open this xml file in a editor and save it so that all the servlets are loaded.
Go to your browser and type the url: "https://localhost:8080/College".

How to edit the code?

Inside your IDE open this folder College -> WEB-INF -> classes, all the .java files are visible here.

**Features:**

The front end is developed using JSP, HTML and  CSS and also candidate can view the current smester's timetable.

**Images:**

<img width="960" alt="page1" src="https://user-images.githubusercontent.com/95494766/179547661-6d7884f4-76ac-4fc0-b516-9f6ec19864f9.png">

<img width="953" alt="page2" src="https://user-images.githubusercontent.com/95494766/179547706-fc7b7938-7dce-4cd1-9a56-033dd3786a90.png">

<img width="941" alt="page3" src="https://user-images.githubusercontent.com/95494766/179547738-34f1b3c3-ac92-490b-a4b7-541b92cdaa3e.png">


**API'S:** No API's are used.

**Frameworks:** No frameworks used.

**Test's:** Check the flow inside the web application.

**Comments:** Enjoy using this website, also do report if any bugs are found or any problems in the server installation.







