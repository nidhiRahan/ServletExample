<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="" method="post">
     <input type="text" name="txtrno" placeholder="Enter rno" />
     <br><br>
     <input type="text" name="txtname" placeholder="Enter name" />
     <br><br>
     <input type="radio" name="gender" value="male" />Male
     <input type="radio" name="gender" value="female" />Female
     <br><br>
     <input type="checkbox" name="course" value="C" />C
     <input type="checkbox" name="course" value="C++" />C++
     <br><br>
     <select name="location">
        <option value="">Select Location</option>
        <option value="Palasia">Palasia Office</option>
        <option value="Vijaynagar">Vijaynagar</option>
        <option value="Bhawarkua">Bhawarkua</option>
     </select>
     <br><br>
     <select name="ctype" multiple="true">
        
        <option value="corporate">Corporate</option>
        <option value="assistance">Assistance</option>
        <option value="certification">Certification</option>
     </select>
     <br><br>
     Enter Any Query<br>
     <textarea name="query" rows="6" cols="50">
     
     </textarea>
     <br>
     <input type="submit" name="btnsubmit" value="click" />
   
   </form>
   
   <%
   if(request.getParameter("btnsubmit")!=null)
   {
	   
	   String rno = request.getParameter("txtrno");
	   String name = request.getParameter("txtname");
	   String gen = request.getParameter("gender");
	   String course[] = request.getParameterValues("course");
	   String c = "";
	   for(String d:course)
	   {
		   c = c + d + " ";
	   }
	   String location = request.getParameter("location");
	   String ct[] = request.getParameterValues("ctype");
	   String ct1 = "";
	   for(String d:ct)
	   {
		   ct1 = ct1 + d + " ";
	   }
	   String query = request.getParameter("query");
	   out.print("rno is "+rno + " name is "+ name + " gender is "+ gen + " courses are "+ct1 + "Query is "+query);
   }
   
   
   
   %>
</body>
</html>