package mypackage;

public class Demo5 {
	public static void main(String[] args)
	{
		int a[][]=new int[2][2];
		a[0][0]=5;
		a[0][1]=4;
		a[1][0]=6;
		a[1][1]=8;
		for (int r=0;r<2;r++)
		{ 
			for(int c=0; c<2; c++) 
			{
				System.out.println(a[r][c]+ "\n");
			}
			
		}
	
	}

}
