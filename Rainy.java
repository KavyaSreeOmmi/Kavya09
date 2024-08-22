package mypackage;
import java.util.Scanner;

public class Rainy
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int a=x.nextInt();
	    switch(a)
	    {
	    case 6: case 7: case 8: case 9:
	    	System.out.println("Rainy");
	    	break;
	    case 10: case 11: case 12: case 1:
	    	System.out.println("Winter");
	    	break;
	    case 2: case 3: case 4: case 5:
	    	System.out.println("summer");
	    	break;
	    default :
	    	System.out.println("Invalid number");
	    	
	    }
	} 

}
