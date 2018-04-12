[![forthebadge](https://forthebadge.com/images/badges/check-it-out.svg)](https://forthebadge.com)
# Maze Project [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/contains-cat-gifs.svg)](https://forthebadge.com)
## Personnel
* Lee,Yuenhigh
* Mai,Justin

## Problem Statement

What is the Boolean value of the statement “it is possible to get from the starting position to treasure”

## Recursive Abstraction 

When I am asked to  
find the Boolean value of the statement “it is possible to get from the starting position to treasure”  
the recurisve abstraction can  
find the Boolean value of the statement “it is possible to get from the starting position to treasure” in some direction after I have taken one step in some direction.

## Base Case

On further examination this base case does not sufficiently answer the problem statement. Though it is answered in the pseudocode, we forgot to include it in the base case section. Revision below.

If the starting position is the treasure, return true.
If the starting position returns is not Legal, return false.
If it is not, continue with the recursive abstraction.
If the recursive abstraction ends, then return false (a return false at the end of the code).


## English or pseudocode description of algorithm
```
if the starting position is the treasure // base case
  return true
else if the starting position is not legal // not a stepping stone
  return false
else // recursive case
  Drop a wall on current location of explorer // This is to prevent the program from looping forever
  // Program will walk back onto this spot, and will still work even with a wall. If all the junctions are
  // invalidated, it would completely seal off the paths, preventing the code from ever running through the path again.
  walk south
    if isLegal // Cannot be a wall (or a previous spot or not in the maze) (dropping a wall serves to solve this problem)
      invoke recurisve abstraction
    walk back
  walk west
    if isLegal 
      invoke recursive abstraction
    walk back
  walk north
    if isLegal
      invoke recursive abstraction 
    walk back
  walk east
    if is Legal
      invoke recursive abstraction 
    walk back
    
  return false // End    
```
## class(es), with fields and methods

* Classes
  * MazeSolver
  * UserOfMazeSolver
  * MazeMaker???
  * UserOfMazeMaker???
* Methods
  * IsLegal
  * PathFinder
  * SolveMaze
    * Will use PathFinder
      ```
      if PathFinder is true
        return solution
      else 
        tell the user that there is no possible path to the treasure
      ```
* Fields
  * int array
  * rank
  * file
  * arraylist???

## Version *N* wishlist
* One solution
* Fastest solution
* All solutions(assuming there is more than one)
* A method to catch out of the maze moves

## Known Bugs
