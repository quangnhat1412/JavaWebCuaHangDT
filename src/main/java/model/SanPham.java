package model;

import java.util.Objects;

public class SanPham {
	private int maSP;
	private DanhMucSP maLoaiSP;
	private String tenSP;
	private double donGiaSP;
	private int soLuongSP;
	private String mauSac;
	private String ghiChuSP;

	public SanPham() {
		super();
	}
	

	public SanPham(int maSP, DanhMucSP maLoaiSP, String tenSP, double donGiaSP, int soLuongSP, String mauSac,
			String ghiChuSP) {
		super();
		this.maSP = maSP;
		this.maLoaiSP = maLoaiSP;
		this.tenSP = tenSP;
		this.donGiaSP = donGiaSP;
		this.soLuongSP = soLuongSP;
		this.mauSac = mauSac;
		this.ghiChuSP = ghiChuSP;
	}


	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public DanhMucSP getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(DanhMucSP maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getDonGiaSP() {
		return donGiaSP;
	}

	public void setDonGiaSP(double donGiaSP) {
		this.donGiaSP = donGiaSP;
	}

	public int getSoLuongSP() {
		return soLuongSP;
	}

	public void setSoLuongSP(int soLuongSP) {
		this.soLuongSP = soLuongSP;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public String getGhiChuSP() {
		return ghiChuSP;
	}

	public void setGhiChuSP(String ghiChuSP) {
		this.ghiChuSP = ghiChuSP;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return maSP == other.maSP;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", donGiaSP=" + donGiaSP + ", soLuongSP=" + soLuongSP
				+ ", mauSac=" + mauSac + ", ghiChuSP=" + ghiChuSP + "]";
	}

	
	
	
}
