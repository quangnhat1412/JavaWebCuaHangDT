package model;

public class CTKyTonKho {
	private int maChiTietKTK;
	private KyTonKho maKy;
	private SanPham maSP;
	private int TSLNhap;
	private int TSLXuat;

	public CTKyTonKho() {
		super();
	}

	public CTKyTonKho(int maChiTietKTK, KyTonKho maKy, SanPham maSP, int tSLNhap, int tSLXuat) {
		super();
		this.maChiTietKTK = maChiTietKTK;
		this.maKy = maKy;
		this.maSP = maSP;
		TSLNhap = tSLNhap;
		TSLXuat = tSLXuat;
	}

	public int getMaChiTietKTK() {
		return maChiTietKTK;
	}

	public void setMaChiTietKTK(int maChiTietKTK) {
		this.maChiTietKTK = maChiTietKTK;
	}

	public KyTonKho getMaKy() {
		return maKy;
	}

	public void setMaKy(KyTonKho maKy) {
		this.maKy = maKy;
	}

	public SanPham getMaSP() {
		return maSP;
	}

	public void setMaSP(SanPham maSP) {
		this.maSP = maSP;
	}

	public int getTSLNhap() {
		return TSLNhap;
	}

	public void setTSLNhap(int tSLNhap) {
		TSLNhap = tSLNhap;
	}

	public int getTSLXuat() {
		return TSLXuat;
	}

	public void setTSLXuat(int tSLXuat) {
		TSLXuat = tSLXuat;
	}

}
