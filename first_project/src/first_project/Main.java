package first_project;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num1 = 1;
		//얜 스테틱이니까 num1=0이었던걸 1로 바꿔주고
		number1.num2 = 1;
		//다시 num2에서 1을 불러와도 0이 아니고 1이 나오는것. 얜 스테틱아니지 (밑에 코드 !)
		System.out.println(number2.num1);
		System.out.println(number2.num2);
		
		
		
		
		
	// private로 설정하면 아래의 방법으로 접근할 수 없음.
//		Person person1 = new Person("이채영",28);
//		Person person2 = new Person("코딩온",20);
//		person1.myname();
//		person2.myname();
//		person1.name="코딩온";//person1의 이름도 바꿀 수 있다.
		
		
		
		//클래스 연습과정(private부분)
//		Person person1 = new Person();
//		person1.setName("이채영");
//		System.out.println(person1.getName());
		/*Scanner scanner = new Scanner(System.in);
		ArrayList<Rectangle> rect = new ArrayList<>();
		
		while (true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			
			if (width == 0 && height == 0) break;
			
			Rectangle rectangle1 = new Rectangle(width);
			rectangle1.setHeight(height);
			rect.add(rectangle1);
		}
		
		for (Rectangle rectangle : rect) {
			System.out.println("가로 길이는 : " + rectangle.getWidth());
			System.out.println("세로 길이는 : " + rectangle.getHeight());
			System.out.println("넓이는 : " + rectangle.area());
			System.out.println("----------------------------");
			
		}
	*/
		
		

//		Hello hello1 = new Hello();
//		hello1.hello();

//		int num1 = 5;
//		int num2 = 0;
//		
//		try {
//			System.out.println(num1/num2);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} finally {
//			System.out.println("끝");
//		}
//		Scanner scanner = new Scanner(System.in);
//		
//		try {
//			int num = scanner.nextInt();
//			System.out.println(num);
//		} catch (InputMismatchException e){
//			System.out.println("숫자를 입력해주세요.");
//		}
//		scanner.close();
//		
		//ArrayList<Integer> arr = new ArrayList<>();
		
		
		
//		try {
//			int[] arr = new int[4];
//			for(int i=0; i<5; i++) {
//			System.out.println(i + " ");
//		}} catch(ArrayIndexOutOfBoundsException e) {
//			for(int i=1; i<5; i++);
//		} finally {
//			System.out.println("인덱스가 범위를 벗어났습니다.");
//		}
//		
		
//	public static void hello() {
//		System.out.println("hello");
//	}
//	public static void evaluate(double num1, double num2) {
//		System.out.println("덧셈 결과 :" + (num1 + num2));
//		System.out.println("뺄셈 결과 :" + (num1 - num2));
//		System.out.println("나눗셈 결과 :" + (num1 / num2));
//		System.out.println("곱셈 결과 :" + (num1 * num2));
//	}
	
//	public static int zero () {
//		return 0;
//	}
//		for (int i = 0; i<arr1.length; i++) {
//	public static void printArray(int[] arr) {
//		for (int i=0; i<arr.length; i++) {
//			if (i == 0) System.out.print('[');
//			if (i == arr.length - 1) System.out.print(arr[i] + "]");
//			else System.out.print(arr[i] + ", ");
//		}
//	}
		//스캐너 객체 생성
		//Scanner scanner = new Scanner(System.in);
		//arraylist 생성
		//ArrayList<String> arr = new ArrayList<>();
		
		//while문을 무한으로 돌려주세요.(true라고 지정해줘야함)
//		while(true) {
//			System.out.println("문자열을 입력해주세요. : ");
//			String str = scanner.nextLine(); //스캐너값 받기
//			if(str.equals("exit")) break;
//			arr.add(str);
//			}
//		for(String str : arr) {
//			System.out.println(str);
//		}
//	}
//			
//			
//			
			
