import java.util.Scanner;


public class MAR23_ProblemE
{

	public static void main(String[] args)
	{
		int[] numOfQuestionsSolvedCounter;
		Scanner in = new Scanner(System.in);
		int T, n, m, storage, max = 0, index = 0;
		int countT = 0, countN = 0, countM = 0;
		String name = "";
		
		T = in.nextInt();
		
		while (countT < T)
		{
			n = in.nextInt();
			m = in.nextInt();
			numOfQuestionsSolvedCounter = new int[m];
			
			for (int i = 0; i < m; i++)
			{
				numOfQuestionsSolvedCounter[i] = 0;
			}
			
			while (countN < n)
			{
				name = in.next();
				
				while (countM < m)
				{
					storage = in.nextInt();
					
					if (storage != 0)
					{
						numOfQuestionsSolvedCounter[countM]++;
					}
					
					
					countM++;
				}
				countM = 0;
				
				countN++;
			}
			countN = 0;
		
			for (int i = 0; i < m; i++)
			{
				if (i == 0)
				{
					max = numOfQuestionsSolvedCounter[i];
					index = i;
				}
				else
				{
					if (numOfQuestionsSolvedCounter[i] > max)
					{
						max = numOfQuestionsSolvedCounter[i];
						index = i;
					}
				}
			}
			
			System.out.printf("Problem %d is easiest.\n", index + 1);
			
			index = 0;
			max = 0;
			
			countT++;
		}
		countT = 0;
	}

}
