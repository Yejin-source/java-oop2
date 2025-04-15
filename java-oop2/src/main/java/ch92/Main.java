package ch92;

public class Main {
	public void exe(Parent parent) {
		parent.work();
	}
	
	public static void main(String[] args) { // static은 별개
		Main main = new Main();
		Parent parent = new Parent();
		main.exe(parent);
		
		// Child child = new Child();
		// main.exe(child); // 다형성
		
		Parent parent2 = new Child(); // 다형성
		main.exe(parent2);
		
		main.exe(new Child()); // 다형성
		
		
		Parent parent3 = new Parent() { // 일회성 객체, 익명 객체 --> 클래스를 따로 만들 필요가 없음
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		};
		main.exe(parent3); // 다형성
		
		
		main.exe(new Parent() { // class 익명 extends Parent 익명 | 객체의 변수를 만들 필요가 없음
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
 		});
	}
}

class Parent { // 클래스 안에 클래스가 존재할 수 있음
	void work() {
		System.out.println("일(직업)한다");
	}
}

class Child extends Parent { // 부모 (extends, implements) 자식 관계
	@Override
	void work() {
		System.out.println("공부한다");
	}
}
