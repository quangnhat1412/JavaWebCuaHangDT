package model;

import java.sql.Date;

public class PNhap {
	private int soPN;
	private NhanVien maNV;
	private NhaCC maNCC;
	private Date ngayNhap;
	private double triGiaPN;
	private String ghiChuPN;

	public PNhap() {
		super();
	}

	public PNhap(int soPN, NhanVien maNV, NhaCC maNCC, Date ngayNhap, double triGiaPN, String ghiChuPN) {
		super();
		this.soPN = soPN;
		this.maNV = maNV;
		this.maNCC = maNCC;
		this.ngayNhap = ngayNhap;
		this.triGiaPN = triGiaPN;
		this.ghiChuPN = ghiChuPN;
	}

	public int getSoPN() {
		return soPN;
	}

	public void setSoPN(int soPN) {
		this.soPN = soPN;
	}

	public NhanVien getMaNV() {
		return maNV;
	}

	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}

	public NhaCC getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(NhaCC maNCC) {
		this.maNCC = maNCC;
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
