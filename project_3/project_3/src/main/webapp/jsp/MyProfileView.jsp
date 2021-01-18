
<%@page import="in.co.rays.project_3.util.HTMLUtility"%>
<%@page import="java.util.HashMap"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.ctl.MyProfileCtl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Profile View</title>
<link href="<%=ORSView.APP_CONTEXT%>/css/main.css" rel="stylesheet"
	id="bootstrap-css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.1/js/mdb.min.js"></script>
<style type="text/css">
.log1 {
	padding-top: 5%;
	/* padding-left: 30%; */
}

i.css {
	border: 2px solid #8080803b;
	padding-left: 10px;
	 padding-bottom: 11px; 
	 background-color: #ebebe0;
}
.hm-gradient {
	background-image: url('<%=ORSView.APP_CONTEXT%>/img/bg1.png');
	
}
</style>
</head>
<body class="hm-gradient">
	<div class="header">
		<%@include file="Header.jsp"%>
	</div>
	<div>

		<main>
		<form action="<%=ORSView.MY_PROFILE_CTL%>" method="post">

			<div class="row log1">
				<!-- Grid column -->
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card">
						<div class="card-body">

							<h3 class="text-center default-text py-3">
							 My Profile
							</h3>
							<!--Body-->
							<div>

								<jsp:useBean id="dto" class="in.co.rays.project_3.dto.UserDTO"
									scope="request"></jsp:useBean>
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
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Email Id</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-address-card"></i></span>
									</div>
<input	type="text" name="emailId" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" email Id" readonly="readonly"
									value="<%=DataUtility.getStringData(dto.getLogin())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("emailId", request)%></font>	
								</div>
								</div>
							</div>
							</div>
							
							<%-- <div class="md-form">
							<span class="pl-sm-5"><b>Email id</b><span style="color:red;">*</span></span> 
							</br> <label class="fa fa-address-card prefix  fa-5x grey-text css" style="font-size: 1rem;"></label> <input
									type="text" name="emailId" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" email Id" readonly="readonly"
									value="<%=DataUtility.getStringData(dto.getLogin())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("emailId", request)%></font></br> --%>
								
								<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>First Name</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-user"></i></span>
									</div>
<input	type="text" name="firstName" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder="Enter First Name"
									value="<%=DataUtility.getStringData(dto.getFirstName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("firstName", request)%></font>	
								</div>
								</div>
							</div>
							</div>
								
								
								
								<%-- <span class="pl-sm-5"><b>First Name</b><span style="color:red;">*</span></span> 
								</br><label class="far fa-user prefix fa-5x grey-text css" style="font-size: 1rem;"></label> <input
									type="text" name="firstName" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder="Enter First Name"
									value="<%=DataUtility.getStringData(dto.getFirstName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("firstName", request)%></font></br> --%>
								
								
								<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Last Name</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fas fa-user"></i></span>
									</div>
<input	type="text" name="lastName" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" Enter Last Name"
									value="<%=DataUtility.getStringData(dto.getLastName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("lastName", request)%></font>	
								</div>
								</div>
							</div>
							</div>
							
								<%-- <span class="pl-sm-5"><b>Last Name</b><span style="color:red;">*</span></span> 
								</br> <label class="fas fa-user prefix  fa-5x grey-text css" style="font-size: 1rem;"></label> <input
									type="text" name="lastName" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" Enter Last Name"
									value="<%=DataUtility.getStringData(dto.getLastName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("lastName", request)%></font></br> --%>
							
							
							<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Mobile No</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-mobile"></i></span>
									</div>
<input	type="text" name="mobileNo" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" Enter mobile No"
									value="<%=DataUtility.getStringData(dto.getMobileNo())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font>	
								</div>
								</div>
							</div>
							</div>
								
								<%-- <span class="pl-sm-5"><b>Mobile No</b><span style="color:red;">*</span></span> 
								</br> <label class="fa fa-phone-square prefix  fa-5x grey-text css" style="font-size: 1rem;"></label> <input
									type="text" name="mobileNo" id="defaultForm-email" style=" border: 2px solid #8080803b;"
									placeholder=" Enter mobile No"
									value="<%=DataUtility.getStringData(dto.getMobileNo())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font></br> --%>
								
		<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Gender</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-venus-mars"></i></span>
									</div>

<input	type="text" name="gender" id="defaultForm-email" style=" border: 2px solid #8080803b;"

value="<%=DataUtility.getStringData(dto.getGender())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("gender", request)%></font>	
								</div>
								</div>
							</div>
							</div>
								
								<%-- <span class="pl-sm-5"><b>Gender</b><span style="color:red;">*</span></span> 
								</br> <label class="fa fa-venus-mars prefix  fa-5x grey-text css" style="font-size: 1rem;"></label>
								<div style="margin-left: 22px;">
									<%
										HashMap map = new HashMap();
										map.put("Male", "Male");
										map.put("Female", "Female");

										String htmlList = HTMLUtility.getList("gender", dto.getGender(), map);
									%>
									<%=htmlList%></div>
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("gender", request)%></font></br> --%>
							
			<div class="form-group">
 		<div class="row">
 			<label class="control-label col-sm-4" for="exampleInputEmail1"><b>DOB</b><span style="color: red;">*</span></label>
				<div class="col-sm-8">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
							<span class="input-group-text" id="basic-addon1"><i class="fa fa-calendar"></i></span>
									</div>
<input type="date" name="dob" style=" border: 2px solid #8080803b;"
	 placeholder="Date Of Birth" id="datepicker"
	value="<%=DataUtility.getDateString(dto.getDob())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("dob", request)%></font>	
								</div>
								</div>
							</div>
							</div>
								
								<%-- <span class="pl-sm-5"><b>DOB</b><span style="color:red;">*</span></span> 
								</br> <label class="fa fa-calendar  prefix grey-text css" style="font-size: 1rem;"
									style="margin-top: -4px;"></label> <input type="date" name="dob" style=" border: 2px solid #8080803b;"
									 placeholder="Date Of Birth"
									id="datepicker"
									value="<%=DataUtility.getDateString(dto.getDob())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("dob", request)%></font></br> --%>
								
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=MyProfileCtl.OP_SAVE%>">
										<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=MyProfileCtl.OP_CHANGE_MY_PASSWORD%>">
							</div>
                         
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
</html>