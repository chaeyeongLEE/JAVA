package test2;

public class Vehicle {
	public String color;
	public int passenger;
	public int wheel;
	
	//생성자
	public Vehicle(String color, int passenger, int wheel) {
		this.color = color;
		this.passenger = passenger;
		this.wheel = wheel;	
	
	
	System.out.println("색상 : " + color);
	System.out.println("승객 : " + passenger);  
	System.out.println("바퀴 : " + wheel);  }
	
	
	/*Getter & Setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPassenger() {
		return passenger;
	}

	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	*/
	public void sound() {
		System.out.println("부르릉 비켜주세요~~~");
		System.out.println("--------------");
	}
}
