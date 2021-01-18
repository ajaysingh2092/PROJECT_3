<%@page import="in.co.rays.project_3.ctl.MarksheetCtl"%>
<%@page import="in.co.rays.project_3.util.HTMLUtility"%>
<%@page import="java.util.List"%>
<%@page import="in.co.rays.project_3.util.DataUtility"%>
<%@page import="in.co.rays.project_3.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marksheet View</title>
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

.hm-gradient {
	background-image: url('<%=ORSView.APP_CONTEXT%>/img/bg1.png');
	/* background-image: linear-gradient(to top, #f3e7e9 0%, #6c757d 99%, #e3eeff 100%); */
}

i.css {
	border: 2px solid #8080803b;
	padding-left: 10px;
	padding-bottom: 11px;
	background-color: #ebebe0;
}
</style>
</head>
<body class="hm-gradient">
	<div class="header">
		<%@include file="Header.jsp"%>
	</div>
	<div class="container-fluid">

		<main>
		<form action="<%=ORSView.MARKSHEET_CTL%>" method="post">

			<div class="row log1">
				<div class="col-md-4 mb-4"></div>
				<!-- Grid column -->
				<div class="col-md-4 mb-4">
					<div class="card">
						<div class="card-body">

							<%
								long id = DataUtility.getLong(request.getParameter("id"));

								if (id > 0) {
							%>
							<h3 class="text-center default-text py-3">Update Marksheet</h3>
							<%
								} else {
							%>
							<h3 class="text-center default-text py-3">Add Marksheet</h3>
							<%
								}
							%>
							<!--Body-->
							<div>
								<%
									List l = (List) request.getAttribute("studenList");
								%>
								<jsp:useBean id="dto"
									class="in.co.rays.project_3.dto.MarksheetDTO" scope="request"></jsp:useBean>
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
									<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Roll
											No</b><span style="color: red;">*</span></label>
									<div class="col-sm-8">
										<div class="input-group mb-3">
											<div class="input-group-prepend">
												<span class="input-group-text" id="basic-addon1"><i
													class="fa fa-list-ol"></i></span>
											</div>
											<input type="text" name="roll" id="defaultForm-email"
												style="border: 2px solid #8080803b;"
												placeholder="Enter RollNo"
												value="<%=DataUtility.getStringData(dto.getRollNo())%>">
											<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("roll", request)%></font>
										</div>
									</div>
								</div>
							</div>



							<div class="form-group">
								<div class="row">
									<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Student
											Name</b><span style="color: red;">*</span></label>
									<div class="col-sm-8">
										<div class="input-group mb-3">
											<div class="input-group-prepend">
												<span class="input-group-text" id="basic-addon1"><i
													class="far fa-user"></i></span>
											</div>
											<%=HTMLUtility.getList("studentId", String.valueOf(dto.getStudentId()), l)%>
											<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("StudentName", request)%></font>
										</div>
									</div>
								</div>
							</div>


							<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("studentName", request)%></font></br>
						

							<div class="form-group">
								<div class="row">
									<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Physics</b><span
										style="color: red;">*</span></label>
									<div class="col-sm-8">
										<div class="input-group mb-3">
											<div class="input-group-prepend">
												<span class="input-group-text" id="basic-addon1"><i
													class="fas fa-equals"></i></span>
											</div>
											<input type="text" name="physics" id="defaultForm-email"
												style="border: 2px solid #8080803b;"
												placeholder="Enter Marks"
												value="<%=DataUtility.getStringData(dto.getPhysics()).equals("0") ? ""
					: DataUtility.getStringData(dto.getPhysics())%>">
											<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("physics", request)%></font>
										</div>
									</div>
								</div>
							</div>




							<%-- <span class="pl-sm-5"><b>Physics</b><span style="color: red;">*</span></span> </br> 
							<label class="fa fa-envelope prefix grey-text css"	style="font-size: 1rem;"></label> 
					<input type="text" name="physics" id="defaultForm-email" style="border: 2px solid #8080803b;"
									placeholder="Enter Physics"
		value="<%=DataUtility.getStringData(dto.getPhysics()).equals("0") ? "": DataUtility.getStringData(dto.getPhysics())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("physics", request)%></font></br> --%>


							<div class="form-group">
								<div class="row">
									<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Chemistry</b><span
										style="color: red;">*</span></label>
									<div class="col-sm-8">
										<div class="input-group mb-3">
											<div class="input-group-prepend">
												<span class="input-group-text" id="basic-addon1"><i
													class="fas fa-equals"></i></span>
											</div>
											<input type="text" name="chemistry" id="defaultForm-email"
												style="border: 2px solid #8080803b;"
												placeholder="Enter Marks"
												value="<%=DataUtility.getStringData(dto.getChemistry()).equals("0") ? ""
					: DataUtility.getStringData(dto.getChemistry())%>">
											<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("chemistry", request)%></font>
										</div>
									</div>
								</div>
							</div>
							<%-- <span class="pl-sm-5"><b>Chemistry</b><span	style="color: red;">*</span></span> </br> 
		<label	class="fa fa-envelope prefix grey-text css"	style="font-size: 1rem;"></label>
	<input type="text"	name="chemistry" id="defaultForm-email"	style="border: 2px solid #8080803b;"
		placeholder="Enter chemistry"
	value="<%=DataUtility.getStringData(dto.getChemistry()).equals("0") ? ""
					: DataUtility.getStringData(dto.getChemistry())%>">
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("chemistry", request)%></font></br> --%>


							<div class="form-group">
								<div class="row">
									<label class="control-label col-sm-4" for="exampleInputEmail1"><b>Maths</b><span
										style="color: red;">*</span></label>
									<div class="col-sm-8">
										<div class="input-group mb-3">
											<div class="input-group-prepend">
												<span class="input-group-text" id="basic-addon1"><i
													class="fas fa-equals"></i></span>
											</div>
											<input type="text" name="maths" id="defaultForm-email"
												style="border: 2px solid #8080803b;"
												placeholder="Enter Marks"
												value="<%=DataUtility.getStringData(dto.getMaths()).equals("0") ? ""
					: DataUtility.getStringData(dto.getMaths())%>">
											<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("maths", request)%></font>
										</div>
									</div>
								</div>
							</div>



							<%-- <span class="pl-sm-5"><b>Maths</b><span	style="color: red;">*</span></span> </br> 
	<label class="fas fa-equals prefix grey-text css" style="font-size: 1rem;"></label> 
	<input type="text" name="maths" id="defaultForm-email" style="border: 2px solid #8080803b;"
	placeholder="Enter Maths"
	value="<%=DataUtility.getStringData(dto.getMaths()).equals("0") ? ""
					: DataUtility.getStringData(dto.getMaths())%>">
	<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("maths", request)%></font></br> --%>

							<%
								if (id > 0) {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=MarksheetCtl.OP_UPDATE%>"> <input
									type="submit" name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=MarksheetCtl.OP_CANCEL%>">
							</div>

							<%
								} else {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=MarksheetCtl.OP_SAVE%>"> <input type="submit"
									name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=MarksheetCtl.OP_RESET%>">

							</div>

						</div>
						<%
							}
						%>
					</div>

				</div>

			</div>

		</form>
		</main>
		<div class="col-md-4 mb-4"></div>
	</div>



</body>
<%@include file="Footer.jsp"%>
</body>
</html>