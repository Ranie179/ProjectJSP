<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Model.Bean.Member"%>
<%@page import= "jakarta.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit form</title>
	<link href = "Css/Edit.css" rel = "stylesheet" type = "text/css">
</head>
<body>
	<div class="container-xl px-4 mt-4">
    <!-- Account page navigation-->
    <nav class="nav nav-borders">
        <a class="nav-link active ms-0" href="" target="__blank">Profile</a>
        <a class="nav-link" href="show" target="__blank">Content</a>
        <a class="nav-link" href="Create.jsp" target="__blank">Create Content</a>
    </nav>
    <hr class="mt-0 mb-4">
    <div class="row">
        <div class="col-xl-8">
            <!-- Account details card-->
            <div class="card mb-4">
                <div class="card-header">Account Details</div>
                <div class="card-body">
                    <form action  = "edit" method = "post">
                   <% try{
                	   String name = request.getParameter("Username");
 					Statement stat = null;
    	ResultSet res = null;
    	Member member = new Member();
 		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager
            .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
            		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
		stat = connection.createStatement();
		String data = "select * from Member where Username = '"+ name +"'";
		res = stat.executeQuery(data);
	while(res.next()){
	%>
                        <!-- Form Row-->
                        <div class="row gx-3 mb-3">
                            <!-- Form Group (first name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Username">Username</label>
                                <input readonly class="form-control" id="Username" name = "Username" type="text" value = <%= name %>>
                            </div>
                            <div class="col-md-6">
                                <label class="small mb-1" for="Firstname">First name</label>
                                <input class="form-control" id="Firstname" name="Firstname" type="text" 
                                placeholder="Enter your first name" value = <%= res.getString(2) %>>
                            </div>
                            <!-- Form Group (last name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Lastname">Last name</label>
                                <input class="form-control" id="Lastname" name="Lastname" type="text" 
                                placeholder="Enter your last name" value = <%=res.getString(3) %>>
                            </div>
                        </div>
                        <!-- Form Group (email address)-->
                        <div class="mb-3">
                            <label class="small mb-1" for="Email">Email address</label>
                            <input class="form-control" id="Email" name ="Email" type="email" 
                            placeholder="Enter your email address" value = <%=res.getString(7) %>>
                        </div>
                        <!-- Form Row-->
                        <div class="row gx-3 mb-3">
                            <!-- Form Group (phone number)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Phone">Phone number</label>
                                <input class="form-control" id="Phone" name = "Phone" type="text" 
                                placeholder="Enter your phone number" value = <%=res.getString(6) %>>
                            </div>
                            <!-- Form Group (Description)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Descript">Description</label>
                                <input class="form-control" id="Descript" type="text" 
                                name="Descript" placeholder="Enter your description" value = <%=res.getString(8) %>>
                            </div>
                        </div>
                        <!-- Save changes button-->
                        <br>
                        <button class="btn btn-primary" type="submit">Save changes</button>
                    </form>
                    <br>
                    <a style="text-decoration:none" href="Index.jsp">
    					<button>Log out</button>
  					</a> 
                </div>
            </div>
        </div>
    </div>
</div>
<% }
	} catch(Exception e){
	  System.out.println(e);
	}   
%>
</body>
</html>