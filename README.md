# Critter Simulation Project
This repository contains my implementation for a graphical simulation of a 2D world of animals and creatures, called "critters." The project focuses on defining the behavior of individual critters within the simulation using object-oriented design principles.

## Project Overview
### Objectives
- Writing classes to define critters with specified behavior.
- Utilizing fields to store state necessary for a class's operation.
- Implementing good object-oriented design, including abstraction and encapsulation.
-Applying inheritance and choosing an appropriate base class for each new critter class.

### Critter Classes
I have implemented four critter classes as part of this project:

#### 1. Bear
- Constructor: public Bear(boolean polar)
- getColor: Color.WHITE for a polar bear, Color.BLACK otherwise.
- toString: Alternates between "/" and "" on each move.
- getMove: Infect if an enemy is in front; otherwise hop if empty in front; otherwise turn left.

#### 2. Lion 
- Constructor: public Lion()
- getColor: Randomly picks one of Color.RED, Color.GREEN, or Color.BLUE for three moves, then repeats.
- toString: "L"
- getMove: Infect if an enemy is in front; otherwise, turn left if a wall is in front or to the right; turn right if a fellow Lion is in front; otherwise hop.


#### 3.Giant
- Constructor: public Giant()
- getColor: Color.GRAY
- toString: Alternates between "fee," "fie," "foe," and "fum" for 6 moves each, then repeats.
-  getMove: Infect if an enemy is in front; otherwise hop if empty in front; otherwise turn right.

#### 4. Husky
- Constructor: public Husky()
- getColor: Your choice
- toString: Your choice
- getMove: Your choice

### Acknowledgments

This project is part of a Computer Science and Engineering course, and the assignment prompt and specifications are provided by the course instructor.

### Running Code
Down below represents the code running in the early stages:
![Critter](/img/Screenshot%202024-02-11%20160537.png)