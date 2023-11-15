package btvn_buoi2;

public class Human {
	String name;
	int age;
	String address;
	String gender;
	
	public void study() {
		System.out.println(name + "dang hoc mon java tai T3H");
	}
	
	public void property() {
		System.out.println(name + ": "+ age + " tuoi");
		System.out.println(name + " co rat nhieu ban be ");
		System.out.println(name + " la " + gender);
	}
	public void walk() {
		System.out.println("i'm walking");
	}
	public void eat() {
		System.out.println("i'm eating");
	}
}
