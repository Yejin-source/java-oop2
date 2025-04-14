import service.ITv;
import service.OttTv;
import service.SmartTv;

public class Main {

	public static void main(String[] args) {
		ITv tv;
		// tv = new SmartTv(); 
		tv = new OttTv(); // 일부만 수정해도 됨
		// 부모타입(클래스, 추상클래스, 인터페이스)에 자식 객체를 대입 -> 다형성
		tv.onOff();
		// ITv를 통해서 SmartTv의 onOff를 호출
		
		
		// 중간에 통신하는 접점 역할(interface)이 없다면
		// SmartTv stv = new SmartTv();
		OttTv stv = new OttTv(); // 수정해야 할 범위가 넓음
		stv.onOff();
	}

}
