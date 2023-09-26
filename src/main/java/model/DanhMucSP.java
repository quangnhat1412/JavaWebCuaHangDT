package model;

import java.util.Objects;

public class DanhMucSP {
	private int maLoaiSP;
	private String tenLoaiSP;
	
	public DanhMucSP() {
		super();
	}

	public DanhMucSP(int maLoaiSP, String tenLoaiSP) {
		super();
		this.maLoaiSP = maLoaiSP;
		this.tenLoaiSP = tenLoaiSP;
	}

	public int getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(int maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	public String getTenLoaiSP() {
		return tenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maLoaiSP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DanhMucSP other = (DanhMucSP) obj;
		return maLoaiSP == other.maLoaiSP;
	}
	
	
}
