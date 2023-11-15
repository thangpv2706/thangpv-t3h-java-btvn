package btvn_buoi2;

import java.util.Scanner;

public class printFullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên của bạn: ");
		String fullName = sc.nextLine();
		printFullName(fullName);
	}
	
	public static void printFullName(String fullName) {
		System.out.println("Tên bạn vừa nhập là: " + fullName);
	}
}
