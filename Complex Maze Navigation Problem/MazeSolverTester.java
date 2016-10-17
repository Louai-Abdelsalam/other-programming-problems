import java.io.PrintStream;
import java.util.Scanner;

public class MazeSolverTester
{

	/**
	 * 	Used to test the functionality of this class.
	 */
	public static void main(String[] args)
	{
		/*
		String x = "";
		
		x += "Hi";
		x += " my name is louai";
		System.out.println(x);
		*/
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		MazeSolver ms = new MazeSolver();
		MazeRoom start = ms.getEntrance();
		out.println("The entrance to the maze is room " + start.getName());
		out.print("Enter the destination room name: ");
		String goal = in.next();
		//System.out.println(start.getName());
		//*
		String path = ms.findPath(start, null, goal);
		out.print("The path from " + start.getName() + " to " + goal + " is ");
		out.println(path == null ? "non existent!" : (path + "."));
		//*/
	}
}