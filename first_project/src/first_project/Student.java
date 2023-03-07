package first_project;

public class Student extends Person{
	private String studentID;
	// person에서 상속받고, Person의 생성자를 받아온다.
	// 학생에게만 있는 추가적인 내용을 적어주면됨.
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Student() {
		// person()
		// -> student 생성자 들어오는 순간에 부모클래스(person)의 생성자가 먼저 실행됨.
		// 매개변수가 있는 생성자를 실행시키고싶다? 그러면 내가 생성자를 선택할 수 있음 super(=부모클래스의 생성자)  사용
		// -> super("홍길동", 99);
		//protected로 바뀐 name 바꾸기
		this.name = "춘향이";
		
		System.out.println("Student 생성자 실행됨");
	}
	
	
	public void test() {
		System.out.println("student test");
	}
	public void sleep() {
		System.out.println("11시에 쿨쿨 잠을 잔다.");
	}
	
	public void study() {
		System.out.println("공부하기");
	}
	
}
