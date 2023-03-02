package first_project;

public class Person {
	private String name;
	private int age;
	
	//생성자
	//public Person(String name, int age) {
	//	System.out.println("welcome");
	//	this.name = name;
	//	this.age = age;
	//}
	//헷갈리면 String myname int my age 쓰면 this를 안써도됨.
	
	//getter와 setter
	public void myname() {
		System.out.println("my name is " + name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	
