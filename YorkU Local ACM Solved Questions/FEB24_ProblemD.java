import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FEB24_ProblemD
{

	public static void main(String[] args)
	{
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner in = new Scanner(System.in);
		int key = 1, value, m = 0, n = 0, countM = 0, countN = 0;
		boolean state = false;
		
		m = in.nextInt();
		
		while (countM < m)
		{
			n = in.nextInt();
			countN = 0;
			
			while (countN < n)
			{
				value = in.nextInt();
				
				if (map.isEmpty())
				{
					map.put(key, value);
					key++;
				}
				else
				{
					for (int i = 1; i <= map.size(); i++)
					{
						if (value - map.get(i) >= 1440)
						{
							map.put(i, value);
							i = map.size() + 1;
							state = true;
						}
					}
					
					if (!state)
					{
						map.put(map.size() + 1, value);
					}
					
					state = false;
				}
				
				countN++;
			}
			
			System.out.printf("%d\n", map.size());
			map.clear();
			key = 1;
			countM++;
		}
		

	}

}
