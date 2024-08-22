package mypackage;

import java.util.Scanner;

public class Multiplication
{
	public static void main(String[] args)
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter your number");
		int a=x.nextInt();
		for(int y=2;y<=a;y++)
		{
			for (int z=1;z<=20;z++)
			{
				System.out.println((y*z));
			}
			
		}
	}
}	
	


