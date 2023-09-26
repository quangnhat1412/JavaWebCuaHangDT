package model;

public class NhaCC {
	private int maNCC;
	private String tenNCC;
	private String website;
	private int stkNCC;
	private String diaChiNCC;
	private String ghiChuNCC;

	public NhaCC() {
		super();
	}

	public NhaCC(int maNCC, String tenNCC, String website, int stkNCC, String diaChiNCC, String ghiChuNCC) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.website = website;
		this.stkNCC = stkNCC;
		this.diaChiNCC = diaChiNCC;
		this.ghiChuNCC = ghiChuNCC;
	}

	public int getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(int maNCC) {
		this.maNCC = maNCC;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getStkNCC() {
		return stkNCC;
	}

	public void setStkNCC(int stkNCC) {
		this.stkNCC = stkNCC;
	}

	public String getDiaChiNCC() {
		return diaChiNCC;
	}

	public void setDiaChiNCC(String diaChiNCC) {
		this.diaChiNCC = diaChiNCC;
	}

	public String getGhiChuNCC() {
		return ghiChuNCC;
	}

	public void setGhiChuNCC(String ghiChuNCC) {
		this.ghiChuNCC = ghiChuNCC;
	}

}
