package chapter5;

class Person2 {
	String phone;
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}

class Professor1 extends Person2 {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}

public class Overriding {
	public static void main(String[] args) {
		Professor1 a = new Professor1();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		Person2 p = a;
		System.out.println(p.getPhone());
	}

}
