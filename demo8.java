package mypackage;

class Test2 {
	void show() {
	System.out.println("parent class method called");
	}
}
class Test extends Test2{
	void show() {
		super.show();
	System.out.println("child class method called");
	}
}
public class demo8{
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
}
