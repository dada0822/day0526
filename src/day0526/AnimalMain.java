package day0526;

public class AnimalMain {

	public static void main(String[] args) {
	 
		Lion lion = new Lion();
		
		// 상속
//		lion.roar();
//		lion.eat();
//		lion.sleep();
		
		// 포함
		lion.roar();
		lion.an.eat();
		lion.an.sleep();
		
		Eagle eagle = new Eagle();
		
		eagle.fly();
		eagle.eat();
		eagle.sleep();

	}

}
