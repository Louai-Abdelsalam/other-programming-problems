import java.util.Scanner;


public class MAR09_ProblemC
{

	public static void main(String[] args)
	{
		int T, sideX, sideY, sideZ;
		Scanner in = new Scanner(System.in);
		int count = 0;
		String answer = "";
		
		T = in.nextInt();
		
		while (count < T)
		{
			sideX = in.nextInt();
			sideY = in.nextInt();
			sideZ = in.nextInt();
			
			if ((sideX + sideY > sideZ) && (sideX + sideZ > sideY) && (sideZ + sideY > sideX))
			{
				if ((sideX == sideY) && (sideX == sideZ))
				{
					answer = "Equilateral";
				}
				else if ((sideX == sideY) || (sideX == sideZ) || (sideY == sideZ))
				{
					answer = "Isosceles";
				}
				else
				{
					answer = "Scalene";
				}
			}
			else
			{
				answer = "Invalid";
			}

			System.out.printf("Case %d: %s\n", (count + 1), answer);
			answer = "";
			
			count++;
		}
	}

}
