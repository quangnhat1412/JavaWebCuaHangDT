package model;

import java.sql.Date;

public class PXuat {
	private int soPX;
	private KhachHang maKH;
	private NhanVien maNV;
	private Date ngayNhap;
	private double triGiaPN;
	private String ghiChuPN;

	public PXuat() {
		super();
	}

	public PXuat(int soPX, KhachHang maKH, NhanVien maNV, Date ngayNhap, double triGiaPN, String ghiChuPN) {
		super();
		this.soPX = soPX;
		this.maKH = maKH;
		this.maNV = maNV;
		this.ngayNhap = ngayNhap;
		this.triGiaPN = triGiaPN;
		this.ghiChuPN = ghiChuPN;
	}

	public int getSoPX() {
		return soPX;
	}

	public void setSoPX(int soPX) {
		this.soPX = soPX;
	}

	public KhachHang getMaKH() {
		return maKH;
	}

	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}

	public NhanVien getMaNV() {
		return maNV;
	}

	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getTriGiaPN() {
		return triGiaPN;
	}

	public void setTriGiaPN(double triGiaPN) {
		this.triGiaPN = triGiaPN;
	}

	public String getGhiChuPN() {
		return ghiChuPN;
	}

	public void setGhiChuPN(String ghiChuPN) {
		this.ghiChuPN = ghiChuPN;
	}

}
