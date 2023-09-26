package model;

public class CTPXuat {
	private int maCTPXuat;
	private PXuat soPN;
	private SanPham maSP;
	private int SLXuat;
	private double dgXuat;
	private double ThanhTienPX;

	public CTPXuat() {
		super();
	}

	public CTPXuat(int maCTPXuat, PXuat soPN, SanPham maSP, int sLXuat, double dgXuat, double thanhTienPX) {
		super();
		this.maCTPXuat = maCTPXuat;
		this.soPN = soPN;
		this.maSP = maSP;
		SLXuat = sLXuat;
		this.dgXuat = dgXuat;
		ThanhTienPX = thanhTienPX;
	}

	public int getMaCTPXuat() {
		return maCTPXuat;
	}

	public void setMaCTPXuat(int maCTPXuat) {
		this.maCTPXuat = maCTPXuat;
	}

	public PXuat getSoPN() {
		return soPN;
	}

	public void setSoPN(PXuat soPN) {
		this.soPN = soPN;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public int getSLXuat() {
		return SLXuat;
	}

	public void setSLXuat(int sLXuat) {
		SLXuat = sLXuat;
	}

	public double getDgXuat() {
		return dgXuat;
	}

	public void setDgXuat(double dgXuat) {
		this.dgXuat = dgXuat;
	}

	public double getThanhTienPX() {
		return ThanhTienPX;
	}

	public void setThanhTienPX(double thanhTienPX) {
		ThanhTienPX = thanhTienPX;
	}

}
