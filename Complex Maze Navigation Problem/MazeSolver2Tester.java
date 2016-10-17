import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;


public class MazeSolver2Tester
{

	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		MazeSolver2 ms = new MazeSolver2();
		MazeRoom start = ms.getEntrance();
		out.println("The entrance to the maze is room " + start.getName());
		out.print("Enter the destination room name: ");
		String goal = in.next();
		String path = ms.findPath(start, goal, new HashSet<MazeRoom>());
		out.print("\nThe path from " + start.getName() + " to " + goal + " is ");
		out.println(path == null ? "non existent!" : (path + "."));
	}

}
