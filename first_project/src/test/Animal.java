package test;

public class Animal {
	//종, 이름, 나이 변수 생성
	protected String name;
	protected String type;
	protected int age;
	
	public void makeSound() {
		System.out.println("동물은 소리를 낸다");
	}
	
	public Animal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;

	}
}