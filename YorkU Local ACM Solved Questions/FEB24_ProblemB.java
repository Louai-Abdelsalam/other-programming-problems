import java.util.Scanner;


public class FEB24_ProblemB
{

	public static void main(String[] args)
	{
		double n;
		int count = 0;
		double oneSideBase;
		double oneSideBaseCopy;
		double sum;
		Scanner in = new Scanner(System.in);
		
		n = in.nextDouble();
		
		while (count < n)
		{
			oneSideBase = in.nextDouble();
			oneSideBaseCopy = oneSideBase;
			sum = 0;
			//oneSideBase--;
			
			for (int i = 0; i < oneSideBaseCopy; i++)
			{
				for (int j = 0; j < oneSideBase; j++)
				{
					sum += (oneSideBase - j);
				}
				
				oneSideBase--;
				//sum += (oneSideBase - i);
			}
			
			System.out.printf("%d: %.0f %.0f\n", count + 1, oneSideBaseCopy, sum);
		
			count++;
		}
	}
}
