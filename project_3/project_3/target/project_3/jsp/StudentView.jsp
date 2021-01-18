<%@page import="java.util.List"%>
<%@page import="in.co.rays.project_3.util.HTMLUtility"%>
<%@page import="in.co.rays.project_3.ctl.StudentCtl"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student View</title>
<link href="<%=ORSView.APP_CONTEXT%>/css/main.css" rel="stylesheet"
	id="bootstrap-css">
<!-- <script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.1/js/mdb.min.js"></script> -->

<style type="text/css">
.log1 {
	padding-top: 5%;
	/* padding-left: 30%; */
}

.hm-gradient {
background-image: url('<%=ORSView.APP_CONTEXT%>/img/bg1.png');
	
}
i.css {
	border: 2px solid #8080803b;
	padding-left: 10px;
	 padding-bottom: 11px; 
	 background-color: #ebebe0;
}


</style>
<script>

var d = new Date();
function disableSunday(d){
	  var day = d.getDay();
	  if(day==0)
	  {
	   return [false];
	  }else
	  {
		  return [true];
	  }
}

$( function() {
	  $( "#datepicker" ).datepicker({
		  changeMonth :true,
		  changeYear :true,
		  yearRange :'1980:2030',
		  dateFormat:'dd/mm/yy',
		  minDate:0,
		  
		  
	  });
} );
</script>
</head>
<body class="hm-gradient">
	<div class="header">
		<%@include file="Header.jsp"%>
		<%@include file="calendar.jsp"%>
	</div>
	<div>
		<jsp:useBean id="dto" class="in.co.rays.project_3.dto.StudentDTO"
			scope="request"></jsp:useBean>
		<main>
		<form action="<%=ORSView.STUDENT_CTL%>" method="post">

			<div class="row log1">
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card">
						<div class="card-body">
							<%
								long id = DataUtility.getLong(request.getParameter("id"));

								if (id > 0) {
							%>
							<h3 class="text-center default-text py-3">Update Student</h3>
							<%
								} else {
							%>
							<h3 class="text-center default-text py-3">Add Student</h3>
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

	
			<input type="hidden" name="id" value="<%=dto.getId()%>">
	<input type="hidden" name="createdBy" value="<%=dto.getCreatedBy()%>">
   <input type="hidden" name="modifiedBy" value="<%=dto.getModifiedBy()%>"> 
	<input	type="hidden" name="createdDatetime" value="<%=DataUtility.getTimestamp(dto.getCreatedDatetime())%>">
	<input type="hidden" name="modifiedDatetime" value="<%=DataUtility.getTimestamp(dto.getModifiedDatetime())%>">
		</div>
							<%
								List li = (List) request.getAttribute("collegeList");
							%>
							
			<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>College</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="far fa-building"></i></span>
									</div>
		<%=HTMLUtility.getList("collegeId", String.valueOf(dto.getCollegeId()), li)%>
		<font color="red" class="pl-sm-5">  <%=ServletUtility.getErrorMessage("collegeId", request)%></font>
								</div>
								</div>
								</div>
							</div>				
							
							
							
							
							
							
							
							
							<%-- <div class="md-form">
				<span class="pl-sm-5"><b>College</b><span style="color: red;">*</span></span> </br> 
				<label	class="far fa-building prefix grey-text css" style="font-size: 1rem;"></label>
								<div style="margin-left: 22px;">
									<%=HTMLUtility.getList("collegeId", String.valueOf(dto.getCollegeId()), li)%>
								</div>
								<font color="red" class="pl-sm-5">  <%=ServletUtility.getErrorMessage("collegeId", request)%></font></br> --%>


				<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>First Name</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="far fa-user-circle"></i></span>
									</div>
<input type="text"	name="firstName" id="defaultForm-email"
									style="border: 2px solid #8080803b;" placeholder="First Name"
									value="<%=DataUtility.getStringData(dto.getFirstName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("firstName", request)%></font>
								</div>
								</div>
								</div>
							</div>






								<%-- <span class="pl-sm-5"><b>First Name</b><span
									style="color: red;">*</span></span> </br>
								<label class="far fa-user prefix grey-text css" style="font-size: 1rem;"></label> <input type="text"
									name="firstName" id="defaultForm-email"
									style="border: 2px solid #8080803b;" placeholder="First Name"
									value="<%=DataUtility.getStringData(dto.getFirstName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("firstName", request)%></font></br> --%>
	
				<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Last Name</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="far fa-user-circle"></i></span>
									</div>
<input type="text"	name="lastName" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="Last Name"
			value="<%=DataUtility.getStringData(dto.getLastName())%>">
			<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("lastName", request)%></font>
								</div>
								</div>
								</div>
							</div>

				
								<%-- <span class="pl-sm-5"><b>Last Name</b><span
									style="color: red;">*</span></span> </br> 
						<label	class="fas fa-user prefix grey-text css" style="font-size: 1rem;"></label> 
			<input type="text"	name="lastName" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="Last Name"
			value="<%=DataUtility.getStringData(dto.getLastName())%>">
			<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("lastName", request)%></font></br> --%>


			<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Email Id</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="far fa-envelope"></i></span>
									</div>
<input	type="text" name="emailId" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="email Id"
			value="<%=DataUtility.getStringData(dto.getEmailId())%>">
   <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("emailId", request)%></font>
								</div>
								</div>
								</div>
							</div>
							
								<%-- <span class="pl-sm-5"><b>Email Id</b><span
									style="color: red;">*</span></span> </br> 
	<label	class="far fa-envelope prefix grey-text css" style="font-size: 1rem;"></label> 
	<input	type="text" name="emailId" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="email Id"
			value="<%=DataUtility.getStringData(dto.getEmailId())%>">
   <font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("emailId", request)%></font></br> --%>


		<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Mobile No</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-mobile"></i></span>
									</div>
<input type="text"	name="mobileNo" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="mobile No" maxlength="10"
		value="<%=DataUtility.getStringData(dto.getMobileNo())%>">
		<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font>
								</div>
								</div>
								</div>
							</div>
		<%-- <span class="pl-sm-5"><b>Mobile No</b><span	style="color: red;">*</span></span> </br> 
		<label class="fa fa-phone prefix grey-text css" style="font-size: 1rem;"></label> 
		<input type="text"	name="mobileNo" id="defaultForm-email"
			style="border: 2px solid #8080803b;" placeholder="mobile No" maxlength="10"
		value="<%=DataUtility.getStringData(dto.getMobileNo())%>">
		<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font></br> --%>



		<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>DOB</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-calendar"></i></span>
									</div>
									
									
				
									
									
<input type="date" name="dob"	style="border: 2px solid #8080803b;" 
			placeholder="Enter Date Of Birth"	 value="<%=DataUtility.getDateString(dto.getDob())%>"> 
		<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("dob", request)%></font>
								</div>
								</div>
								</div>
							</div>
							
		
								<%
									if(id>0) {
								%>
								<div class="text-center">

	 <input type="submit" name="operation"	class="btn btn-success btn-md" style="font-size: 17px" 
	  value="<%=StudentCtl.OP_UPDATE%>"> 
	<input	type="submit" name="operation"
	class="btn btn-warning btn-md"
		style="font-size: 17px"
			value="<%=StudentCtl.OP_CANCEL%>">

				</div>
								<%
									} else {
								%>
								<div class="text-center">

	<input type="submit" name="operation" class="btn btn-success btn-md" style="font-size: 17px"
	value="<%=StudentCtl.OP_SAVE%>"> 
	<input type="submit" name="operation" class="btn btn-warning btn-md"
		style="font-size: 17px" value="<%=StudentCtl.OP_RESET%>">
	</div>
								<%
									}
								%>
							</div>
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

</body>
</html>