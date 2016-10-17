import java.util.Scanner;
import java.io.PrintStream;

public class Problem_B_Sept25
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String string;
		String s1, s2, s3, trialString, min, max;
		int x, y;
		boolean state = true;
	
		
	
		
		string = in.next();
		min = string;
		
		
		s1 = string.substring(0, (string.length()/2));
		s3 = string.substring((string.length()/2), string.length());
		s2 = "";
		
		
		
		for (int i = 1; i <= s3.length(); i++)
		{
			s2 += s3.charAt(s3.length() - i);
		}
		
		System.out.println(s2);
		
		if (Integer.parseInt(s1) > Integer.parseInt(s2))
		{
			s2 = "";
			
			for (int i = 1; i <= s1.length(); i++)
			{
				s2 += s1.charAt(s1.length() - i);
			}
		}
		else
		{
			s1 = "";
			
			for (int i = 1; i <= s2.length(); i++)
			{
				s1 += s2.charAt(s2.length() - i);
			}
		}
		
		max = s1 + s2;
		y = Integer.parseInt(max);
		
		System.out.print(max);
		/*
		while (y > Integer.parseInt(string))
		{
			for (int i = 1; i <= s1.length(); i++)
			{
				s2 += s1.charAt(s1.length() - i);
			}
			
			
			y = Integer.parseInt(s1 + s2);
		}
		//*/
	}	
}
