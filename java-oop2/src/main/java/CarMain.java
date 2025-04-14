import service.Car;
import service.NetflixCar;

public class CarMain {
	public static void main(String[] args) {
		// SmartCar c = new SmartCar();
		// 서로 통신하는 접점 역할은 interface가 아니어도 되는데? (추상클래스도 있음)
		Car c = new NetflixCar(); // 인터페이스를 이용하는 게 좋음
		c.on();
	}
}
