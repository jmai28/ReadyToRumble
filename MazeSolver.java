public class MazeSolver {

    public static Maze maze;

    // public static void main(String[] commandLine)
    // 	throws java.io.FileNotFoundException{

    // 	Maze maze = new Maze( commandLine[0]
    // 			      , Integer.parseInt( commandLine[1])
    // 			      , Integer.parseInt( commandLine[2])
    // 			      );
    // }

    private static boolean ifSolvable(){

	// Base Case
	//	System.out.println("Runs Recursive Abstraction");
	
	if (maze.explorerIsOnA()== Maze.TREASURE){
	    System.out.println("Running 1st Case");
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
	      if (maze.explorerIsOnA() == Maze.STEPPING_STONE || maze.explorerIsOnA() == Maze.TREASURE){
		  System.out.println("Running Recursive Abstraction South");
		  ifSolvable();
	      }
	      maze = new Maze(snapshot);

	      maze.go(Maze.EAST);
	      if (maze.explorerIsOnA() == Maze.STEPPING_STONE || maze.explorerIsOnA() == Maze.TREASURE){
		  System.out.println("Running Recursive Abstraction East");
		  ifSolvable();
	      }
	      maze = new Maze(snapshot);

	      maze.go(Maze.NORTH);
	      if (maze.explorerIsOnA() == Maze.STEPPING_STONE || maze.explorerIsOnA() == Maze.TREASURE){
		  System.out.println("Running Recursive Abstraction North");
		  ifSolvable();
	      }
	      maze = new Maze(snapshot);

	      maze.go(Maze.WEST);
	      if (maze.explorerIsOnA() == Maze.STEPPING_STONE || maze.explorerIsOnA() == Maze.TREASURE){
		  System.out.println("Running Recursive Abstraction West");
		  ifSolvable();
	      }
	      maze = new Maze(snapshot);




	  }
	System.out.println("Base Cases didn't snag, so return false");
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
