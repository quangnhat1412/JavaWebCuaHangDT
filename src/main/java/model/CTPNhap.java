package model;

public class CTPNhap {
	private int maCTPNhap;
	private PNhap soPN;
	private SanPham maSP;
	private int SLNhap;
	private double dgNhap;
	private double ThanhTienPN;

	public CTPNhap() {
		super();
	}

	public CTPNhap(int maCTPNhap, PNhap soPN, SanPham maSP, int sLNhap, double dgNhap, double thanhTienPN) {
		super();
		this.maCTPNhap = maCTPNhap;
		this.soPN = soPN;
		this.maSP = maSP;
		SLNhap = sLNhap;
		this.dgNhap = dgNhap;
		ThanhTienPN = thanhTienPN;
	}

	public int getMaCTPNhap() {
		return maCTPNhap;
	}

	public void setMaCTPNhap(int maCTPNhap) {
		this.maCTPNhap = maCTPNhap;
	}

	public PNhap getSoPN() {
		return soPN;
	}

	public void setSoPN(PNhap soPN) {
		this.soPN = soPN;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public int getSLNhap() {
		return SLNhap;
	}

	public void setSLNhap(int sLNhap) {
		SLNhap = sLNhap;
	}

	public double getDgNhap() {
		return dgNhap;
	}

	public void setDgNhap(double dgNhap) {
		this.dgNhap = dgNhap;
	}

	public double getThanhTienPN() {
		return ThanhTienPN;
	}

	public void setThanhTienPN(double thanhTienPN) {
		ThanhTienPN = thanhTienPN;
	}

}
