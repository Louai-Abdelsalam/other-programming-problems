import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;


public class MazeSolver2
{
	private MazeRoom start;
	private String totalPath;
	private boolean checker;
	
	/**
	 * 	Initializes this object.
	 */
	public MazeSolver2()
	{
		start = MazeRoom.buildCyclicMaze();
		totalPath = "";
		checker = false;
	}
	
	/**
	 * 	Provides access to the maze entrance.
	 * 	@return the entrance to the maze.
	 */
	public MazeRoom getEntrance()
	{
		return start;
	}
	
	/**
	 * 	Finds a path from the current room in the maze to the room with the name
	 * 	provided by goal, if one exists.
	 * 	@param current the current room being searched.
	 * 	@param goal the name of the destination room.
	 * 	@param visited all the rooms already searched.
	 * 	@return a path from the current room to the goal (e.g., "A->F->G"), or
	 * 		null if no path exists.
	 */
	public String findPath(MazeRoom current, String goal,
			HashSet<MazeRoom> visited)
	{
		// Your code goes here...
		// Hint: When you enter a room (i.e., current) search each connected,
 		// non-null room (using goNorth(), goSouth(), goEast(), and goWest()),
		// except ones that are already in the set. Stop when the current room's
		// name is the goal.
		
		
		
		goal = goal.toUpperCase();
		
		
		
		if ( (current.goNorth() != null) && 
				(((current.goNorth()).getName()).equals(goal)) &&
				!visited.contains(current.goNorth()))
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goNorth()).getName();
			
			return totalPath;
			//path += "North ";
		}
		else if ( (current.goEast() != null) && 
				(((current.goEast()).getName()).equals(goal)) &&
				!visited.contains(current.goEast()))
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goEast()).getName();
			
			return totalPath;
			//path += "East ";
		}
		else if ( (current.goSouth() != null) && 
				(((current.goSouth()).getName()).equals(goal)) &&
				!visited.contains(current.goSouth()))
		{
			checker = true;
			
			totalPath = current.getName() + " " +  (current.goSouth()).getName();
			
			return totalPath;
			//path += "South ";
		}
		else if ( (current.goWest() != null) && 
				(((current.goWest()).getName()).equals(goal)) &&
				!visited.contains(current.goWest()))
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goWest()).getName();
			
			return totalPath;
			//path += "West ";
		}
		else
		{
			
			visited.add(current);
			
			if ( (current.goNorth() != null) && 
					!visited.contains(current.goNorth()) )
			{
				findPath(current.goNorth(), goal, visited);
				
				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goEast() != null) && 
					!visited.contains(current.goEast()) )
			{
				findPath(current.goEast(), goal, visited);

				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goSouth() != null) && 
					!visited.contains(current.goSouth()) )
			{
				findPath(current.goSouth(), goal, visited);

				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goWest() != null) && 
					!visited.contains(current.goWest()) )
			{
				findPath(current.goWest(), goal, visited);

				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
		}
		
		return totalPath;
	}
}