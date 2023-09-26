package model;

import java.sql.Date;

public class KyTonKho {
	private int maKy;
	private String tenKy;
	private Date ngayDK;
	private Date ngayCK;
	private String ghichuKTK;

	public KyTonKho() {
		super();
	}

	public KyTonKho(int maKy, String tenKy, Date ngayDK, Date ngayCK, String ghichuKTK) {
		super();
		this.maKy = maKy;
		this.tenKy = tenKy;
		this.ngayDK = ngayDK;
		this.ngayCK = ngayCK;
		this.ghichuKTK = ghichuKTK;
	}

	public int getMaKy() {
		return maKy;
	}

	public void setMaKy(int maKy) {
		this.maKy = maKy;
	}

	public String getTenKy() {
		return tenKy;
	}

	public void setTenKy(String tenKy) {
		this.tenKy = tenKy;
	}

	public Date getNgayDK() {
		return ngayDK;
	}

	public void setNgayDK(Date ngayDK) {
		this.ngayDK = ngayDK;
	}

	public Date getNgayCK() {
		return ngayCK;
	}

	public void setNgayCK(Date ngayCK) {
		this.ngayCK = ngayCK;
	}

	public String getGhichuKTK() {
		return ghichuKTK;
	}

	public void setGhichuKTK(String ghichuKTK) {
		this.ghichuKTK = ghichuKTK;
	}

}
