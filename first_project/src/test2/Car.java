package test2;

public class Car extends Vehicle {
	public Car(String color, int passenger, int wheel) {
	super("pink", 5, 4);
	}
	public void sound() {
		System.out.println("뛰뛰빵빵 차량");
		System.out.println("---------");
	}
}
