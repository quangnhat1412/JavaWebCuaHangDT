package model;

public class HinhAnh {
	private int maHinh;
	private SanPham maSP;
	private String tenHinh;

	public HinhAnh() {
		super();
	}

	public HinhAnh(int maHinh, SanPham maSP, String tenHinh) {
		super();
		this.maHinh = maHinh;
		this.maSP = maSP;
		this.tenHinh = tenHinh;
	}

	public int getMaHinh() {
		return maHinh;
	}

	public void setMaHinh(int maHinh) {
		this.maHinh = maHinh;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}

}
