package day0526;

class A{
	void hello() {
		System.out.println("A를 출력합니다!");
	}
}

class B extends A{
	// 오버라이딩
	void hello() { // 선언부는 동일하고 메서드 내의 내용만 바뀜
		System.out.println("B를 출력합니다!");
	}
}

public class OverMain {

	public static void main(String[] args) {

		A aa = new A();
		aa.hello();

		B bb = new B();
		bb.hello(); // 상속

	}

}
