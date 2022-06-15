package day0526;

//public class Lion extends Animal {
//
//	void roar() {
//	System.out.println("Lion의 roar()가 호출되었음");
//	}
//	
//}

class Lion{
	
	Animal an = new Animal();
	
	void roar() {
	System.out.println("Lion의 roar()가 호출되었음");
	an.eat();
	}
	
}