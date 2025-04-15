package ch92;

public class Main2 {
	public static void main(String[] args) {
		Main2 main2 = new Main2();
		// 람다식
		main2.exe((name)->System.out.println(name+"가 공부하다")); // 기능만 넘길 때 사용하는 문법: 람다(Lambda)
				// String 필요 X
		
		// 익명객체 | class 익명 implements IParent
		main2.exe(new IParent() { 
			@Override 
			public void work(String name) {
				System.out.println(name+"가 공부하다");
			}
		}); 
	}
	
	public void exe(IParent parent) {
		parent.work("구디");
	}
}

@FunctionalInterface // 함수처럼 사용하겠다는 것 | 단일 함수만 가질 수 있음
interface IParent { // IParent가 아닌
	void work(String name); 	// IParent 안에 있는 work를 넘기고 싶은 것
}
