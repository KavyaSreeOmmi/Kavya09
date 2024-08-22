package mypackage;

class Size 
{
	void shape(int i)
	{
	System.out.println("triangle"+i);
	}
    void shape(float y)
    {
    System.out.println("ractangle"+y);
    }
    void shape(long k) 
    {
    System.out.println("square"+k);
    }
}
class Demo7
{
	public static void main(String[] args)
	{
		Size d=new Size();
		d.shape(77);
	}
}

