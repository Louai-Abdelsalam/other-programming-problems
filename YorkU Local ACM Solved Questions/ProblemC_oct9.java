import java.util.Scanner;


public class ProblemC_oct9
{

	public static void main(String[] args)
	{
		int[] x;
		int[] y;
		int c;
		int n;
		int count = 0;
		int LPInverseCount = 0;
		Scanner in = new Scanner(System.in);
		
		c = in.nextInt();
		
		while (count < c)
		{
			n = in.nextInt();
			
			x = new int[n];
			y = new int[n];
			
			for (int i = 0; i <= n; i++)
			{
				for (int j = 0; j <= n; j++)
				{
					if ((i % 2) == 0 && (j % 2) == 0)
					{
						LPInverseCount++;
					}
					else if (i == j && i != 1 && i == 0)
					{
						LPInverseCount++;
					}
					else if ((i == 0 || j != 0) && (i != 0 && j != 1)
							&&(i != 1 && j != 0))
					{
						LPInverseCount++;
					}
				}
			}
			
			System.out.printf("%d %d %d\n", count + 1, n, (n*n - LPInverseCount) /*- 4*/);
			
			LPInverseCount = 0;
			count++;
		}

	}

}
