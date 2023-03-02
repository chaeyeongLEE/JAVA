package first_project;

public class Rectangle {
	private int width;
	private int height;
	
	//아래 width와 height가 인자로 들어온다.(위로!)
	
	//데이터타입과 함께 생성자 작성
	/*
	public Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	*/
	public int area() {
		return width*height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

	
	
	
}
