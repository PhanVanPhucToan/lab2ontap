package lab2ontap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLDSGiangVien l = new QLDSGiangVien();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. Them"
					+ "\n2. Sua"
					+ "\n3. Xoa"
					+ "\n4. Tim GV theo ma"
					+ "\n5. In DSGV"
					+ "\n0. Thoat"
					+ "\nMoi nhap lua chon cua b: ");
			String op = sc.nextLine();
			switch(op) {
			case "1":
				l.them();
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				System.out.println("nhap ma gv:");
				String key = sc.nextLine();
				if(l.findGV(key)) {
					System.out.println("co giang vien");
				}
				else {
					System.out.println("khong tim thay");
				}
				
				break;
			case "5":
				l.inDS();
				break;
			case "0":
				return;
			}
		}
	}

}
