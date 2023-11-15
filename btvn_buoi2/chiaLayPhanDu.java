package btvn_buoi2;

import java.util.Scanner;

public class chiaLayPhanDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		chiaLayPhanDu(n);
	}
	
	public static void chiaLayPhanDu(int n) {
		int answer =  n % 2;
		System.out.println("n % 2 = " + answer);
	}
}
