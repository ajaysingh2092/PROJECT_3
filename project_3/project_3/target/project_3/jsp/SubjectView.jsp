<%@page import="java.util.List"%>
<%@page import="in.co.rays.project_3.util.HTMLUtility"%>
<%@page import="in.co.rays.project_3.ctl.SubjectCtl"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subject View</title>
<link href="<%=ORSView.APP_CONTEXT%>/css/main.css" rel="stylesheet" id="bootstrap-css">

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
 rel="stylesheet" id="bootstrap-css">
 <script src="maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.1/js/mdb.min.js"></script>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <style type="text/css">
 .log1{
 	padding-top:5%;
 }
 .hm-gradient{
 	background-image:url('<%=ORSView.APP_CONTEXT%>/img/bg1.png');
 }
 i.css{
 	border:2px solid #8080803b;
 	padding-left:10px;
 	padding-bootom:7px;
 	background-color:ebebe0;
 }
 
 </style>
</head>
<body class="hm-gradient">
	<div class="header">
		<%@include file="Header.jsp" %>
	</div>
	<div class="container-fluid">

		<main>
		<form action="<%=ORSView.SUBJECT_CTL%>" method="post">

			<div class="row log1">
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<jsp:useBean id="dto" class="in.co.rays.project_3.dto.SubjectDTO"
						scope="request"></jsp:useBean>
					<div class="card">
						<div class="card-body">
							<%
							  long id=DataUtility.getLong(request.getParameter("id"));
							
							
							if (id >0)  {
							%>
							<h3 class="text-center default-text py-3">Update Subject</h3>
							<%
								} else {
							%>
							<h3 class="text-center default-text py-3">Add Subject</h3>
							<%
								}
							%>
							<!--Body-->
							<div>


								<H4 align="center">
									<%
										if (!ServletUtility.getSuccessMessage(request).equals("")) {
									%>
									<div class="alert alert-success alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
										<%=ServletUtility.getSuccessMessage(request)%>
									</div>
									<%
										}
									%>
								</H4>

								<H4 align="center">
									<%
										if (!ServletUtility.getErrorMessage(request).equals("")) {
									%>
									<div class="alert alert-danger alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
											<%=ServletUtility.getErrorMessage(request)%>
									</div>
									<%
										}
									%>

								</H4>
								<%
									List l = (List) request.getAttribute("courseList");
								%>

								<input type="hidden" name="id" value="<%=dto.getId()%>">
								<input type="hidden" name="createdBy"
									value="<%=dto.getCreatedBy()%>"> <input type="hidden"
									name="modifiedBy" value="<%=dto.getModifiedBy()%>"> <input
									type="hidden" name="createdDatetime"
									value="<%=DataUtility.getTimestamp(dto.getCreatedDatetime())%>">
								<input type="hidden" name="modifiedDatetime"
									value="<%=DataUtility.getTimestamp(dto.getModifiedDatetime())%>">
							</div>
							
							<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Subject Name</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-book"></i></span>
									</div>
<input type="text" name="subjectName" id="defaultForm-email" placeholder="Enter Subject Name" style="border: 2px solid #8080803b;"
	value="<%=DataUtility.getStringData(dto.getSubjectName())%>">
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("subjectName", request)%></font>
								</div>
								</div>
								</div>
							</div>
							
							
							
	
		
		<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Description</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-sort-amount-desc "></i></span>
									</div>
<textarea name="description" placeholder="Enter Description" rows="3" cols="23"><%=DataUtility.getStringData(dto.getDescription())%></textarea>
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("description", request)%></font>
								</div>
								</div>
								</div>
							</div>
		
		
	
						
						<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Course</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-book"></i></span>
									</div>
<%=HTMLUtility.getList("courseId", String.valueOf(dto.getCourseId()), l)%>
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("courseId", request)%></font>
								</div>
								</div>
								</div>
							</div>		
	


							
							<%
								if (id>0) {
							%>
							<div class="text-center">

	<input type="submit" name="operation" class="btn btn-success btn-md" style="font-size: 17px"
	value="<%=SubjectCtl.OP_UPDATE%>">
	 <input type="submit"	name="operation" class="btn btn-success btn-md"
	 			style="font-size: 17px" value="<%=SubjectCtl.OP_CANCEL%>">
							</div>
							<%
								} else {
							%>
							<div class="text-center">

	<input type="submit" name="operation"	class="btn btn-success btn-md" style="font-size: 17px"
	value="<%=SubjectCtl.OP_SAVE%>"> 
	<input type="submit" name="operation" class="btn btn-warning btn-md"
			style="font-size: 17px" value="<%=SubjectCtl.OP_RESET%>">
							</div>
							<%
								}
							%>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
				</div>
				
		</form>
		</main>


	</div>

</body>
<%@include file="Footer.jsp"%>
</html>