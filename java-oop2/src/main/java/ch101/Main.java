package ch101;

public class Main {
	public static void main(String[] args) {
		// conn;
		try {
			System.out.println("hello"); // 모든 코드는 예외를 발생시킬 수 있음
			System.out.println(1/0);
			System.out.println("bye"); 
		} catch(Exception e) {
			System.out.println("예외발생");
			return;
			// e.printStackTrace();
			// 예외가 발생했을 때 조치해야 할 내용
		} finally { // 강제 종료 전에 무조건 실행되게 되어있음
			System.out.println("finally");			
		}
		// conn.close();
		
		
		// 모든 예외는 Exception으로 받으면 됨
		try { // try catch 조건문
			System.out.println(5/0);			
		} catch(Exception e) { // 예외가 발생하면 catch절로 감
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		try { // 본인이 생각할 때 중요한 부분에만 try catch를 하는 트렌드
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// args = null;
		// System.out.println(args.length); // null 뒤에는 참조 연산자를 붙일 수 없음
	}
}
