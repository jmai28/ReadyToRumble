public class MazeSolver {

    public static Maze maze;

    private static boolean ifSolvable(){

	// Base Case
	//	System.out.println("Runs Recursive Abstraction");

	if (maze.explorerIsOnA()== Maze.TREASURE){
	    // System.out.println("Running 1st Case");
	    return true;
	}
	else if (maze.explorerIsOnA() != Maze.STEPPING_STONE){
	    //  System.out.println("Running 2nd Case");
	    return false;
	}
	  else{
	      //System.out.println("runs last resort");

	      maze.dropA(1);

	      Maze snapshot = new Maze(maze);
	      // System.out.println(maze == snapshot);


	      maze.go(Maze.SOUTH);
	      
		  // System.out.println("Running Recursive Abstraction South");
		  if(ifSolvable()){
		      return true;
		  }

	      maze = new Maze(snapshot);

	      maze.go(Maze.EAST);

		  // System.out.println("Running Recursive Abstraction East");
		  if(ifSolvable()){
		      return true;
		  }

	      maze = new Maze(snapshot);

	      maze.go(Maze.NORTH);

		  // System.out.println("Running Recursive Abstraction North");
		  if(ifSolvable()){
		      return true;
		  }

	      maze = new Maze(snapshot);

	      maze.go(Maze.WEST);

		  // System.out.println("Running Recursive Abstraction West");
		  if(ifSolvable()){
		      return true;
		  }

	      maze = new Maze(snapshot);




	  }
	//	System.out.println("Base Cases didn't snag, so return false");
	return false;
    }

    public static boolean mazeSolver( String mazeToSolve, int rank, int file)
	throws java.io.FileNotFoundException{
	maze = new Maze( mazeToSolve, rank, file);
	// The Recursive Abstraction will be added in the forseeable future
	return ifSolvable();
    }

    public static void main(String[] args){
    }



}
