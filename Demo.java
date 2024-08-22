package mypackage;

abstract class Abs {
	abstract void show();
	void display()
	{
		System.out.println("complete method of abstract class");
	}
}
class Pen extends Abs{
	void show() {
	System.out.println("abstract method of Test class");
	}
}
class Demo{
	public static void main(String[] args) {
		Pen p = new Pen();
		p.show();
		p.display();
	}
}

