package mypackage;
public class practice1 
{
	public static void main(String[] args) 
	{
		float fahrenheit =62.5;
		double celsius;
		{
			try
			{
				celsius= F2C(fahrenheit); 
			}
            catch(Exception e)
            {
            	System.out.println(fahrenheit + "F = " + celsius + 'C');
            }
		}
		double F2C(float fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
}
}
