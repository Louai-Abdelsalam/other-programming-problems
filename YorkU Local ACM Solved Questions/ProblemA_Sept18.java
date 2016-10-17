import java.util.Scanner;


public class ProblemA_Sept18
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double grade = in.nextDouble();
		double average = 0;
		boolean correctGrade = true;
		
		
		if (grade >= 0 && grade <= 100 && correctGrade == true)
		{
			average += (grade * 20) / 100;
			
			grade = in.nextDouble();
		}
		else
		{
			correctGrade = false;
		}
		
		if (grade >= 0 && grade <= 100 && correctGrade == true)
		{
			average += (grade * 30) / 100;
			
			grade = in.nextDouble();
		}
		else
		{
			correctGrade = false;
		}
		
		if (grade >= 0 && grade <= 100 && correctGrade == true)
		{
			average += (grade * 50) / 100;
		}
		else
		{
			correctGrade = false;
		}
		
		if (correctGrade)
		{
			System.out.printf("%.2f", average);
		}
		else
		{
			System.out.print("Grades input incorrect");
		}

	}

}
