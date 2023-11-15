package btvn_buoi2;

import java.util.Scanner;

public class layPhanSauDauPhay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		double n = sc.nextDouble();
		System.out.println("Nhap m: ");
		double m = sc.nextDouble();
		layPhanSauDauPhay(n, m);
	}

	public static void layPhanSauDauPhay(double n, double m) {
		// chuyen tu so vua nhap sang tring
		String str1 = Double.toString(n);
		String str2 = Double.toString(m);
//		System.out.println(str);
		// tra ve vi tri dau '.'
		int index1 = str1.indexOf('.');
		int index2 = str2.indexOf('.');
//		System.out.println(index);
		// tra ve chuoi tu sau dau '.'
		String answer1 = str1.substring(index1 + 1);
		String answer2 = str2.substring(index2 + 1);
//		System.out.println(answer);
		// chuyen tu chuoi lai thanh so
		int answer3 = Integer.parseInt(answer1);
		int answer4 = Integer.parseInt(answer2);
		System.out.println("Phần sau dấu phẩy của " + n + " là " + answer3);
		System.out.println("Phần sau dấu phẩy của " + m + " là " + answer4);

//		String[] arr = str.split(".");
//		System.out.println(arr);

	}
}
