import java.util.Scanner;

public class Sept12_ProbA
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double h, c;

		h = in.nextDouble();
		
		if (h >= 25)
		{
			System.out.println("Too hot!");
		}
		else if (h <= 0)
		{
			System.out.println("Too cold!");
		}
		else
		{
			c = (2 * h) - 10;
			System.out.printf("%.0f\n", c);
		}	
	}

}
