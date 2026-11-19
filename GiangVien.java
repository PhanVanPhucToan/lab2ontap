package lab2ontap;

public class GiangVien {
	
	private String maGV;
	private String tenGV;
	private String hocVi;
	private String boMon;
	// constructor
	GiangVien(String maGV, String tenGV, String hocVi, String boMon){
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.hocVi = hocVi;
		this.boMon = boMon;
	}
	// setter & getter
	public void settenGV(String name) {
		tenGV = name;
	}
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getHocVi() {
		return hocVi;
	}
	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}
	public String getBoMon() {
		return boMon;
	}
	public void setBoMon(String boMon) {
		this.boMon = boMon;
	}
	public String toString() {
		return "Ma: " + maGV + " | Ten: " + tenGV + " | Hoc Vi: " + hocVi + " | Bo Mon: " + boMon; 
	}
}
