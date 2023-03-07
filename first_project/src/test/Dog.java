package test;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, "강아지", age);
	}
	
	public void makeSound() {
		super.makeSound();
		System.out.println("왈왈왈");
	}	
}
