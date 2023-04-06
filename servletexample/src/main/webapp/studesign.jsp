<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="Stuser" method="post">
     <input type="text" name="txtrno" placeholder="Enter rno" required />
     <br><br>
     <input type="text" name="txtname" placeholder="Enter name" required />
     <br><br>
     <input type="radio" name="gender" value="male" required />Male
     <input type="radio" name="gender" value="female" required />Female
     <br><br>
     <input type="checkbox" name="course" value="C"  required/>C
     <input type="checkbox" name="course" value="C++" required />C++
     <br><br>
     <select name="location" required>
        <option value="">Select Location</option>
        <option value="Palasia">Palasia Office</option>
        <option value="Vijaynagar">Vijaynagar</option>
        <option value="Bhawarkua">Bhawarkua</option>
     </select>
     <br><br>
     <select name="ctype" multiple="true" required>
        
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
   
   
</body>
</html>