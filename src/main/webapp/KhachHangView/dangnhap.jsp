<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="filedn/img/login/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="filedn/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="filedn/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="filedn/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="filedn/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="filedn/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="filedn/css/util.css">
<link rel="stylesheet" type="text/css" href="filedn/css/main.css">
<!--===============================================================================================-->

</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="filedn/img/logo/logo-tr.jpg" alt="IMG">
				</div>
				<%
					String tenDangNhap = request.getAttribute("tenDangNhap")+"";
					if(tenDangNhap.equals("null")) tenDangNhap = "";
					String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
				%>
				<form class="login100-form validate-form" action="<%=url %>/khach-hang" method="POST">
					<input type="hidden" name="hanhDong" value="dang-nhap">
					<span class="login100-form-title"> Member Login </span>

					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="tenDangNhap" value="<%=tenDangNhap %>"
							placeholder="Ursename"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-envelope"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="matKhau"
							placeholder="Password"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-lock"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">Login</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1"> Forgot </span> <a class="txt2" href="#">
							Username / Password? </a> <br />
						<%
						String baoLoi = request.getAttribute("baoLoi") + "";
						if (baoLoi.equals("null")) {
							baoLoi = "";
						}
						%>

						<span style="color: red"><%=baoLoi%></span>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="dangky.jsp"> Create your Account <i
							class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>

	


	<!--===============================================================================================-->
	<script src="filedn/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="filedn/vendor/bootstrap/js/popper.js"></script>
	<script src="filedn/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="filedn/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="filedn/vendor/tilt/tilt.jquery.min.js"></script>
	<script>
		$('.js-tilt').tilt({
			scale : 1.1
		})
	</script>
	<!--===============================================================================================-->
	<script src="filedn/js/main.js"></script>

</body>
</html>