package btvn_buoi2;

import java.util.Scanner;

public class layPhanChuc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số có 4 chữ số: ");
		int n = sc.nextInt();
		layPhanChuc(n);
	}
	
	public static void layPhanChuc(int n) {
		String str = Integer.toString(n);
		if(str.length() > 4 || str.length() < 4) {
			System.out.println("Nhập số không hợp lệ! Mời nhập số có 4 chữ số: ");
		} else {
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			System.out.println("Hàng chục của số bạn vừa nhập là: " + ch[2]);
			break;
		}
		}
	}
}
