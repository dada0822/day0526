package day0526;

public class SmartTv extends Tv {

	// 단일 상속밖에 안 되기 때문에 하나는 상속 하나는 포함관계로
	// 또는 인터페이스 !

	Netflex net = new Netflex(); // 포함관계 단점 : 늘 객체를 만들어야 한다.
	
	int counter = net.counter;

	void play() { net.play(); }
	void stop() { net.stop(); }
	void rew() { net.rew(); }
	void ff() { net.ff(); }
	
}
