import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ProblemB_Sept18
{

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//String[] names = new String[n];
		ArrayList<String> names = new ArrayList<String>();
		Set <String> disqualified = new TreeSet<String>();
		double maxVotes = 0;
		//double minVotes = n;
		double count = 1;
		int indexMax = 0; //set to zero but should definitely change in the coming loops.
		//int indexMin = 0;
		String string;
		
		while (n != 0)
		{
			for (int i = 0; i < n; i++)
			{
				string = in.next();
				
			//	if (!disqualified.contains(string))
			//	{
					names.add(string);
			//	}
			}
			
			//minVotes = names.size();
			
			for (int i = 0; i < names.size() - 1; i++)
			{
				for (int j = i+1; j < names.size(); j++)
				{
					if (names.get(i).compareTo(names.get(j)) == 0)
					{
						count++;
					}
				}
				
				if (count > maxVotes)
				{
					maxVotes = count;
					//count = 1;
					indexMax = i;
				}
				
				count = 1;
			//	if (count < minVotes)
			//	{
			//		minVotes = count;
			//		indexMin = i;
			//	}
				
				//count = 1;
				
			}
			
			if ((maxVotes/n) > 0.5)
			{
				System.out.println(names.get(indexMax) + " got a strict majority.");
				
			}
			else
			{
				System.out.println("There was no strict majority.");
			//	disqualified.add(names.get(indexMin));
			}
			
			names.clear();
			maxVotes = 0;
			count = 1;
			indexMax = 0;
			
			n = in.nextInt();
			//minVotes = n;
		}

	}

}



/*
6
Justin
Stevie
Justin
Tommy
Justin
Justin
5
Lizzie
Justin
Stevie
Tommy
Lizzie





7
ahmad
ahmad
louai
7sein
louai
ahmad
7sein
*/