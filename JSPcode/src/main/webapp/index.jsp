<html>
<body>
<h2>Hello World!</h2>
<%-- add JSP code inside the html code --%>
<%-- Print any expression or statement --%>
<%
out.print (" My name is Ankit Tiwari");
%>
<br>
<%-- Print any expression or statement without out.print ()method--%>
<%="My Email is : zyx@gmail.com"%>

<%-- Work on the variables and datatypes in jsp with declaration && initialization--%>
<%
// declare the variables in jsp
String collegeName ="BBD";
out.print("<br>"+"My College Name is "+ collegeName );
%>

<%-- add two number in jsp --%>
<%
int a = 7;
int b = 9;
out.print ("<br>"+"Sum is "+ (a+b));
%>

<%-- get the request from html page --%>
<%
String friendName = request.getParameter("friendName");
out.print ("My friend name is "+ friendName );
int age = Integer.parseInt(request.getParameter("age"));
String gender= request.getParameter("gender");
if ((age > 18 && gender.equalsIgnoreCase("Male")) ||
        (age > 16 && gender.equalsIgnoreCase("Female"))) {
        out.print("You can apply");
        response.sendRedirect("https://www.google.co.in/");
    } else {
        out.print("You cannot apply");
    }

%>


</body>
</html>
