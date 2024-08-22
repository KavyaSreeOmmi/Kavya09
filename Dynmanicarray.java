package mypackage;

public class Dynmanicarray
{
	public static void main(String[] args)
	{
		int arr[][]= new int[3][3];
	    arr[0][0]=67;
	    arr[0][1]=45;
	    arr[1][0]=54;
	    arr[1][1]=34;
	    arr[0][2]=56;
	    arr[1][1]=89;
	    arr[1][2]=76;
	    arr[2][2]=99;
	    arr[2][1]=88;
	    for (int r=0;r<3;r++)
		{ 
			for(int c=0; c<3; c++) 
			{
				System.out.print(arr[r][c]+" ");
	        }
		System.out.println("\n");
		}
	}
}

	
