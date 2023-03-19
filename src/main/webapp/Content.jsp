<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "Model.Bean.*" %>
<%@page import ="java.util.ArrayList" %>
<%@page import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Content Page</title>
<link href = "Css/Content.less" rel = "stylesheet" type = "text/css">
</head>
<body>
<form action="search" method="post">
        <table width='30%' align="center">
            <tr>
                <td>Search Content by:</td>
                <td><select id = "option" name="option">
                        <option>Title</option>
                        <option>Brief</option>
                        <option>Content</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Type here:</td>
                <td><input type="search" size="20" id = "search" name="search"> </td>
            </tr>
            <tr align="center">
                <td colspan="20"> <a class = "button-89" style="text-decoration:none">
                		<button type = "submit">Search</button>
  					</a> 
                <a class = "button-89" style="text-decoration:none">
                		<button type = "reset">Reset</button>
  					</a> 
            </tr>
        </table>
        </form>
<form action = "show" method = "get">
<div class="container">
	<table>
	<%
                List<Content> content = (List<Content>)request.getAttribute("list");
                if(content.size() == 0) {
            %> 
            <p>Không có Content</p>
            <%
                }
                if(content.size() > 0){
            %>
		<thead>
			<tr>
				<th>Title</th>
				<th>Brief</th>
				<th>Content</th>
				<th>CreatedDay</th>
				<th>UpdateDay</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		 <%
                for (int i = 0; i < content.size(); i++) {
            %>       
		<tbody>
			<tr>
				<td><%=content.get(i).getTitle()%></td>
				<td><%=content.get(i).getBrief()%></td>
				<td><%=content.get(i).getContent()%></td>
				<td><%=content.get(i).getCreateDate()%></td>
				<td><%=content.get(i).getUpdateTime()%></td>
				<td><a class = "button-89" style="text-decoration:none" href = "editcontent?Content_ID= <%= content.get(i).getContent_ID()%>">
    					Edit
  					</a> </td>
  				<td><a  class = "button-89" style="text-decoration:none" href="delete?Content_ID= <%= content.get(i).getContent_ID()%>"> 
    					Delete
  					</a> </td>
			</tr>
			
		</tbody>
		<%
                    }}
            %>
	</table>
</div>
</form>
</body>
</html>