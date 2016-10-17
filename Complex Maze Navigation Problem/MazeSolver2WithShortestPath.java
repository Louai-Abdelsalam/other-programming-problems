import java.util.HashSet;

public class MazeSolver2WithShortestPath 
{
	public final int MAIN_DIRECTIONS = 4;
	private MazeRoom start;
	private String totalPath;
	private String possibleTotalPaths[]; 
	private boolean checker;
	
	/**
	 * 	Initializes this object.
	 */
	public MazeSolver2WithShortestPath ()
	{
		start = MazeRoom.buildCyclicMaze();
		totalPath = "";
		possibleTotalPaths = new String[MAIN_DIRECTIONS];
		checker = false;
		
		for (int count = 0; count < MAIN_DIRECTIONS; count++)
		{
			possibleTotalPaths[count] = "";
		}
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
			if ( (current.goNorth() != null) && 
					!visited.contains(current.goNorth()) )
			{
				visited.add(current);
				
				findPath(current.goNorth(), goal, visited);
				
				if (checker && (current.getName() != "I"))
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
				else if (checker && (current.getName() == "I"))
				{
					visited.clear();
					visited.add(current);
					totalPath = current.getName() + " " + totalPath;
					possibleTotalPaths[0] = totalPath;
				}
			}
			
			if ( (current.goEast() != null) && 
					!visited.contains(current.goEast()) )
			{
				visited.add(current);
				
				findPath(current.goEast(), goal, visited);

				if (checker && (current.getName() != "I"))
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
				else if (checker && (current.getName() == "I"))
				{
					visited.clear();
					visited.add(current);
					totalPath = current.getName() + " " + totalPath;
					possibleTotalPaths[1] = totalPath;
				}
			}
			
			
			
			if ( (current.goSouth() != null) && 
					!visited.contains(current.goSouth()) )
			{
				visited.add(current);
				
				findPath(current.goSouth(), goal, visited);

				if (checker && (current.getName() != "I"))
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
				else if (checker && (current.getName() == "I"))
				{
					visited.clear();
					visited.add(current);
					totalPath = current.getName() + " " + totalPath;
					possibleTotalPaths[2] = totalPath;
				}
			}
			
			
			
			if ( (current.goWest() != null) && 
					!visited.contains(current.goWest()) )
			{
				visited.add(current);
				
				findPath(current.goWest(), goal, visited);

				if (checker && (current.getName() != "I"))
				{
					totalPath = current.getName() + " " + totalPath;
					
					return totalPath;
				}
				else if (checker && (current.getName() == "I"))
				{
					visited.clear();
					visited.add(current);
					totalPath = current.getName() + " " + totalPath;
					possibleTotalPaths[3] = totalPath;
				}
			}
		}
		
		if ((possibleTotalPaths[0] != "" || possibleTotalPaths[1] != "" ||
				possibleTotalPaths[2] != "" || possibleTotalPaths[3] != "") 
				&& (current.getName() == "I"))
		{			
			
			System.out.println(possibleTotalPaths[0].length());
			System.out.println(possibleTotalPaths[1].length());
			System.out.println(possibleTotalPaths[2].length());
			System.out.println(possibleTotalPaths[3].length());
			
			for (int size = -1, count = 0, oneTimeOnly = 0, index = -1; count < MAIN_DIRECTIONS; count++)
			{
				if ((possibleTotalPaths[count] != "") && (oneTimeOnly == 0))
				{
					size = possibleTotalPaths[count].length();
					index = count;
					oneTimeOnly = 1;
				}
				else if ((possibleTotalPaths[count].length() < size) && 
						(possibleTotalPaths[count] != ""))
				{
					size = possibleTotalPaths[count].length();
					index = count;
				}
				
				totalPath = possibleTotalPaths[index];
			}
			
		}
		
		return totalPath;
	}
}