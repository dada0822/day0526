package day0526;

public class Car {

	private int num;
	private double gas;
	
	Car(){
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌어요!");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호는 " + num + ", 연료량은 " + gas + "로 변경");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num);
		System.out.println("연료량은 " + gas);
	}
	
}
