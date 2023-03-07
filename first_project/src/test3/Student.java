package test3;

public abstract class Student {
	public String name;
	public String school;
	public int age;
	public int studentid;
	
	public Student(String name, String school, int age, int studentid) {
		this.name=name;
		this.school=school;
		this.age=age;
		this.studentid=studentid;
	}
	
	public abstract void test(
			);
	
	public void todo() {
		System.out.println("점심은 무엇을?");
}
}
