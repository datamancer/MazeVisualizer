MazeVisualizer
==============

maze visualizer for micromouse competition. Reads from a filestream opened by Arduino, updating a visual representation of the maze

Simulator.java creates a simulation file that reads in an input maze, and reads a constant stream in from the Arduino 
in order to show the user what the robot is doing in that part of the algorithm.

Tile.java is for display purposes, as is Sprite.java. Both are deprecated since a gridlayout and jlabels/icons are just fine for
display purposes so far. That and I don't feel like implementing a canvas system or playing around with making a new one.
