package mypackage;

public class stringbufferm 
{
	public static void main(String[] args)
	{
		StringBuffer d= new StringBuffer("Hello World");
		System.out.println(d);
		StringBuffer e=d.append("!!!!");
		System.out.println(e);
		StringBuffer f=d.replace(3,5,"uuo");
		System.out.println(f);
	}

}
