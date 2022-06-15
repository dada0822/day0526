package day0526;

public class RacingCar extends Car {

	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("레이싱카가 만들어졌어요!");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "로 설정했어요!");
	}
	
}
