package mypackage;
import java.util.*;
public class lambda
{
	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();	
		l.add("kavya");
		l.add("gita");
		l.add("siri");
		l.add("varshini");
		l.add("Pappagi");
		l.forEach((i)->System.out.println(i));
	}

}