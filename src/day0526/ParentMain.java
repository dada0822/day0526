package day0526;

/* name : parent
 * ---------------
 * name : child
 * hobby : swimming */

class Parent{
	String name;
	
	void printInfo() {
		System.out.println("name : " + name);
	}
}

class Child extends Parent{
	String hobby;
	
	void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

public class ParentMain {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		
		System.out.println("--------------");
		
		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");
		c.printInfo();
	}

}
