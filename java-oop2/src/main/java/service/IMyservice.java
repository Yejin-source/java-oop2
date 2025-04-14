package service;

// 추상클래스보다 더 추상적인 타입
public interface IMyservice {
	// 클래스
	// static, 필드, 메서드
	
	// 추상클래스
	// static, 필드, 메서드, 추상메서드
	
	// 인터페이스: 개발 코드와 객체가 서로 통신하는 접점 역할
	// static, 추상메서드
	public abstract void test(); 
	// public abstract 메서드만 가질 수 있기 때문에, 생략하면 public abstract가 됨
	void test2();
}
