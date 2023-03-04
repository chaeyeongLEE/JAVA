package test;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, "고양이", age);
		//System.out.println("");	
	}

	public void makeSound() {
		super.makeSound();
		System.out.println("야아아아아옹");
	}
}