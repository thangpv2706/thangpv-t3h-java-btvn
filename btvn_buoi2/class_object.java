package btvn_buoi2;

public class class_object {
	public static void main(String[] args) {
		

	Human Humen = new Human();
	Humen.name = "Pham Van Thang";
	Humen.age = 25;
	Humen.gender = "Nam";
	Humen.address = "Thai Binh";
	Humen.walk();
	Humen.eat();
	System.out.println("Humen: " + Humen.name);
	System.out.println("Humen: " + Humen.age);
	Humen.property();
	}
}
