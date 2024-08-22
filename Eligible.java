package mypackage;
import java.util.Scanner;
public class Eligible
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter your age");
		int v=x.nextInt();
		if (v>18)
		{
		   System.out.println("your are eligible to vote");	
		}
		else
		{
			System.out.println("your are not eligible to vote");
		}
	}

}
