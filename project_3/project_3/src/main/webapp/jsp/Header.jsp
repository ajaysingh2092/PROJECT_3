<%@page import="in.co.rays.project_3.ctl.LoginCtl"%>
<%@page import="in.co.rays.project_3.dto.RoleDTO"%>
<%@page import="in.co.rays.project_3.dto.UserDTO"%>
<%@page import="in.co.rays.project_3.ctl.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Header</title>
<title>jQuery UI Datepicker - Display month &amp; year menus</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
  <script>
  
  /* var d = new Date();
  function disableSunday(d){
  	  var day = d.getDay();
  	  if(day==0)
  	  {
  	   return [false];
  	  }else
  	  {
  		  return [true];
  	  }
  } */
  $( function() {
    $( "#datepicker" ).datepicker({
      changeMonth: true,
      changeYear: true,
      yearRange : '1970:2030',
      dateFormat:'mm/dd/yy'
     
    });
  } );
  </script>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>

	<% UserDTO userDto=(UserDTO)session.getAttribute("user");
	
		boolean userLoggedIn=userDto!=null;
		
		String welcomeMsg="Hi, ";
		if(userLoggedIn){
			String role=(String)session.getAttribute("role");
			welcomeMsg+=userDto.getFirstName() + "("+role+")";
		}else{
			welcomeMsg+="Guest";
		}
	
	%>
	<div class="header">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> 
		<a class="navbar-brand" href="<%=ORSView.WELCOME_CTL%>"><img
			src="<%=ORSView.APP_CONTEXT%>/img/custom.png" width="90px"
			height="35px"><!-- <i class="fa fa-home " ></i> --></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="nav navbar-nav ml-auto">
				<a class="nav-link" href="#"> <span class="sr-only">(current)</span>
				</a>
				<%
					if (userLoggedIn) {
				%>
				<%
					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				%>
				<li class="nav-item dropdown">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Marksheet</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="<%=ORSView.MARKSHEET_MERIT_LIST_CTL%>">
						<i class="	far fa-file-alt"></i>Marksheet Merit List</a>
					</div></li>

				<li class="nav-item dropdown">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">User</font>
				</a>
				 <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		<li><a class="dropdown-item" href="<%=ORSView.MY_PROFILE_CTL%>"><i class="fas fa-user-tie"></i>My Profile</a> 
		<a class="dropdown-item" href="<%=ORSView.CHANGE_PASSWORD_CTL%>"><i class="	far fa-file-alt"></i>Change Password</a>
					</div></li>
				<%
					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				%>

				<li class="nav-item dropdown" style="padding-left: 20px;">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">User</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.USER_CTL%>">
						<i class="fas fa-user-circle"></i>Add User</a> 
							<a class="dropdown-item" href="<%=ORSView.USER_LIST_CTL%>"><i
							class="fas fa-user-friends"></i>User List</a>
					</div></li>

				<li class="nav-item dropdown" style="padding-left: 20px">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Marksheet</font></a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.MARKSHEET_CTL%>">
						<i class="far fa-file"></i>Add Marksheet</a> 
						
						<a class="dropdown-item" href="<%=ORSView.MARKSHEET_LIST_CTL%>">
						<i class="fas fa-paste"></i>Marksheet List</a> 
						
						<a class="dropdown-item" href="<%=ORSView.MARKSHEET_MERIT_LIST_CTL%>">
						<i class="	far fa-file-alt"></i>Marksheet Merit List </a> 
						
						<a class="dropdown-item" href="<%=ORSView.GET_MARKSHEET_CTL%>">
						<i class="fas fa-paste"></i>Get Marksheet</a>
						
					</div></li>

				<li class="nav-item dropdown" style="padding-left: 20px">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Role</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.ROLE_CTL%>">
						<i class="fa	 fa-user-tie"></i>Add Role</a> <a class="dropdown-item"
							href="<%=ORSView.ROLE_LIST_CTL%>">
						<i	class="fas fa-user-friends"></i>Role List</a>
					</div></li>
				<li class="nav-item dropdown" style="padding-left: 20px">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">College</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.COLLEGE_CTL%>">
						<i class="fas fa-university"></i>Add College</a> 
						<a class="dropdown-item" href="<%=ORSView.COLLEGE_LIST_CTL%>">
						<i class="fas fa-building"></i>College List </a>
					</div></li>
				<li class="nav-item dropdown" style="padding-left: 20px">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Course
					</font></a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.COURSE_CTL%>">
						<i class="fas fa-book-open"></i>Add Course</a> <a class="dropdown-item"
							href="<%=ORSView.COURSE_LIST_CTL%>">
						<i class="fas fa-sort-amount-down"></i>Course List </a>
					</div></li>
				<li class="nav-item dropdown" style="padding-left: 20px">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Student</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.STUDENT_CTL%>">
						<i class="far fa-user-circle"></i>Add Student</a> 
						<a class="dropdown-item" href="<%=ORSView.STUDENT_LIST_CTL%>">
						<i class="fas fa-users"></i>Student List</a>
					</div></li>
				<li class="nav-item dropdown" style="padding-left: 20px">
				<a	class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Faculty
					</font></a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					  <a class="dropdown-item" href="<%=ORSView.FACULTY_CTL%>">
					  <i class="fas fa-user-tie"></i>Add Faculty</a> <a class="dropdown-item"
							href="<%=ORSView.FACULTY_LIST_CTL%>"><i class="	fas fa-users"></i>Faculty List</a>
					</div></li>

				<li class="nav-item dropdown" style="padding-left: 20px"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Time
							Table</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.TIMETABLE_CTL%>"><i
							class="far fa-clock"></i>Add TimeTable</a> <a class="dropdown-item"
							href="<%=ORSView.TIMETABLE_LIST_CTL%>"><i
							class="fas fa-clock"></i>TimeTable List</a>
					</div></li>
				<li class="nav-item dropdown" style="padding-left: 20px"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <font style="color: white;">Subject</font>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<%=ORSView.SUBJECT_CTL%>"><i
							class="fas fa-calculator"></i>Add Subject</a> <a
							class="dropdown-item" href="<%=ORSView.SUBJECT_LIST_CTL%>"> <i
							class="fas fa-sort-amount-down"></i>Subject List
						</a>
					</div></li>

				<%
					}
					}
				%>
				<li class="nav-item dropdown"
					style="padding-left: 20px; padding-right: 67px"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"><font style="color: white;"><%=welcomeMsg%>
					</font></a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<%
							if (userLoggedIn) {
						%>
						<a class="dropdown-item"
							href="<%=ORSView.LOGIN_CTL%>?operation=<%=LoginCtl.OP_LOG_OUT%>"><i
							class="fas fa-sign-out-alt"></i>Logout </a> <a class="dropdown-item"
							href="<%=ORSView.MY_PROFILE_CTL%>"><i class="fas fa-user-tie"></i>My
							Profile</a> <a class="dropdown-item"
							href="<%=ORSView.CHANGE_PASSWORD_CTL%>"> <i
							class="fas fa-edit"></i>Change Password
						</a> <a class="dropdown-item" href="<%=ORSView.JAVA_DOC_VIEW%>" target="blank"><i
							class="fas fa-clone"></i>Java Doc </a>
						<%
							} else {
						%>
						<a class="dropdown-item" href="<%=ORSView.LOGIN_CTL%>"><i
							class="fa fa-sign-in-alt"></i> Login <a class="dropdown-item"
							href="<%=ORSView.USER_REGISTRATION_CTL%>"><i
								class="fas fa-registered"></i> User Registration</a> <%-- <a
							class="dropdown-item" href="<%=ORSView.FORGET_PASSWORD_CTL%>">
								<i class="fa fa-lock"></i>Forget Password
						</a> --%></a>
					</div></li>
				<%
					}
				%>
			</ul>
		</div>
		</nav>
	</div>

</body>
</html>