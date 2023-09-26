package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DanhMucSP;
import model.SanPham;

public class SanPhamDao implements DAOInterface<SanPham> {
	
	public ArrayList<SanPham> sanphams = new ArrayList<SanPham>(); 
	
	@Override
	public ArrayList<SanPham> selectAll() {
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "SELECT * FROM SanPham";
			PreparedStatement pst = conn.prepareStatement(sql);

			// 3. Thực thi câu lệnh sql
			ResultSet rs = pst.executeQuery();

			// 4. Đọc các dòng trong list vừa tìm dc
			while (rs.next()) {
				int maSP = rs.getInt("MaSP");
				int maLoaiSP = rs.getInt("MaLoaiSP");
				String tenSP = rs.getString("tenSP");
				double donGiaSP = rs.getDouble("dongiaSP");
				int soLuongSP = rs.getInt("soluongsp");
				String mauSac = rs.getString("mauSac");
				String GhiChuSP = rs.getString("ghiChuSP");
				
				DanhMucSPDAO dmdao = new DanhMucSPDAO();
				DanhMucSP dmsp = dmdao.FindById(maLoaiSP);
				SanPham sp = new SanPham(maSP, dmsp , tenSP, donGiaSP, soLuongSP, mauSac, GhiChuSP);
				sanphams.add(sp);
			}
			// 5. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Lấy dữ liệu tất cả khách hàng thất bại !!!");
			e.printStackTrace();
		}
		return sanphams;
	}

	@Override
	public SanPham selectById(SanPham t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(SanPham t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(SanPham t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(SanPham t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		SanPhamDao spdao = new SanPhamDao();
		ArrayList<SanPham> sps = spdao.selectAll();
		for(SanPham sp : sps) {
			System.out.println(sp.getMaLoaiSP().getTenLoaiSP());
			System.out.println(sp);
		}
	}

}
