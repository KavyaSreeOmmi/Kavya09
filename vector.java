package mypackage;
import java.util.*;
public class vector 
{
	public static void main(String[] args)
	{
		Vector v= new  Vector(3);
		int n1=v.capacity();
		System.out.println("capacity of vector:"+n1);
		v.add(32);
		v.add(43);
		v.add(76);
		v.add(657);
		System.out.println(v);
		int n2=v.capacity();
		System.out.println("new capacity of vector:"+n2);	
	}

}
