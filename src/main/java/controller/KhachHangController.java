package controller;

import java.io.IOException;
import java.io.UTFDataFormatException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.KhachHangDAO;
import model.KhachHang;
import util.MaHoa;
import util.Mail;

/**
 * Servlet implementation class DangNhap_C
 */
@WebServlet("/khach-hang")
public class KhachHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KhachHangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Khai báo tiếng việt
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String hanhDong = request.getParameter("hanhDong");
		if (hanhDong.equals("dang-nhap")) {
			dangNhap(request, response);
		} else if (hanhDong.equals("dang-ky")) {
			dangKy(request, response);
		} else if (hanhDong.equals("dang-xuat")) {
			dangXuat(request, response);
		} else if (hanhDong.equals("doi-mat-khau")) {
			doiMatKhau(request, response);
		} else if (hanhDong.equals("thay-doi-thong-tin")) {
			thayDoiThongTin(request, response);
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private void thayDoiThongTin(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			String hoVaTen = request.getParameter("hoVaTen");
			String gioiTinh = request.getParameter("gioiTinh");
			boolean gt = false;
			if(gioiTinh.equals("true")) {
				gt = true;
			}
			String ngaySinh = request.getParameter("ngaySinh");
			String diaChiKhachHang = request.getParameter("diaChiKhachHang");
			String diaChiMuaHang = request.getParameter("diaChiMuaHang");
			String diaChiNhanHang = request.getParameter("diaChiNhanHang");
			int dienThoai = Integer.parseInt(request.getParameter("dienThoai"));
			String email = request.getParameter("email");
			
			String url = "";
			
			String baoLoi = "";
			
			KhachHangDAO khachHangDAO = new KhachHangDAO();

			request.setAttribute("baoLoi", baoLoi);
			
			
			if(baoLoi.length() > 0) {
				url = "/thaydoithongtin.jsp";
			}else {

				Object obj = request.getSession().getAttribute("khachHangTD");
				KhachHang khachHang = null;
				if (obj!=null)
					khachHang = (KhachHang)obj;		
					if(khachHang!=null){	
						int maKhachHang = khachHang.getMaKH();
						KhachHang kh = new KhachHang(maKhachHang, hoVaTen, Date.valueOf(ngaySinh) , gt, diaChiKhachHang, diaChiNhanHang, diaChiMuaHang, dienThoai, email, "","","");
						khachHangDAO.updateInfo(kh);
						// gán khách hàng vừa mới cập nhật lên lại session
						KhachHang kh2 = khachHangDAO.selectById(kh);
						request.getSession().setAttribute("khachHangTD", kh2);
						url = "/thanhcong.jsp";
					}
			}
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	private void dangNhap(HttpServletRequest request, HttpServletResponse response) {

		try {
			String tenDangNhap = request.getParameter("tenDangNhap");
			String matKhau_bt = request.getParameter("matKhau");

			String matkhau_SHA1 = MaHoa.toSHA1(matKhau_bt);

			request.setAttribute("tenDangNhap", tenDangNhap);
			String url = "";

			KhachHang kh = new KhachHang();
			kh.setTenDangNhap(tenDangNhap);
			kh.setMatKhau(matkhau_SHA1);

			KhachHangDAO khd = new KhachHangDAO();
			KhachHang khachHangTD = khd.selectByUserPass(kh);
			if (khachHangTD != null) // có nghĩ là tìm dc khách hàng có tên dăng nhập và mật khẩu trùng
			{
				// 1. Lấy session từ server
				HttpSession session = request.getSession();
				// 2. Set khachHangTD cho session
				session.setAttribute("khachHangTD", khachHangTD);
				url = "/index.jsp";
			} else {
				request.setAttribute("baoLoi", "Sai tên đăng nhập hoặc mật khẩu");
				url = "/KhachHangView/dangnhap.jsp";
			}

			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dangKy(HttpServletRequest request, HttpServletResponse response) {

		try {
			String tenDangNhap = request.getParameter("tenDangNhap");
			String Email = request.getParameter("emailKH");
			String matKhau = request.getParameter("matKhau");
			String matKhauNhapLai = request.getParameter("matKhauNhapLai");

			String url = "";
			String baoLoi = "";
			KhachHangDAO khd = new KhachHangDAO();
			if (!matKhau.equals(matKhauNhapLai)) {

				baoLoi += "Mật khẩu nhập lại không trùng khớp \n";
			} else if (khd.kiemTraTenDangNhap(tenDangNhap)) {

				baoLoi += "Tên đăng nhập đã tồn tại \n";
			} else if (khd.kiemTraEmail(Email)) {

				baoLoi += "Email đã tồn tại";
			}

			if (baoLoi.length() > 0) {
				request.setAttribute("baoLoi", baoLoi);
				url = "/KhachHangView/dangky.jsp";
			} else {
				String matKhauSHA1 = MaHoa.toSHA1(matKhau);
				KhachHang kh = new KhachHang();
				kh.setTenDangNhap(tenDangNhap);
				kh.setMatKhau(matKhauSHA1);
				kh.setEmailKH(Email);
				if (Mail.sendEmail(Email, "Vũ trụ công nghệ", "Chúc mùng bạn đã đăng ký tài khoản thành công")) {
					khd.insert(kh);
				} else {
					return;
				}

				url = "/thanhcong.jsp";
			}

			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dangXuat(HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession();
			// Hủy bỏ session
			session.invalidate();

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doiMatKhau(HttpServletRequest request, HttpServletResponse response) {
		try {
			String matKhauHienTai = request.getParameter("matKhauCu");
			String matKhauMoi = request.getParameter("matKhauMoi");
			String matKhauMoiNhapLai = request.getParameter("matKhauMoiNhapLai");

			String matKhauHienTai_Sha1 = MaHoa.toSHA1(matKhauHienTai);

			String baoLoi = "";
			String url = "/KhachHangView/doimatkhau.jsp";

			// Kiem tra mat khau cu co giong hay khong
			HttpSession session = request.getSession();
			Object obj = session.getAttribute("khachHangTD");
			KhachHang khachHang = null;
			if (obj != null)
				khachHang = (KhachHang) obj;
			if (khachHang == null) {
				baoLoi = "Bạn chưa đăng nhập vào hệ thống!";
			} else {
				// Neu khach hang da dang nhap
				if (!matKhauHienTai_Sha1.equals(khachHang.getMatKhau())) {
					baoLoi = "Mật khẩu hiện tại không chính xác!";
				} else {
					if (!matKhauMoi.equals(matKhauMoiNhapLai)) {
						baoLoi = "Mật khẩu nhập lại không khớp!";
					} else {
						String matKhauMoi_Sha1 = MaHoa.toSHA1(matKhauMoi);
						khachHang.setMatKhau(matKhauMoi_Sha1);
						KhachHangDAO khd = new KhachHangDAO();
						if (khd.changePassword(khachHang)) {
							baoLoi = "Mật khẩu đã thay đổi thành công!";
							url = "/thanhcong.jsp";
						} else {
							baoLoi = "Quá trình thay đổi mật khẩu không thành công!";
						}
					}
				}
			}

			request.setAttribute("baoLoi", baoLoi);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
