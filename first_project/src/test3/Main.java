package test3;

public class Main {

	public static void main(String[] args) {
	//	SubClass c = new SubClass();
		Kim K = new Kim("김새싹", "서울대", 20, 2015);
		Baek B = new Baek("백모씨", "연세대", 22, 2020);
		
		System.out.println("이름 : " + K.name);
		System.out.println("학교 : " + K.school);
		System.out.println("학교 : " + K.age);
		System.out.println("학번 : " + K.studentid);
		K.todo();
		
		System.out.println("이름 : " + B.name);
		System.out.println("학교 : " + B.school);
		System.out.println("학교 : " + B.age);
		System.out.println("학번 : " + B.studentid);
		B.todo();
		
	}

}
