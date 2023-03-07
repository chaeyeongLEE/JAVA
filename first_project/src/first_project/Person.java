package first_project;

public class Person {
	protected String name;
	private int age;
	//메소드 오버라이딩
	public void test() {
		System.out.println("test");
	}
	
	//함수 오버로딩
	//생성자 생성
	public Person() {
		System.out.println("사람 클래스의 인스턴스 생성됨");
	}
	
	public Person(String name, int age) {
		System.out.println("사람 클래스의 인스턴스 생성됨2");
		this.name = name;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("10시에 쿨쿨 잠을 잔다.");
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
	
	//생성자
//	//public Person(String name, int age) {
//	//	System.out.println("welcome");
//	//	this.name = name;
//	//	this.age = age;
//	//}
//	//헷갈리면 String myname int my age 쓰면 this를 안써도됨.
//	
//	//getter와 setter
//	public void myname() {
//		System.out.println("my name is " + name);
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}

}
	
