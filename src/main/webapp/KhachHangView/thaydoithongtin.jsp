<%@page import="java.sql.Date"%>
<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thay đổi thông tin</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
	integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
	crossorigin="anonymous"></script>
<style>
.red {
	color: red;
}
</style>
<body>
	<%
	Object obj = session.getAttribute("khachHangTD");
	KhachHang khachHang = null;
	if (obj != null)
		khachHang = (KhachHang) obj;
	if (khachHang == null) {
	%>
	<h1>Bạn chưa đăng nhập vào hệ thống. Vui lòng quay lại trang chủ!</h1>
	<%
	} else {
	%>
	<div class="container">
		<%
			String baoLoi = request.getAttribute("baoLoi") + "";
	
			baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;
	
			String hoVaTen = khachHang.getTenKH();
	
			Boolean gioiTinh = khachHang.isGioiTinhKH();
	
			Date ngaySinh = khachHang.getNgaySinhKH();
	
			String diaChiKhachHang = khachHang.getDiaChiKH();
	
			String diaChiMuaHang = khachHang.getDiaChiMuaHangKH();
	
			String diaChiNhanHang = khachHang.getDiaChiNhanHangKH();
	
			int dienThoai = khachHang.getSdtKH();
	
			String email = khachHang.getEmailKH();
	
			String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
					+ request.getContextPath();
		%>
		<div class="container">
			<div class="text-center">
				<h1>THÔNG TIN TÀI KHOẢN</h1>
			</div>

			<div class="red" id="baoLoi">
				<%=baoLoi%>
			</div>
			<form class="form" action="<%=url%>/khach-hang" method="post">
				<input type="hidden" name="hanhDong" value="thay-doi-thong-tin" />
				<div class="row">
					<div class="col-sm-6">

						<h3>Thông tin khách hàng</h3>
						<div class="mb-3">
							<label for="hoVaTen" class="form-label">Họ và tên</label> <input
								type="text" class="form-control" id="hoVaTen" name="hoVaTen"
								value="<%=hoVaTen%>">
						</div>
						<div class="mb-3">
							<label for="gioiTinh" class="form-label">Giới tính</label> <select
								class="form-control" id="gioiTinh" name="gioiTinh">
								<option></option>
								<option value="true"
									<%=(gioiTinh == true) ? "selected='selected'" : ""%>>Nam</option>
								<option value="false"
									<%=(gioiTinh == false) ? "selected='selected'" : ""%>>Nữ</option>

							</select>
						</div>
						<div class="mb-3">
							<label for="ngaySinh" class="form-label">Ngày sinh</label> <input
								type="date" class="form-control" id="ngaySinh" name="ngaySinh"
								value="<%=ngaySinh%>">
						</div>
						<div class="mb-3">
							<label for="email" class="form-label">Email</label> <input
								type="email" class="form-control" id="email" name="email"
								value="<%=email%>">
						</div>
					</div>
					<div class="col-sm-6">
						<h3>Địa chỉ</h3>
						<div class="mb-3">
							<label for="diaChiKhachHang" class="form-label">Địa chỉ
								liên lạc khách hàng</label> <input type="text" class="form-control"
								id="diaChiKhachHang" name="diaChiKhachHang"
								value="<%=diaChiKhachHang%>">
						</div>
						<div class="mb-3">
							<label for="diaChiMuaHang" class="form-label">Địa chỉ mua
								hàng</label> <input type="text" class="form-control" id="diaChiMuaHang"
								name="diaChiMuaHang" value="<%=diaChiMuaHang%>">
						</div>
						<div class="mb-3">
							<label for="diaChiNhanHang" class="form-label">Địa chỉ
								nhận hàng</label> <input type="text" class="form-control"
								id="diaChiNhanHang" name="diaChiNhanHang"
								value="<%=diaChiNhanHang%>">
						</div>
						<div class="mb-3">
							<label for="dienThoai" class="form-label">Điện thoại</label> <input
								type="tel" class="form-control" id="dienThoai" name="dienThoai"
								value="<%=dienThoai%>">
						</div>
					</div>
				</div>
				<hr />
				<div>
					<input class="btn btn-primary" style="width: 150px" type="submit" value="Lưu thông tin" name="submit" id="submit" /> 
					<a href="../index.jsp" class="btn btn-primary"> Trở lại trang chủ</a>
				</div>
			</form>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>