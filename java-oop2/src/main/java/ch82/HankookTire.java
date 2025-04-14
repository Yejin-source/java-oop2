package ch82;

public class HankookTire implements ITire { // 추상메서드보다 인터페이스를 사용하는 것이 좋음
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러간다");
	}
}
