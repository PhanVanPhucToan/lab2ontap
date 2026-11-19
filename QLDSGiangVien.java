package lab2ontap;



import java.util.ArrayList;
import java.util.Scanner;

public class QLDSGiangVien {
	Scanner sc = new Scanner(System.in);
	private ArrayList<GiangVien> GiangViens; 
	QLDSGiangVien(){
		GiangViens = new ArrayList<>();
		GiangViens.add(new GiangVien("GV001", "Nguyễn Văn An", "Thạc sĩ", "Khoa học máy tính"));
		GiangViens.add(new GiangVien("GV002", "Trần Thị Bình", "Tiến sĩ", "Hệ thống thông tin"));
		GiangViens.add(new GiangVien("GV003", "Lê Minh Chí", "Thạc sĩ", "Mạng máy tính"));
		GiangViens.add(new GiangVien("GV004", "Phạm Thu Dung", "Thạc sĩ", "Mạng máy tính"));
		GiangViens.add(new GiangVien("GV005", "Nguyễn Gia Huy", "Tiến sĩ", "Khoa học máy tính"));
	}
	// method
//	private void GiangViens() {
//		new GiangVien("GV001", "Nguyễn Văn An", "Thạc sĩ", "Khoa học máy tính");
//		new GiangVien("GV002", "Trần Thị Bình", "Tiến sĩ", "Hệ thống thông tin");
//		new GiangVien("GV003", "Lê Minh Chí", "Thạc sĩ", "Mạng máy tính");
//		new GiangVien("GV004", "Phạm Thu Dung", "Thạc sĩ", "Mạng máy tính");
//		new GiangVien("GV005", "Nguyễn Gia Huy", "Tiến sĩ", "Khoa học máy tính");
//	}
	// find
	public boolean findGV(String key) {
		for(GiangVien x : GiangViens) {
			if(key == x.getMaGV())
				{
				System.out.print(x);
				return true;
				}
		}
		return false;
	}
	// print list
	public void inDS() {
		for(GiangVien x : GiangViens){
			System.out.println(x);
		}
	}
	// add gv
	public void them() {
		System.out.println("nhap ma giang vien: ");
		String ma = sc.nextLine();
		System.out.println("nhap ten giang vien: ");
		String ten = sc.nextLine();
		System.out.println("nhap hoc vi: ");
		String hocvi = sc.nextLine();
		System.out.println("nhap bo mon giang day: ");
		String bomon = sc.nextLine();
		GiangViens.add(new GiangVien(ma, ten, hocvi, bomon));		
	}
	public void sua() {
		System.out.println("Nhap ma giang:");
	}
}
