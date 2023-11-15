package btvn_buoi2;

import java.util.Scanner;

public class print_Date {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng: ");
		int month = sc.nextInt();
		System.out.println("Nhập năm: ");
		int year = sc.nextInt();
		printDate(month, year);
	}
	
	
	public static void printDate(int month, int year) {
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println("Tháng " + month + " - " + year + " có 31 ngày");
			break;
		}
		
		case 4:
		case 6:
		case 9:
		case 11: {
			System.out.println("Tháng " + month + " - " +  year + " có 30 ngày");
			break;
		}
		case 2: {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("Tháng " + month + " - " + year + " có 29 ngày");
				
			} else {
				System.out.println("Tháng " + month + " - " + year + " có 28 ngày");
			}
			break;
		}
		default:
			System.out.println("Tháng bạn vừa nhập không hợp lệ");
		}
	}
}
