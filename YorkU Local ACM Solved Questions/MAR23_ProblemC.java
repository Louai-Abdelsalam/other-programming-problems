import java.util.Scanner;


public class MAR23_ProblemC
{

	public static void main(String[] args)
	{
		/*
		final double pie = 3.14159265358979323846264338327950288419716939937510;
		Scanner in = new Scanner(System.in);
		double height, radius, cents, max = 0;
		double[] volPerCent;
		int t, n, index = 0;
		int countT = 0, countN = 0;
		String type = "";
		
		
		t = in.nextInt();
		
		while (countT < t)
		{
			n = in.nextInt();
			volPerCent = new double[n];
			
			while (countN < n)
			{
				type = in.next();
				height = in.nextDouble();
				radius = in.nextDouble();
				cents = in.nextDouble();
				
				if (type.equals("cone"))
				{
					volPerCent[countN] = (((pie) * (radius * radius) * (height/3)) + ((2/3) * (pie) * (radius * radius * radius)))/cents;
				}
				else
				{
					volPerCent[countN] = ((pie) * (radius * radius) * height)/cents;
				}
				
				countN++;
			}
			countN = 0;
			
			//for (int i = 0; i < n; i++)
			//{
			//	System.out.println(volPerCent[i]);
			//}
			
			for (int i = 0; i < n; i++)
			{
				if (i == 0)
				{
					max = volPerCent[i];
					index = i;
				}
				else
				{
					if (volPerCent[i] > max)
					{
						max = volPerCent[i];
						index = i;
					}
				}
			}
			
			System.out.println(index + 1);
			index = 0;
			max = 0;
			
			countT++;
		}
		countT = 0;
		*/
		
		//final int pie = 3;
		Scanner in = new Scanner(System.in);
		double height, radius, cents; //change int if fails
		double max = 0, x, y;
		double[] volPerCent;
		int t, n, index = 0;
		int countT = 0, countN = 0;
		String type = "";
		
		
		t = in.nextInt();
		
		while (countT < t)
		{
			n = in.nextInt();
			volPerCent = new double[n];
			
			while (countN < n)
			{
				type = in.next();
				height = in.nextDouble();
				radius = in.nextDouble();
				cents = in.nextDouble();
				
				if (type.equals("cone"))
				{
					volPerCent[countN] = cents * ((((radius * radius * height)/3) + ((2)* ((radius * radius * radius)/3)))/cents);
					//volPerCent[countN] = (((radius * radius) * (height)) + ((2)* (radius * radius * radius)));
					//x = (radius * radius) * height;
					//x = x / 3;
					//y = 2 * (radius * radius * radius);
					//y = y / 3;
					//volPerCent[countN] = x + y;
					//volPerCent[countN] = volPerCent[countN]/cents;
				}
				else
				{
					volPerCent[countN] = 1 / 2 * cents * (((radius * radius) * height)/cents);
				}
				
				countN++;
			}
			countN = 0;
			
			for (int i = 0; i < n; i++)
			{
				System.out.println(volPerCent[i]);
			}
			
			for (int i = 0; i < n; i++)
			{
				if (i == 0)
				{
					max = volPerCent[i];
					index = i;
				}
				else
				{
					if (volPerCent[i] > max)
					{
						max = volPerCent[i];
						index = i;
					}
				}
			}
			
			System.out.println(index + 1);
			index = 0;
			max = 0;
			
			countT++;
		}
		countT = 0;
	}

}
