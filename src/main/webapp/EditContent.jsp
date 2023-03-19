<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Model.Bean.Content"%>
<%@page import= "jakarta.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Content form</title>
	<link href = "Css/Edit.css" rel = "stylesheet" type = "text/css">
</head>
<body>
	<div class="container-xl px-4 mt-4">
    <!-- Account page navigation-->
    <nav class="nav nav-borders">
        <a class="nav-link active ms-0" href="" target="__blank">Profile</a>
        <a class="nav-link" href="show" target="__blank">Content</a>
    </nav>
    <hr class="mt-0 mb-4">
    <div class="row">
        <div class="col-xl-8">
            <!-- Account details card-->
            <div class="card mb-4">
                <div class="card-header">Content Details</div>
                <div class="card-body">
                    <form action  = "editcontent" method = "post">
                   <% try{
                	   String id = request.getParameter("Content_ID");
 					Statement stat = null;
    	ResultSet res = null;
    	Content content = new Content();
 		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager
            .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
            		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
		stat = connection.createStatement();
		String data = "select * from Content where Content_ID = '"+ id +"'";
		res = stat.executeQuery(data);
	while(res.next()){
	%>
                        <!-- Form Row-->
                        <div class="row gx-3 mb-3">
                            <!-- Form Group (first name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Content_ID">Content ID</label>
                                <input readonly class="form-control" id="Content_ID" name = "Content_ID" type="text" value = <%= id %>>
                            </div>
                            <div class="col-md-6">
                                <label class="small mb-1" for="Title">Content Title</label>
                                <input class="form-control" id="Title" name="Title" type="text" 
                                placeholder="Enter content title" value = <%= res.getString(2) %>>
                            </div>
                            <!-- Form Group (last name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Brief">Content Brief</label>
                                <input class="form-control" id="Brief" name="Brief" type="text" 
                                placeholder="Enter content brief" value = <%=res.getString(3) %>>
                            </div>
                        </div>
                        <!-- Form Group (email address)-->
                        <div class="mb-3">
                            <label class="small mb-1" for="Content">Content</label>
                            <input class="form-control" id="Content" name ="Content" type="text" 
                            placeholder="Enter Content" value = <%=res.getString(7) %>>
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