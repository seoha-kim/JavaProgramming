package chapter5;

class Person1 {}
class Student1 extends Person1 {}
class Researcher extends Person1 {}
class Professor extends Researcher {}

public class instanceofExample {

	public static void main(String[] args) {
		Person1 jee = new Student1();
		Person1 kim = new Professor();
		Person1 lee = new Researcher();
		
		if (jee instanceof Student1)
			System.out.println("jee는 Student 타입.");
		if (jee instanceof Researcher)
			System.out.println("jee는 Researcher 타입.");
		if (kim instanceof Student1)
			System.out.println("kim은 Student 타입.");
		if (kim instanceof Professor)
			System.out.println("kim은 Professor 타입.");

	}

}
