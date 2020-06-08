import java.util.*;

public class InsultGenerator {
	
	public static void main(String [] args)
	{
	
		String [] first = {"absolute", "total", "entire", "whole", "linty", "overrated", "twice-used"};
		String [] second = {"chicken", "turd", "hairtie", "stinking", "knockoff"};
		String [] third = {"sniffer", "breath", "idiot", "platypus bill", "curry", "toilet paper"};
		
		String f, s, t;
		
		f = first[(int)(Math.random()*first.length)];
		s = second[(int)(Math.random()*second.length)];
		t = third[(int)(Math.random()*third.length)];
		
		System.out.println(f + " " + s + " " + t);		
	}
	
	
	
}
