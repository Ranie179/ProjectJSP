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
<title>Create Content form</title>
	<link href = "Css/Edit.css" rel = "stylesheet" type = "text/css">
</head>
<body>
	<div class="container-xl px-4 mt-4">
    <!-- Account page navigation-->
    <nav class="nav nav-borders">
        <a class="nav-link active ms-0" href="" target="__blank">Content Detail</a>
        <a class="nav-link" href="show" target="__blank">Content</a>
    </nav>
    <hr class="mt-0 mb-4">
    <div class="row">
        <div class="col-xl-8">
            <!-- Account details card-->
            <div class="card mb-4">
                <div class="card-header">Insert Content Details</div>
                <div class="card-body">
                    <form action  = "create" method = "post">
                        <!-- Form Row-->
                        <div class="row gx-3 mb-3">
                            <!-- Form Group (first name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Title">Title</label>
                                <input class="form-control" id="Title" name="Title" type="text" 
                                placeholder="Enter content title" >
                            </div>
                            <!-- Form Group (last name)-->
                            <div class="col-md-6">
                                <label class="small mb-1" for="Brief">Brief</label>
                                <input class="form-control" id="Brief" name="Brief" type="text" 
                                placeholder="Enter content brief" >
                            </div>
                        </div>
                        <!-- Form Group (email address)-->
                        <div class="mb-3">
                            <label class="small mb-1" for="Content">Content</label>
                            <input class="form-control" id="Content" name ="Content" type="text" 
                            placeholder="Enter Content" >
                        </div>
                        <!-- Save changes button-->
                        <br>
                        <button class="btn btn-primary" type="submit">Save</button>
                    </form>
                    <br>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>