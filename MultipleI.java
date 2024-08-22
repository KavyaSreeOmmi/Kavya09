package mypackage;

interface E1
{
   void show();
}
class Abb implements E1
{
	public void show() 
	{
		System.out.println("show method called");
	}
}
class MultipleI
{
	public static void main(String[] args) 
	{
		Abb a= new Abb();
		a.show();
	}
}