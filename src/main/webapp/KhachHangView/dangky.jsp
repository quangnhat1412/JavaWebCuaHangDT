<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Ký Tài Khoản</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="filedk/css/style.css">
</head>
<body class="img" style="background-image: url(filedk/images/bg.jpg);">
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Đăng ký thành viên</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-7 col-lg-5">
					<div class="login-wrap">
						<h3 class="text-center mb-4">Create Your Account</h3>
						<%
							String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
							+ request.getContextPath();
							String baoLoi = request.getAttribute("baoLoi")+"";
							if(baoLoi.equals("null")){
								baoLoi="";
							}
						%>
						<form action="<%=url %>/khach-hang" class="signup-form" method="POST">
							<input type="hidden" name="hanhDong" value="dang-ky">
							<div class="form-group mb-3">
								<label class="label" for="name">User Name</label> <input
									type="text" id="tenDangNhap" name="tenDangNhap" required="required"
									class="form-control" placeholder="cdgtvt2023"> <span
									class="icon fa fa-user-o"></span>
							</div>
							<div class="form-group mb-3">
								<label class="label" for="email">Email Address</label> <input
									type="email" id="emailKH" name="emailKH" required="required" class="form-control"
									placeholder="johndoe@gmail.com"> <span
									class="icon fa fa-paper-plane-o"></span>
							</div>
							<div class="form-group mb-3">
								<label class="label" for="password">Password</label> <input
									id="password" name="matKhau" required="required" type="password"
									class="form-control" placeholder="Password"> <span
									class="fa fa-fw fa-eye field-icon toggle-password"></span> <span
									class="icon fa fa-lock"></span>
							</div>
							<div class="form-group mb-3">
								<label class="label" for="password">Password</label> <input
									id="password-confirm" name="matKhauNhapLai" type="password"
									class="form-control" required="required" placeholder="Password"> <span
									class="fa fa-fw fa-eye field-icon toggle-password"></span> <span
									class="icon fa fa-lock"></span>
							</div>
							<div class="form-group">
								<button type="submit" class="form-control btn btn-primary submit px-3">Sign Up</button>
								<span style="color: red;"><%=baoLoi %></span>
							</div>
						</form>
						<p>
							I'm already a member! 
							<a data-toggle="tab" href="dangnhap.jsp">Sign In</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="filedk/js/jquery.min.js"></script>
	<script src="filedk/js/popper.js"></script>
	<script src="filedk/js/bootstrap.min.js"></script>
	<script src="filedk/js/main.js"></script>

</body>
</html>