package service;

public class SmartCar extends Car { // Car를 상속받음
	
	@Override
	public void on() {
		System.out.println("인터넷 접속 확인");
		System.out.println("시동");
	}
}
