package mypackage;

abstract class Abr
{
	abstract  void show();
	void display()
	{
	    System.out.println("method invoked");	
	}
}
class pencil extends Abr

{
	void show()
	{
		System.out.println("abstract invoked");
	}
}
class abstractm
{
	public static void main(String[] args)
	{
		pencil p=new pencil();
		p.show();
		p.display();
		
	}
}
