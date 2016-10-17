import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class MazeSolver2WithShortestPathTester 
{
	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		MazeSolver2WithShortestPath ms = new MazeSolver2WithShortestPath();
		MazeRoom start = ms.getEntrance();
		out.println("The entrance to the maze is room " + start.getName());
		out.print("Enter the destination room name: ");
		String goal = /*"";*/in.next();
		//System.out.println(goal.length());
		//*
		String path = ms.findPath(start, goal, new HashSet<MazeRoom>());
		out.print("\nThe path from " + start.getName() + " to " + goal + " is ");
		out.println(path == null ? "non existent!" : (path + "."));
		//*/
	}

}