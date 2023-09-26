package model;

import java.sql.Date;
import java.util.Objects;

public class NhanVien {
	private int maNV;
	private String tenNV;
	private Date ngaySinhNV;
	private boolean gioiTinhNV;
	private String diaChiNV;
	private String emailNV;
	private String phongBan;
	private Date ngayBD;
	private int heSoLuong;
	private String chucVu;
	private int stkNV;
	private int sdtNV;
	private String ghiChu;

	public NhanVien() {
		super();
	}

	public NhanVien(int maNV, String tenNV, Date ngaySinhNV, boolean gioiTinhNV, String diaChiNV, String emailNV,
			String phongBan, Date ngayBD, int heSoLuong, String chucVu, int stkNV, int sdtNV, String ghiChu) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaySinhNV = ngaySinhNV;
		this.gioiTinhNV = gioiTinhNV;
		this.diaChiNV = diaChiNV;
		this.emailNV = emailNV;
		this.phongBan = phongBan;
		this.ngayBD = ngayBD;
		this.heSoLuong = heSoLuong;
		this.chucVu = chucVu;
		this.stkNV = stkNV;
		this.sdtNV = sdtNV;
		this.ghiChu = ghiChu;
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public Date getNgaySinhNV() {
		return ngaySinhNV;
	}

	public void setNgaySinhNV(Date ngaySinhNV) {
		this.ngaySinhNV = ngaySinhNV;
	}

	public boolean isGioiTinhNV() {
		return gioiTinhNV;
	}

	public void setGioiTinhNV(boolean gioiTinhNV) {
		this.gioiTinhNV = gioiTinhNV;
	}

	public String getDiaChiNV() {
		return diaChiNV;
	}

	public void setDiaChiNV(String diaChiNV) {
		this.diaChiNV = diaChiNV;
	}

	public String getEmailNV() {
		return emailNV;
	}

	public void setEmailNV(String emailNV) {
		this.emailNV = emailNV;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public Date getNgayBD() {
		return ngayBD;
	}

	public void setNgayBD(Date ngayBD) {
		this.ngayBD = ngayBD;
	}

	public int getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public int getStkNV() {
		return stkNV;
	}

	public void setStkNV(int stkNV) {
		this.stkNV = stkNV;
	}

	public int getSdtNV() {
		return sdtNV;
	}

	public void setSdtNV(int sdtNV) {
		this.sdtNV = sdtNV;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return maNV == other.maNV;
	}
	

}
