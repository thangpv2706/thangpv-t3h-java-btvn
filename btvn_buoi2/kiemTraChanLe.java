package btvn_buoi2;

import java.util.Scanner;

public class kiemTraChanLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		kiemTraChanLe(n);
	}
	
	public static void kiemTraChanLe(int n) {
		String answer = (n % 2 == 0) ? "Số chẵn" : "Số lẻ";
		System.out.println(n + " là " + answer);
	}
}
