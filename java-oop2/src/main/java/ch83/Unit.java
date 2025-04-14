package ch83;

public abstract class Unit { // new Unit() 코드를 방지하기 위해 추상클래스로 만듦
	protected int hp;		 // 추상클래스는 객체를 만들 수 없음
    protected String name;
    protected void move() {
        System.out.println(this.name+" Go!");
    }
}
