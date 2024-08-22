
package mypackage;

class Ink
{
	void show() 
	{
	System.out.println("parent class method called");
	}
}
class Pen extends Ink
{
	void show1() 
	{
	super.show();
	System.out.println("child class method called");
	}
}
public class inheritance
{
	public static void main(String[] args)
	{
		Pen t = new Pen();
		t.show();
	}
}



