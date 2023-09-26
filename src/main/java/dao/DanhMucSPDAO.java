package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.DanhMucSP;
import model.KhachHang;
import model.SanPham;

public class DanhMucSPDAO implements DAOInterface<DanhMucSP> {

	@Override
	public ArrayList<DanhMucSP> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DanhMucSP selectById(DanhMucSP t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(DanhMucSP t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(DanhMucSP t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(DanhMucSP t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public DanhMucSP FindById(int maloaisp) {
		DanhMucSP dmsp = null;
		try {
			// 1. Tạo kết nối đến CSDL
			Connection conn = JDBC.getConnection();

			// 2. Tạo đối tượng PreparedStatement
			String sql = "SELECT * FROM DanhMucSP WHERE maloaisp=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, maloaisp);

			// 3. Thực thi câu lệnh sql
			ResultSet rs = pst.executeQuery();

			// 4. Đọc các dòng trong list vừa tìm dc
			while (rs.next()) {
				int madm = rs.getInt("maloaisp");
				String tendm = rs.getString("tenloaisp");
				
				dmsp = new DanhMucSP(maloaisp, tendm);

			}
			// 5. Đóng kết nối
			conn.close();
		} catch (Exception e) {
			System.out.println("Tìm kiếm khách hàng thất bại !!!");
			e.printStackTrace();
		}
		return dmsp;
		
	}
	public static void main(String[] args) {
		DanhMucSPDAO dmdao = new DanhMucSPDAO();
		DanhMucSP dm = dmdao.FindById(1);
		System.out.println(dm.getTenLoaiSP());
	}
	

}
