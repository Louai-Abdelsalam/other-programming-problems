class Position:
    def __init__(self, north = False, east = False, south = False, west = False, exit = False):
        self.north = north
        self.east = east
        self.south = south
        self.west = west
        self.exit = exit

class Coordinate:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        
    def __eq__(self, other):
        if self.x == other.x and self.y == other.y:
            return True
        else:
            return False

########################## The algorithm explained ################################

# Finds path recursively from exit location backwards to starting location.

# We keep track of where we've been by using an accumulative coordinates' list that's passed to 
# the iteration of the location we're moving to. So in each recursive iteration, we get the list
# from the previous location we came from, then add our current location, then send it over to 
# the next location iteration.
# At the bottom of the recursion chain (i.e at the starting location), we add the current
# location to the list then send it back up the recursion chain, where eventually it 
# reaches the very top and we end up with a list of locations as the coordinate path from the exit
# location to the starting location (i.e the path in reverse).

# In cases where we hit a dead end, we DON'T include the dead end's
# location in the list, and we also remove the parent iteration's location from the list as well, 
# then we send the list back up an iteration. This way, when the parent iteration does not 
# find its own location in the list we sent back to it from the dead end (even though the parent
# added its own location in the list before sending it to what turned out to be a dead end
# iteration), it knows that this specific recursive path (which led to the dead end) is a dead 
# end, after which the parent iteration tries another recursive path. If it's out of those, then
# it knows that all recursive paths from it are dead ends, and so removes its own parent's name
# from the tracker list (for the same reason the first dead end iteration did) and sends it
# further up the recursive chain to be tried elsewhere.
def find_path(x, y, path_record_list, maze):
    # if current location NOT the starting location
    if not (x == 0 and y == 0):
        # move west if there is a path, and if you weren't there before
        if maze[y][x].west == True and Coordinate(x-1, y) not in path_record_list:
            # Check this path only if we still didn't find the full path, which is concluded by 
            # whether or not the current location is already in the path list.
            # Technically this check is not required here since this is the first direction
            # we are checking, and so it's impossible to already have the current location
            # in the path list, but I'll keep it here for legibility consistency.
            if Coordinate(x, y) not in path_record_list:
                # add current location to `path_record_list` before changing locations
                path_record_list.append(Coordinate(x, y))
                
                recursive_child_returned_path_list = find_path(x-1, y, path_record_list, maze)
                path_record_list = recursive_child_returned_path_list
        # move north if there is a path, and if you weren't there before
        if maze[y][x].north == True and Coordinate(x, y-1) not in path_record_list:
            # check this path only if we still didn't find the full path, which is concluded by 
            # whether or not the current location is already in the path list 
            if Coordinate(x, y) not in path_record_list:
                # add current location to `path_record_list` before changing locations
                path_record_list.append(Coordinate(x, y))
                
                recursive_child_returned_path_list = find_path(x, y-1, path_record_list, maze)
                path_record_list = recursive_child_returned_path_list
        # move south if there is a path, and if you weren't there before
        if maze[y][x].south == True and Coordinate(x, y+1) not in path_record_list:
            # check this path only if we still didn't find the full path, which is concluded by 
            # whether or not the current location is already in the path list 
            if Coordinate(x, y) not in path_record_list:
                # add current location to `path_record_list` before changing locations
                path_record_list.append(Coordinate(x, y))
                
                recursive_child_returned_path_list = find_path(x, y+1, path_record_list, maze)
                path_record_list = recursive_child_returned_path_list
        # move east if there is a path, and if you weren't there before
        if maze[y][x].east == True and Coordinate(x+1, y) not in path_record_list:
            # check this path only if we still didn't find the full path, which is concluded by 
            # whether or not the current location is already in the path list 
            if Coordinate(x, y) not in path_record_list:
                # add current location to `path_record_list` before changing locations
                path_record_list.append(Coordinate(x, y))
                
                recursive_child_returned_path_list = find_path(x+1, y, path_record_list, maze)
                path_record_list = recursive_child_returned_path_list
        
        # if this location is a dead end —based on checking all possible paths from here and still
        # not finding the current location in the tracker list— then remove parent location as
        # well in order to indicate to it that this is a dead end path.
        if Coordinate(x, y) not in path_record_list:
            path_record_list.pop()
    
        return path_record_list
    # if current location is the starting location
    else:
        # add current location to the path list, and return it up the recursion chain
        path_record_list.append(Coordinate(x, y))
        return path_record_list

# finds exit location (only 1 is assumed to exist), then calls the path-finding recursive algo
def escape_route(maze):
    # coordinates of where there is an exit.
    # will assume only 1 exit.
    exit_x=0
    exit_y=0
    # loop tracker var for iterating through maze locations
    y=0
    # list to record location coordinates of the path to the exit location in the maze
    path_record_list = []
    
    # iterates through the maze vertically to find the exit location
    for vertical in maze:
        # loop tracker var for iterating through maze locations
        x=0 # resetting x to 0 in every column iteration
        
        # check every horizontal coordinate in current collumn, and break when exit is found
        for horizontal in vertical:
            if horizontal.exit == True:
                exit_x = x
                exit_y = y
                break
            x +=1
        
        # if we still haven't found the exit then continue normally. Otherwise break out of loop
        if exit_x == 0 and exit_y == 0: 
            y += 1
        else:
            break

    
    figured_out_path_list = find_path(exit_x, exit_y, path_record_list, maze)
    # reverse path list in order to have it from starting point to exit
    figured_out_path_list.reverse()
    
    # form a string to output the final answer
    direction_instructions = ''
    for i in range(1, len(figured_out_path_list)):
        x_diff = figured_out_path_list[i].x - figured_out_path_list[i-1].x
        y_diff = figured_out_path_list[i].y - figured_out_path_list[i-1].y
        
        if direction_instructions != '':
            direction_instructions += '->'
        
        if x_diff != 0:
            if x_diff < 0:
                direction_instructions += 'west'
            else:
                direction_instructions += 'east'
        if y_diff != 0:
            if y_diff < 0:
                direction_instructions += 'north'
            else:
                direction_instructions += 'south'
    
    print(direction_instructions)

if __name__ == "__main__":
    """
    maze = [
        [
            Position(east=True,south=True),
            Position(west=True,east=True),
            Position(west=True,east=True),
            Position(west=True,south=True)
        ],
        [
            Position(north=True,east=True,south=True),
            Position(west=True),
            Position(south=True),
            Position(north=True,south=True)
        ],
        [
            Position(north=True,east=True),
            Position(west=True,east=True),
            Position(west=True,north=True),
            Position(north=True,exit=True)
        ]
    ]
    #"""
    """
    maze = [
        [
            Position(south=True),
            Position(south=True,east=True),
            Position(west=True,east=True),
            Position(west=True,south=True)
        ],
        [
            Position(north=True,east=True,south=True),
            Position(west=True,north=True,south=True),
            Position(south=True,east=True,exit=True),
            Position(north=True,west=True)
        ],
        [
            Position(north=True),
            Position(north=True),
            Position(east=True,north=True),
            Position(west=True)
        ]
    ]
    #"""
    #"""
    maze = [
        [
            Position(south=True),
            Position(south=True,east=True),
            Position(west=True,east=True),
            Position(west=True,south=True)
        ],
        [
            Position(north=True,east=True,south=True),
            Position(west=True,north=True,south=True),
            Position(south=True,east=True,exit=True),
            Position(north=True,west=True)
        ],
        [
            Position(north=True),
            Position(north=True,east=True),
            Position(east=True,north=True,west=True),
            Position(west=True)
        ]
    ]
    #"""
    escape_route(maze)
