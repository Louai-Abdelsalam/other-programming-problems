import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ProblemB_Oct9
{

	public static void main(String[] args)
	{
		String[] s1;
		String[] s2;
		Set<Integer> set = new HashSet<Integer>();
		int k, n, count = 0, similarCount = 0;
		Scanner in = new Scanner(System.in);
		
		k = in.nextInt();
		
		while (count < k)
		{

			n = in.nextInt();
			
			s1 = new String[n];
			s2 = new String[n];
			
			for (int i = 0; i < n; i++)
			{
				s1[i] = in.next();
			}
			for (int i = 0; i < n; i++)
			{
				s2[i] = in.next();
			}
			
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if ((s1[i].compareTo(s2[j]) == 0) 
							&& !set.contains(j))
					{
						set.add(j);
						j = n;
					}
				}
			}
			
			System.out.printf("%d\n", set.size());
			
			for (int i = 0; i < n; i++)
			{
				s1[i] = null;
				s2[i] = null;
			}
			
			set.clear();
			count++;
		}
		

	}

}

/*
1
5
correct
wronganswer
correct
correct
timelimit
wronganswer
correct
timelimit
correct
timelimit
*/
