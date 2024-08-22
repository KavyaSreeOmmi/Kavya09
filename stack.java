package mypackage;
import java.util.*;
public class stack 
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(65);
		s.push(758687);
		s.push(3456);
		s.push(435678);
		s.push(34567);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		}
	

}
