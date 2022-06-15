package day0526;

class Parent1{
	void print() {
		System.out.println("부모 클래스의 print()메서드입니다.");
	}
}

class Child1 extends Parent1 {
	
	// 오버라이딩
	void print() {
		System.out.println("자식 클래스의 print()메서드입니다.");
	} // 똑같이 생겼는데 다른 결과 > 다형성!
	
	// 매개변수 1개짜리로 오버로딩
	void print(String str) {
		System.out.println(str);
	}
}

public class OverOver {

	public static void main(String[] args) {
		
		Parent1 p1 = new Parent1();
		Child1 ch = new Child1();
		
		p1.print();
		ch.print();
		ch.print("오버로딩 !!");
	}

}
