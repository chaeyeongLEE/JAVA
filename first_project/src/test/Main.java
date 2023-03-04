package test;

public class Main {

	public static void main(String[] args) {		
		Cat c = new Cat("하하하", 10);
		Dog d = new Dog("몽이", 15);
		
		d.name= "짱구";
		d.type="고양이";
		d.age = 20;
		
		System.out.println("name : " + c.name);    
	    System.out.println("type: " + c.type);  
	    System.out.println("age : " + c.age);
	    System.out.println("name : " + d.name);    
	    System.out.println("type: " + d.type);  
	    System.out.println("age : " + d.age);
		c.makeSound();
		d.makeSound();
		
	}

}