//		int[]arr = new int[5];
//		int sum=0;
//		
//		System.out.println("5개의 정수를 입력해주세요. : ");
//		
//		for(int i=0; i<5; i++) {
//			arr[i]=scanner.nextInt();
//			sum += arr[i];
//		}
	
		
//		System.out.println("평균은"+ (double) sum/arr.length);
//		
//		
//	
//		
//		while(true) {
//			System.out.println("문자를 입력해주세요. : ");
//			String arr3 = scan.next();
//		if(arr3.equals("exit")) {
//			break;
//		}
//		System.out.println("종료");
//		}
	
		
//		double num1 = scanner.nextDouble();
//		double num2 = scanner.nextDouble();
//		
//		evaluate(num1, num2);
//		
//		scanner.close();
//		int[] arr1= {0,0,0};
//		int[] arr2= new int[3];
//		
//		//arr1= [0,1,2]
//		for (int i = 0; i<arr1.length; i++) {
//			arr1[i] = i;
//		}
//		
//		// for문을 이용한 출력
//		for (int i = 0; i<arr1.length; i++) {
//			System.out.print(i +" ");
//		}
//		
//		
//	
//		// for-each문
//		for (int value : arr1) {
//			System.out.print(value+" ");
//		}
//		
//		// Arrays 클래스 이용
////		
//		System.out.print(Arrays.toString(arr3));
//		
//		String str = Arrays.toString(arr3); // "[0,1,2]"
//		System.out.println(str);
//		printArray(arr1);
//		
		//직접 만든 메소드
//		int number = zero();
//		System.out.println("number" + number);
		
//	}
//		// TODO Auto-generated method stub
////		System.out.println("Hello World");
////		System.out.print("Hello World");
//		System.out.println("이름, 나이, 키, 결혼 여부를 입력해주세요.");

//		System.out.println("이름을 입력하세요.");
//		String name = scanner.next();
		
//		int age = scanner.nextInt();
		
////		double height = scanner.nextDouble();
////		boolean single = scanner.nextBoolean();
//		
		

//		if (age >= 1 && age <= 7){
//			System.out.println("유아");
//		}   else if (age >= 8 && age <= 13) {
//			System.out.println("초등학생");
//			}
//			else if(age >= 14 && age <= 16) {
//			System.out.println("중학생");	
//			}
//			else if (age >= 17 && age <= 19) {
//			System.out.println("고등학생");
//			}
//			else {
//				System.out.println("성인");
//			};
		
////		System.out.println("이름을 입력하세요 " + name);
////		System.out.println("나이을 입력하세요 " + age);
//		System.out.println("안녕하세요!" + name + "님" + "(" + age + "세)");
//		// System.out.println("결혼 여부 " + single);
//		String str1 = new String("홍길동");
//		String Str2 = "홍길동";
//		int num = 0;
//		
//		switch (name) {
//		case "홍길동": 
//			System.out.println("남자");
//			break;
//		case "성춘향": 
//			System.out.println("여자");
//		break;
//		default:
//			System.out.println("모르겠어요");
//		}
	
//		int i = 10;
//		while (i<10) {
//			System.out.print(i + " ");
//			i++;
//		}
//		
//		System.out.println("");
//		
//		int j = 10;
//		do {
//			System.out.print(j + " ");
//			j++;
//		} while (j<10);
		
		
	//0 1 2
	//3 4 5
//	int [][] arr1 = {{0,1,2},{3,4,5}};
//	int [][] arr2 = new int[2][3];
//	
//	for (int[] arr : arr1) {
//		for (int value : arr) {
//			System.out.print(value+" ");
//		}
//	System.out.println("");
//	
//	
//	int num = 0;
//	for (int i=0, i<arr2.length; i++) {
//		for (int j=0; j<arr2[i].length; j++) {
//			arr2[i][j] = num;
//			num++;
//		}
//	}
//	
//		for (int j=0; j<arr2[i].length; j++) {
//			arr2[i][j] = num;
//			num++;
//		}
//	}
		
//}
		
//	ArrayList<Integer> arr1 = new ArrayList<>();
//	ArrayList<Integer> arr2 = new ArrayList<>();
//	
//	
//	
//	for (int i=1; i<6; i++) {
//		arr2.add(i);
//	}
//	
//	
//	// arr1 맨 뒤에 2가 추가되는 것.
//	arr1.add(2);
//	// 0번째 인덱스에 1 추가
//	arr1.add(0, 1);
//	// arr1요소 뒤에 arr2 추가
//	arr1.addAll(arr2);
//	// 1번째 인덱스 요소 제거
//	arr1.remove(1);
//	// 요소 모두 제거
//	arr1.clear();
//	
//	for (int value : arr1) {
//		System.out.print(value+" ");
//	}
//	System.out.println("");
//	for (int i=0; i<arr1.size(); i++) {
//		System.out.print(arr1.get(i)+" ");
//	}
//	
//	//요소의 인덱스 반환
//	System.out.println("");
//	System.out.println("index of 2 :" + arr1.indexOf(2));
//	
//	
}

}

