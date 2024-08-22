package mypackage;
import java.util.*;
public class generics
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		//hs.add(32);
		//hs.add(324);
		System.out.println(hs);
	}

}
