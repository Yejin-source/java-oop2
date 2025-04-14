package ch82;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.list = new ArrayList<ITire>();
		ITire frontRightTire = new HankookTire(); // 변수 이름은 길게 적는 게 의미 전달이 잘 돼서 좋음
		c.list.add(frontRightTire);
		ITire frontLeftTire = new HankookTire(); 
		c.list.add(frontLeftTire);
		ITire backRightTire = new NexenTire(); 
		c.list.add(backRightTire);
		ITire backLeftTire = new KumhoTire(); 
		c.list.add(backLeftTire);
		c.move();
	}
	
	/*
	 	객체지향
		1. 캡슐화 <- 정보은닉 <- 접근제한자
		2. 다형성 <- 3. 상속 <- 4. 추상화(부모클래스 / 추상클래스 / 인터페이스)
			override, 형변환	 
	*/
}
