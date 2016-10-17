import java.util.Scanner;


public class ProblemA_Oct2
{

	public static void main(String[] args)
	{
		int n;
		int Ax1, Ay1, Ax2, Ay2, Bx1, By1, Bx2, By2;
		Scanner in = new Scanner(System.in);
		
		
		n = in.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			Ax1 = in.nextInt();
			Ay1 = in.nextInt();
			Ax2 = in.nextInt();
			Ay2 = in.nextInt();
			Bx1 = in.nextInt();
			By1 = in.nextInt();
			Bx2 = in.nextInt();
			By2 = in.nextInt();
			
			if ((Ax1 <= Bx1) && (Ax2 >= Bx2) && 
					(Ay1 <= By1) && (Ay2 >= By2))
			{
				System.out.println("A surrounds B");
			}
			else if ((Ax1 < Bx1) && (Ax2 > Bx2) && 
					(Ay1 <= By1) && (Ay2 >= By2))
			{
				System.out.println("A surrounds B");
			}
			else if ((Ax1 <= Bx1) && (Ax2 >= Bx2) && 
					(Ay1 < By1) && (Ay2 > By2))
			{
				System.out.println("A surrounds B");
			}
			
			
			else if ((Bx1 <= Ax1) && (Bx2 >= Ax2) && 
					(By1 <= Ay1) && (By2 >= Ay2))
			{
				System.out.println("B surrounds A");
			}
			else if ((Bx1 < Ax1) && (Bx2 > Ax2) && 
					(By1 <= Ay1) && (By2 >= Ay2))
			{
				System.out.println("B surrounds A");
			}
			else if ((Bx1 <= Ax1) && (Bx2 >= Ax2) && 
					(By1 < Ay1) && (By2 > Ay2))
			{
				System.out.println("B surrounds A");
			}
			
			
			
			
			else if (((Bx1 >= Ax1) && (Bx1 <= Ax2) && 
					(By2 >= Ay1) && (By2 <= Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 > Ax1) && (Bx1 < Ax2) && 
					(By2 > Ay1) && (By2 < Ay2)) || 
					((Bx2 > Ax1) && (Bx2 < Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 > Ax1) && (Bx1 < Ax2) && 
					(By2 > Ay1) && (By2 < Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 > Ax1) && (Bx1 < Ax2) && 
					(By2 >= Ay1) && (By2 <= Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 >= Ax1) && (Bx1 <= Ax2) && 
					(By2 > Ay1) && (By2 < Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 >= Ax1) && (Bx1 <= Ax2) && 
					(By2 > Ay1) && (By2 < Ay2)) || 
					((Bx2 > Ax1) && (Bx2 < Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 >= Ax1) && (Bx1 <= Ax2) && 
					(By2 > Ay1) && (By2 <= Ay2)) || 
					((Bx2 > Ax1) && (Bx2 < Ax2) && 
					(By1 > Ay1) && (By1 < Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 > Ax1) && (Bx1 < Ax2) && 
					(By2 > Ay1) && (By2 < Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 > Ay1) && (By1 < Ay2)))
			{
				System.out.println("A and B overlap");
			}
			else if (((Bx1 > Ax1) && (Bx1 < Ax2) && 
					(By2 >= Ay1) && (By2 <= Ay2)) || 
					((Bx2 >= Ax1) && (Bx2 <= Ax2) && 
					(By1 >= Ay1) && (By1 <= Ay2)))
			{
				System.out.println("A and B overlap");
			}

			
			
			
			
			
			
			
			
			else if ((Ay1 >= By1) && (Ay2 <= By2) && 
					(((Ax1 >= Bx1) && (Ax1 < Bx2)) || 
					((Ax2 > Bx1) && (Ax2 < Bx2))))
			{
				System.out.println("A and B overlap");
			}
			else if ((Ay1 >= By1) && (Ay2 <= By2) && 
					(((Ax1 > Bx1) && (Ax1 < Bx2)) || 
					((Ax2 > Bx1) && (Ax2 < Bx2))))
			{
				System.out.println("A and B overlap");
			}
			else if ((Ay1 > By1) && (Ay2 < By2) && 
					(((Ax1 > Bx1) && (Ax1 < Bx2)) || 
					((Ax2 > Bx1) && (Ax2 < Bx2))))
			{
				System.out.println("A and B overlap");
			}
			else if ((Ay1 > By1) && (Ay2 < By2) && 
					(((Ax1 >= Bx1) && (Ax1 <= Bx2)) || 
					((Ax2 >= Bx1) && (Ax2 <= Bx2))))
			{
				System.out.println("A and B overlap");
			}
			else if ((Ay1 > By1) && (Ay2 < By2) && 
					(((Ax1 >= Bx1) && (Ax1 <= Bx2)) || 
					((Ax2 > Bx1) && (Ax2 < Bx2))))
			{
				System.out.println("A and B overlap");
			}		
			else if ((Ay1 > By1) && (Ay2 < By2) && 
					(((Ax1 >= Bx1) && (Ax1 <= Bx2)) || 
					((Ax2 >= Bx1) && (Ax2 <= Bx2))))
			{
				System.out.println("A and B overlap");
			}
			
			
			
			else if ((Ax1 >= Bx1) && (Ax2 <= Bx2) && 
					(((Ay1 >= By1) && (Ay1 < By2)) || 
					((Ay2 >= By1) && (Ay2 <= By2))))
			{
				System.out.println("A and B overlap");
			}
			else
			{
				System.out.println("A and B do not overlap");
			}
				
		}

	}

}

/*
3
10 10 20 20 12 0 14 18 0 0 5 5 0 0 6 6 0 0 5 5 0 5 5 10
*/