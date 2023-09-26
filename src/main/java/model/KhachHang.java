package model;

import java.sql.Date;
import java.util.Objects;

public class KhachHang {
	private int maKH; 
	private String tenKH;
	private Date ngaySinhKH;
	private boolean gioiTinhKH;
	private String diaChiKH;
	private String diaChiNhanHangKH;
	private String diaChiMuaHangKH;
	private int sdtKH;
	private String emailKH;
	private String tenDangNhap;
	private String matKhau;
	private String ghiChuKH;
	
	
	public KhachHang() {
		super();
	}


	public KhachHang(int maKH, String tenKH, Date ngaySinhKH, boolean gioiTinhKH, String diaChiKH,
			String diaChiNhanHangKH, String diaChiMuaHangKH, int sdtKH, String emailKH, String tenDangNhap,
			String matKhau, String ghiChuKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.ngaySinhKH = ngaySinhKH;
		this.gioiTinhKH = gioiTinhKH;
		this.diaChiKH = diaChiKH;
		this.diaChiNhanHangKH = diaChiNhanHangKH;
		this.diaChiMuaHangKH = diaChiMuaHangKH;
		this.sdtKH = sdtKH;
		this.emailKH = emailKH;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.ghiChuKH = ghiChuKH;
	}


	public int getMaKH() {
		return maKH;
	}


	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}


	public String getTenKH() {
		return tenKH;
	}


	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}


	public Date getNgaySinhKH() {
		return ngaySinhKH;
	}


	public void setNgaySinhKH(Date ngaySinhKH) {
		this.ngaySinhKH = ngaySinhKH;
	}


	public boolean isGioiTinhKH() {
		return gioiTinhKH;
	}


	public void setGioiTinhKH(boolean gioiTinhKH) {
		this.gioiTinhKH = gioiTinhKH;
	}


	public String getDiaChiKH() {
		return diaChiKH;
	}


	public void setDiaChiKH(String diaChiKH) {
		this.diaChiKH = diaChiKH;
	}


	public String getDiaChiNhanHangKH() {
		return diaChiNhanHangKH;
	}


	public void setDiaChiNhanHangKH(String diaChiNhanHangKH) {
		this.diaChiNhanHangKH = diaChiNhanHangKH;
	}


	public String getDiaChiMuaHangKH() {
		return diaChiMuaHangKH;
	}


	public void setDiaChiMuaHangKH(String diaChiMuaHangKH) {
		this.diaChiMuaHangKH = diaChiMuaHangKH;
	}


	public int getSdtKH() {
		return sdtKH;
	}


	public void setSdtKH(int sdtKH) {
		this.sdtKH = sdtKH;
	}


	public String getEmailKH() {
		return emailKH;
	}


	public void setEmailKH(String emailKH) {
		this.emailKH = emailKH;
	}


	public String getTenDangNhap() {
		return tenDangNhap;
	}


	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}


	public String getMatKhau() {
		return matKhau;
	}


	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}


	public String getGhiChuKH() {
		return ghiChuKH;
	}


	public void setGhiChuKH(String ghiChuKH) {
		this.ghiChuKH = ghiChuKH;
	}


	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return maKH == other.maKH;
	}

	
	
	
}
