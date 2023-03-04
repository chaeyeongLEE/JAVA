package test2;

public class Motorcycle extends Vehicle {
	public Motorcycle(String color, int passenger, int wheel) {
	super("green", 2, 2);
	}
	public void sound() {
		System.out.println("오토바이 지나갑니다");
		System.out.println("------------");
	}
}
