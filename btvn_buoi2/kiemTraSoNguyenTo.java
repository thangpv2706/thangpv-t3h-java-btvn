package btvn_buoi2;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		kiemTraSoNguyenTo(n);
//		if(kiemTraSoNguyenTo(n)) {
//			System.out.println(n + " la so nguyen to");
//		} else {
//			System.out.println(n + " k phai la so nguyen to");
//		}
	}
	
	public static void kiemTraSoNguyenTo(int n) {
//		if(n < 2) {
//	           return false;
//	    }
//	    for(int i = 2; i <= Math.sqrt(n); i++) {
//	           if (n % i == 0) {
//	               return false;
//	        }
//	    }
//	       return true;
	       
	       if(n < 2) {
	    	   System.out.println(n + " không phải là số nguyên tố");
	       }
	       int count = 0;
	       for(int i = 2; i <= Math.sqrt(n); i++) {
	    	   if(n % i == 0) {
	    		   System.out.println(n + " không phải là số nguyên tố");
	    		   count++;
	    	   } else {
	    		   System.out.println(n + " là số nguyên tố");
	    	   }
	    	   break;
	       }
		
	}
}
