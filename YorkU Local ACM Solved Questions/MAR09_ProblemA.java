import java.util.Scanner;


public class MAR09_ProblemA
{

	public static void main(String[] args)
	{
		int col;
		String string;
		Scanner in = new Scanner(System.in);
		int countX = 0;
		int countY = 0;
		int count = 0;
		char[][] arr;
		
		col = in.nextInt();
		
		while (col != 0)
		{
			string = in.next();
			arr = new char[string.length()/col][col];

			while (countX < (string.length())/col)
			{
				if (countX % 2 == 0)
				{
					while (countY < col)
					{
						arr[countX][countY] = string.charAt(count);
						count++;
						countY++;
					}
					
					countY--;
				}
				else
				{
					while (countY > -1)
					{
						arr[countX][countY] = string.charAt(count);
						count++;
						countY--;
					}
					
					countY++;
				}
				
				countX++;
			}
			
			for (int x = 0; x < col; x++)
			{
				for (int y = 0; y < (string.length()/col); y++)
				{
					System.out.printf("%c", arr[y][x]);
				}
			}
			
			System.out.println();
			
			count = 0;
			countX = 0;
			countY = 0;
			col = in.nextInt();
		}
	}

}
