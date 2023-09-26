package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.KhachHang;
import util.String_Date;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	public ArrayList<KhachHang> khs = new ArrayList<KhachHang>();

	@Override
	public ArrayList<KhachHang> selectAll() {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "SELECT * FROM khachhang";
			PreparedStatement pst = conn.prepareStatement(sql);

			// 3. Thực thi câu lệnh sql
			ResultSet rs = pst.executeQuery();

			// 4. Đọc các dòng trong list vừa tìm dc
			while (rs.next()) {
				int maKH = rs.getInt("maKH");
				String tenTH = rs.getString("tenKH");
				Date ngaySinhKH = rs.getDate("ngaySinhKH");
				boolean gioiTinhKH = rs.getBoolean("gioiTinhKH");
				String diaChiKH = rs.getString("diaChiKH");
				String diachiNH = rs.getString("diaChiNhanHangKH");
				String diachiMH = rs.getString("diaChiMuaHangKH");
				String emailKH = rs.getString("EmailKH");
				int sdtKH = rs.getInt("SDTKH");
				String tenDangNhap = rs.getString("tenDangNhap");
				String matKhau = rs.getString("matKhau");
				String ghiChuKH = rs.getString("ghichuKH");

				KhachHang kh = new KhachHang(maKH, tenTH, ngaySinhKH, gioiTinhKH, diaChiKH, diachiNH, diachiMH, sdtKH,
						emailKH, tenDangNhap, matKhau, ghiChuKH);

				khs.add(kh);

			}
			// 5. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Lấy dữ liệu tất cả khách hàng thất bại !!!");
			e.printStackTrace();
		}
		return khs;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		KhachHang kh = null;
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "SELECT * FROM khachhang WHERE makh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, t.getMaKH());

			// 3. Thực thi câu lệnh sql
			ResultSet rs = pst.executeQuery();

			// 4. Đọc các dòng trong list vừa tìm dc
			while (rs.next()) {
				int maKH = rs.getInt("maKH");
				String tenTH = rs.getString("tenKH");
				Date ngaySinhKH = rs.getDate("ngaySinhKH");
				boolean gioiTinhKH = rs.getBoolean("gioiTinhKH");
				String diaChiKH = rs.getString("diaChiKH");
				String diachiNH = rs.getString("diaChiNhanHangKH");
				String diachiMH = rs.getString("diaChiMuaHangKH");
				String emailKH = rs.getString("EmailKH");
				int sdtKH = rs.getInt("SDTKH");
				String tenDangNhap = rs.getString("tenDangNhap");
				String matKhau = rs.getString("matKhau");
				String ghiChuKH = rs.getString("ghichuKH");

				kh = new KhachHang(maKH, tenTH, ngaySinhKH, gioiTinhKH, diaChiKH, diachiNH, diachiMH, sdtKH, emailKH,
						tenDangNhap, matKhau, ghiChuKH);

			}
			// 5. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Tìm kiếm khách hàng thất bại !!!");
			e.printStackTrace();
		}
		return kh;
	}

	@Override
	public boolean insert(KhachHang t) {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "INSERT INTO khachhang"
					+ "(maKH, TenKH, NgaySinhKH, GioiTinhKH, DiaChiKH, DiaChiNhanHangKH, DiaChiMuaHangKH, EmailKH, SDTKH, TenDangNhap, MatKhau, GhiChuKH)"
					+ "VALUE (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, 0);
			pst.setString(2, t.getTenKH());
			pst.setDate(3, t.getNgaySinhKH());
			pst.setBoolean(4, t.isGioiTinhKH());
			pst.setString(5, t.getDiaChiKH());
			pst.setString(6, t.getDiaChiNhanHangKH());
			pst.setString(7, t.getDiaChiMuaHangKH());
			pst.setString(8, t.getEmailKH());
			pst.setInt(9, t.getSdtKH());
			pst.setString(10, t.getTenDangNhap());
			pst.setString(11, t.getMatKhau());
			pst.setString(12, t.getGhiChuKH());

			// 3. Thực thi câu lệnh sql
			int kq = pst.executeUpdate();
			System.out.println("Đã thực thi: " + sql);
			System.out.println("Đã thêm " + kq + " dòng");

			// 4. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Thêm khách hàng thất bại !!!");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(KhachHang t) {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "UPDATE khachhang SET " + "(TenKH = ?, NgaySinhKH = ?, "
					+ "GioiTinhKH = ?, DiaChiKH = ?, DiaChiNhanHangKH = ?, "
					+ "DiaChiMuaHangKH = ?, EmailKH = ?, SDTKH = ?, " + "TenDangNhap = ?, MatKhau = ?, GhiChuKH = ?)"
					+ " WHERE MaKH =?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getTenKH());
			pst.setDate(2, t.getNgaySinhKH());
			pst.setBoolean(3, t.isGioiTinhKH());
			pst.setString(4, t.getDiaChiKH());
			pst.setString(5, t.getDiaChiNhanHangKH());
			pst.setString(6, t.getDiaChiMuaHangKH());
			pst.setString(7, t.getEmailKH());
			pst.setInt(8, t.getSdtKH());
			pst.setString(9, t.getTenDangNhap());
			pst.setString(10, t.getMatKhau());
			pst.setString(11, t.getGhiChuKH());

			pst.setInt(12, t.getMaKH());

			// 3. Thực thi câu lệnh sql
			int kq = pst.executeUpdate();
			System.out.println("Đã thực thi: " + sql);
			System.out.println("Đã cập nhập " + kq + " dòng");

			// 4. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("cập nhật khách hàng thất bại !!!");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(KhachHang t) {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "DELETE FROM khachhang WHERE MaKH =?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, t.getMaKH());

			// 3. Thực thi câu lệnh sql
			int kq = pst.executeUpdate();
			System.out.println("Đã thực thi: " + sql);
			System.out.println("Đã xóa " + kq + " dòng");

			// 4. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("cập nhật khách hàng thất bại !!!");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
// Hàm riêng của khách hàng
	
	// Hàm kiểm tra tên đăng nhập
	public boolean kiemTraTenDangNhap(String tenDangNhap) {
		boolean ketQua = false;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM khachhang WHERE tenDangNhap=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, tenDangNhap);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				ketQua = true;
			}

			// Bước 5:
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}
	
	// Hàm kiểm tra email
		public boolean kiemTraEmail(String email) {
			boolean ketQua = false;
			try {
				// Bước 1: tạo kết nối đến CSDL
				Connection conn = JDBC.getConnection();

				// Bước 2: tạo ra đối tượng statement
				String sql = "SELECT * FROM khachhang WHERE emailKH=?";
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1, email);

				// Bước 3: thực thi câu lệnh SQL
				System.out.println(sql);
				ResultSet rs = st.executeQuery();

				// Bước 4:
				while (rs.next()) {
					ketQua = true;
				}

				// Bước 5:
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return ketQua;
		}
	
	
	// Hàm đăng nhập tìm khách hàng theo tên đăng nhập và mật khẩu
	public KhachHang selectByUserPass(KhachHang t) {
		KhachHang kh = null;
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "SELECT * FROM khachhang WHERE TenDangnhap=? and MatKhau=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getTenDangNhap());
			pst.setString(2, t.getMatKhau());

			// 3. Thực thi câu lệnh sql
			ResultSet rs = pst.executeQuery();

			// 4. Đọc các dòng trong list vừa tìm dc
			while (rs.next()) {
				int maKH = rs.getInt("maKH");
				String tenTH = rs.getString("tenKH");
				Date ngaySinhKH = rs.getDate("ngaySinhKH");
				boolean gioiTinhKH = rs.getBoolean("gioiTinhKH");
				String diaChiKH = rs.getString("diaChiKH");
				String diachiNH = rs.getString("diaChiNhanHangKH");
				String diachiMH = rs.getString("diaChiMuaHangKH");
				String emailKH = rs.getString("EmailKH");
				int sdtKH = rs.getInt("SDTKH");
				String tenDangNhap = rs.getString("tenDangNhap");
				String matKhau = rs.getString("matKhau");
				String ghiChuKH = rs.getString("ghichuKH");

				kh = new KhachHang(maKH, tenTH, ngaySinhKH, 
						gioiTinhKH, diaChiKH, diachiNH, 
						diachiMH, sdtKH, emailKH,
						tenDangNhap, matKhau, ghiChuKH);

			}
			// 5. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Tìm kiếm khách hàng thất bại !!!");
			e.printStackTrace();
		}
		return kh;
	}
	
	// Hàm đổi mật khẩu
	public boolean changePassword(KhachHang t) {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "UPDATE khachhang SET matkhau = ? WHERE MaKH =?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMatKhau());
			pst.setInt(2, t.getMaKH());
			

			// 3. Thực thi câu lệnh sql
			int kq = pst.executeUpdate();
			System.out.println("Đã thực thi: " + sql);
			System.out.println("Đã cập nhập " + kq + " dòng");

			// 4. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("cập nhật khách hàng thất bại !!!");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean updateInfo(KhachHang t) {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "UPDATE khachhang SET " + "TenKH = ?, NgaySinhKH = ?, "
					+ "GioiTinhKH = ?, DiaChiKH = ?, DiaChiNhanHangKH = ?, "
					+ "DiaChiMuaHangKH = ?, EmailKH = ?, SDTKH = ? "
					+ " WHERE MaKH =?";

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getTenKH());
			pst.setDate(2, t.getNgaySinhKH());
			pst.setBoolean(3, t.isGioiTinhKH());
			pst.setString(4, t.getDiaChiKH());
			pst.setString(5, t.getDiaChiNhanHangKH());
			pst.setString(6, t.getDiaChiMuaHangKH());
			pst.setString(7, t.getEmailKH());
			pst.setInt(8, t.getSdtKH());
			
			pst.setInt(9, t.getMaKH());

			// 3. Thực thi câu lệnh sql
			int kq = pst.executeUpdate();
			System.out.println("Đã thực thi: " + sql);
			System.out.println("Đã cập nhập " + kq + " dòng");

			// 4. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("cập nhật khách hàng thất bại !!!");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		KhachHangDAO khd = new KhachHangDAO();
		
		KhachHang k1 = new KhachHang(11, "Trần QUang Nhật", String_Date.Convert("14/12/2002") , false, "Tân Biên", "Tây Ninh", "Hà nội", 0213213213 , "quangnhat1412@gmail.com", null, null, null);
		
		if(khd.updateInfo(k1)) {
			System.out.println("Thanh cong");
		}else {
			System.out.println("that bai");	
		}
		
	}

}
