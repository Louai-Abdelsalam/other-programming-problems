import java.io.PrintStream;
import java.util.Scanner;

/**
 * 	Given a MazeRoom and a room name, the search facility of this class
 * 	will return a path to the desired room, if one exists.
 */
public class MazeSolver
{
	private MazeRoom start;
	private String totalPath;
	private boolean checker;
	
	/**
	 * Constructor
	 * 
	 * Initializes this object.
	 */
	public MazeSolver()
	{
		start = MazeRoom.buildMaze();
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
	 * 	@param from the room (just searched) through which this room was entered.
	 * 	@param goal the name of the destination room.
	 * 	@return a path from the current room to the goal (e.g., "A->F->G"), or
	 * 		null if no path exists.
	 */
	public String findPath(MazeRoom current, MazeRoom from, String goal)
	{
		// Your code goes here...
		// Hint: When you enter a room (i.e., current) search each connected,
 		// non-null room (using goNorth(), goSouth(), goEast(), and goWest()),
		// except the one from which you just came (i.e., from). Stop when the
		// current room's name is the goal.
		
		//current: F
		//from: A
		//goal G
		
		goal = goal.toUpperCase();
		
		
		
		if ( (current.goNorth() != null) && 
				(((current.goNorth()).getName()).equals(goal)) )
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goNorth()).getName();
			
			return totalPath;
			//path += "North ";
		}
		else if ( (current.goEast() != null) && 
				(((current.goEast()).getName()).equals(goal)) )
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goEast()).getName();
			
			return totalPath;
			//path += "East ";
		}
		else if ( (current.goSouth() != null) && 
				(((current.goSouth()).getName()).equals(goal)) )
		{
			checker = true;
			
			totalPath = current.getName() + " " +  (current.goSouth()).getName();
			
			return totalPath;
			//path += "South ";
		}
		else if ( (current.goWest() != null) && 
				(((current.goWest()).getName()).equals(goal)) )
		{
			checker = true;
			
			totalPath = current.getName() + " " + (current.goWest()).getName();
			
			return totalPath;
			//path += "West ";
		}
		else
		{
			if ( (current.goNorth() != null) && 
					(current.goNorth() != from) )
			{
				findPath(current.goNorth(), current, goal);
				
				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goEast() != null) && 
					(current.goEast() != from) )
			{
				findPath(current.goEast(), current, goal);

				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goSouth() != null) && 
					(current.goSouth() != from) )
			{
				findPath(current.goSouth(), current, goal);

				if (checker)
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
			}
			
			if ( (current.goWest() != null) && 
					(current.goWest() != from) )
			{
				findPath(current.goWest(), current, goal);

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