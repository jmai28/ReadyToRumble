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

The situation that would require the least amount of work is if the starting position is the treasure.

## English or pseudocode description of algorithm
```
if no possible path to take // maybe put this in maze solver
  return false;
if the starting position is the treasure // base case
  record the solution
else // recursive case
  walk south
    if isLegal // Cannot be a wall or a previous spot or not in the maze
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
    
  return // End
     
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
    * IfPossible
* Fields
  * int array
  * rank
  * file
  * arraylist???

## Version *N* wishlist
* One solution
* Fastest solution
* All solutions(assuming there is more than one)
