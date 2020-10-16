package chapter5;

class DObject{
	public DObject next;
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() { // 메소드 오버라이딩
	System.out.println("Line.");
	}
}

class Rect extends DObject {
	public void draw() { // 메소드 오버라이딩 
		System.out.println("Rect.");
	}
}

class Circle extends DObject {
	public void draw() { // 메소드 오버라이딩 
		System.out.println("Circle.");
	}
}

public class MethodOveridingEx {
	public static void main(String[] args) {
		DObject obj = new DObject(); 
		Line line = new Line(); 
		DObject p = new Line(); 
		DObject r = line; 
		
		obj.draw(); // DObject.draw() 메소드 실행. "DObject draw" 출력 
		line.draw(); // Line.draw() 메소드 실행. "Line" 출력 
		p.draw(); // 오버라이딩된 메소드 Line.draw() 실행, "Line" 출력 
		r.draw(); // 오버라이딩된 메소드 Line.draw() 실행, "Line" 출력 
		
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw(); // 오버라이딩된 메소드 Rect.draw() 실행, "Rect" 출력 
		circle.draw(); // 오버라이딩된 메소드 Circle.draw() 실행, "Circle" 출력 
	}
}
