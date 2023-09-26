<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<!-- Kiểm tra đã đăng nhập tài khoản hay chưa -->
				<%
				Object obj = session.getAttribute("khachHangTD");
				String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
						+ request.getContextPath();
				KhachHang kh = null;
				if (obj != null) {
					kh = (KhachHang) obj;
				}
				if (kh == null) {
				%>
				<h1>Bạn chưa đăng nhâp vào hệ thống, vui lòng đăng nhập</h1>
				<%
				} else {
				%>
				<form class="login100-form validate-form" action="<%=url %>/khach-hang"
					method="POST">
					<input type="hidden" name="hanhDong" value="doi-mat-khau" /> <span
						class="login100-form-title"> Change Password </span>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" id="matKhauCu"
							name="matKhauCu" placeholder="Old Password"> <span
							class="focus-input100"></span> <span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" id="matKhauMoi"
							name="matKhauMoi" placeholder="New Password"
							onkeyup="kiemTraMatKhau()"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-lock"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" id="matKhauMoiNhapLai"
							name="matKhauMoiNhapLai" placeholder="New Password Again"
							onkeyup="kiemTraMatKhau()"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-lock"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">Change</button>
					</div>

					<div class="text-center p-t-12">
						<%
						String baoLoi = request.getAttribute("baoLoi") + "";
						if (baoLoi.equals("null")) {
							baoLoi = "";
						}
						%>

						<span style="color: red" id="baoLoi"><%=baoLoi%></span> <span
							style="color: red" id="msg"></span>
					</div>

					<div class="text-center p-t-136"></div>
				</form>
				<%
				}
				%>

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
	<script>
		function kiemTraMatKhau() {
			matKhauMoi = document.getElementById("matKhauMoi").value;
			matKhauMoiNhapLai = document.getElementById("matKhauMoiNhapLai").value;
			if (matKhauMoi != matKhauMoiNhapLai) {
				document.getElementById("msg").innerHTML = "Password Incorrect";
				return false;
			} else {
				document.getElementById("msg").innerHTML = "";
				return true;
			}
		}
	</script>

</body>
</html>