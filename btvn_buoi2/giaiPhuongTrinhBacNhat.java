package btvn_buoi2;

public class giaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		giaiPTB1(2, 4);
	}
	
	public static void giaiPTB1(int a, int b) {
		int x;
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			x = -b /a;
			System.out.println("Phương trình có nghiệm là: " + x);
		}
	}
}
