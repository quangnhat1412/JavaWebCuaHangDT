package model;

import java.sql.Date;

public class BinhLuan {
	private int maBL;
	private KhachHang maKH;
	private SanPham maSP;
	private Date ngayBL;
	private String noiDungBL;
	private int soSao;

	public BinhLuan() {
		super();
	}

	public BinhLuan(int maBL, KhachHang maKH, SanPham maSP, Date ngayBL, String noiDungBL, int soSao) {
		super();
		this.maBL = maBL;
		this.maKH = maKH;
		this.maSP = maSP;
		this.ngayBL = ngayBL;
		this.noiDungBL = noiDungBL;
		this.soSao = soSao;
	}

	public int getMaBL() {
		return maBL;
	}

	public void setMaBL(int maBL) {
		this.maBL = maBL;
	}

	public KhachHang getMaKH() {
		return maKH;
	}

	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public Date getNgayBL() {
		return ngayBL;
	}

	public void setNgayBL(Date ngayBL) {
		this.ngayBL = ngayBL;
	}

	public String getNoiDungBL() {
		return noiDungBL;
	}

	public void setNoiDungBL(String noiDungBL) {
		this.noiDungBL = noiDungBL;
	}

	public int getSoSao() {
		return soSao;
	}

	public void setSoSao(int soSao) {
		this.soSao = soSao;
	}

}
