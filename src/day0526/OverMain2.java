package day0526;

//class A1{
//	int num1;
//	int num2;
//
//	String print() {
//		return "num1 : " + num1 + ", num2 : " + num2;
//	}
//}
//
//class B1 extends A1{
//	int num3;
//	// 오버라이딩
//	String print() {
//		return "num1 : " + num1 + ", num2 : " + num2 + ", num3 : " + num3;
//	}
//}



class A1 extends Object {
	int num1;
	int num2;

	A1(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

 //Object의 toString() : 문자열 반환
	public String toString() {
		return "num1 : " + num1 + ", num2 : " + num2;
	}
}

public class OverMain2 {

	public static void main(String[] args) {
		
//		B1 bb = new B1();
//		
//		bb.num1 = 10;
//		bb.num2 = 20;
//		bb.num3 = 30;
//		
//		System.out.println(bb.print());

	
	
		A1 a1 = new A1(10,20);
		
		System.out.println(a1.toString()); // 오버라이딩한 결과가 출력됨
		
	}

}
