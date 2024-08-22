package mypackage;

import java.util.Scanner;

public class Evenodd
{
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the number");
		int x=a.nextInt();
		if(x%2!=0)
		{
			System.out.println(x+" is Odd");
		}
	}

}
