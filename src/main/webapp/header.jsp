<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="header-area">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="user-menu">
					<ul>
						<li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
						<li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
						<li><a href="cart.jsp"><i class="fa fa-user"></i> MyCart</a></li>
					</ul>
				</div>
			</div>

			<div class="col-md-6">
				<div class="header-right">
					<ul class="list-unstyled list-inline">

						<li class="dropdown dropdown-small"><a data-toggle="dropdown"
							data-hover="dropdown" class="dropdown-toggle" href="#"><span
								class="key">language :</span><span class="value">English
							</span><b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">English</a></li>
								<li><a href="#">French</a></li>
								<li><a href="#">German</a></li>
							</ul></li>
						<%
						Object obj = session.getAttribute("khachHangTD");
						KhachHang kh = null;
						if (obj != null) {
							kh = (KhachHang) obj;
						}
						if (kh == null) {
						%>
						<li><a href="KhachHangView/dangnhap.jsp"> <i
								class="fa fa-user"></i> Login
						</a></li>
						<%
						} else {
						%>
						<li class="dropdown dropdown-small"><a data-toggle="dropdown"
							data-hover="dropdown" class="dropdown-toggle" href="#"> <span
								class="key">Welcome: <%=kh.getTenDangNhap()%></span> <b
								class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<%
								String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
										+ request.getContextPath();
								%>
								<li><a href="#">Lịch sử mua hàng</a></li>
								<li><a href="KhachHangView/thaydoithongtin.jsp">Thông tin khách hàng</a></li>
								<li><a href="KhachHangView/doimatkhau.jsp">Đổi mật khẩu</a></li>
								<li><a href="<%=url%>/khach-hang?hanhDong=dang-xuat">Đăng Xuất</a></li>
							</ul></li>
						<%
						}
						%>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End header area -->

<div class="site-branding-area">
	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<div class="logo">
					<h1>
						<a href="./"> <img src="img/logo-tr.jpg">
						</a>
					</h1>
					<div class="pyro">
						<div class="before"></div>
						<div class="after"></div>
					</div>
				</div>
			</div>
			<div class="col-sm-8">
				<div class="header-menu">
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav list-inline">
							<li><a href="index.jsp">Home</a></li>
							<li><a href="shop.jsp">Shop page</a></li>
							<li><a href="single-product.jsp">Single product</a></li>
							<li><a href="cart.jsp">Cart</a></li>
							<li><a href="checkout.jsp">Checkout</a></li>

						</ul>
					</div>
				</div>
			</div>

			<div class="col-sm-2">
				<div class="shopping-item">
					<a href="cart.jsp"> Cart - <span class="cart-amunt">$100</span>
						<i class="fa fa-shopping-cart"></i> <span class="product-count">5</span>
					</a>
				</div>
			</div>

		</div>
	</div>
</div>
<!-- End site branding area -->

<!-- End mainmenu area -->