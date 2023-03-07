package first_project;
import test.TestClass;
//다른 패키지에 있기때문에 "패키지명.클래스명;"의 형태로 import해와야 함.

public class ClassName extends TestClass {
	public int number;
	public static String name;
	
	public void test() {
		// n n2
		
		this.n = 3;
		//다른 패키지여도 상속받아서 자식패키지이니까 n에 접근 가능
		//this.n2 = 4;
		//default는 자직클래스 접근 불가
	}
	
	
}
