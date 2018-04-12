public class MazeSolver {

    public Maze maze;

    // public static void main(String[] commandLine)
    // 	throws java.io.FileNotFoundException{

    // 	Maze maze = new Maze( commandLine[0]
    // 			      , Integer.parseInt( commandLine[1])
    // 			      , Integer.parseInt( commandLine[2])
    // 			      );
    // }

    public boolean ifSolvable(){
	// Snapshot
	// Not sure when we use snapshot, so i'll place it here for now
	Maze snapshot = new Maze(maze);

	// Base Case
	if (maze.explorerIsOnA()== 0){
	    return true;
	}
	else if (maze.explorerIsOnA() != 2){
	    return false;
	}
	else{
	    maze.dropA(1);

	    maze.go(Maze.SOUTH);
	    if (maze.explorerIsOnA() == 2){
		ifSolvable();
	    }
	    maze.go(Maze.NORTH);

	    maze.go(Maze.NORTH);
	    if (maze.explorerIsOnA() == 2){
		ifSolvable();
	    }
	    maze.go(Maze.SOUTH);

	    maze.go(Maze.WEST);
	    if (maze.explorerIsOnA() == 2){
		ifSolvable();
	    }
	    maze.go(Maze.EAST);

	    maze.go(Maze.EAST);
	    if (maze.explorerIsOnA() == 2){
		ifSolvable();
	    }
	    maze.go(Maze.WEST);



	}
	return false;
    }

    public mazeSolver( String mazeToSolve, int rank, int file)
	throws java.io.FileNotFoundException{
	Maze copy = new Maze( mazeToSolve, rank, file);
	// The Recursive Abstraction will be added in the forseeable future

    }

    public static void main(String[] args){
    }



}
