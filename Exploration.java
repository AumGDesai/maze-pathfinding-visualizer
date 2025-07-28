/**
 * Aum Desai
 * 
 * CS231
 * 
 * Project 7
 * 
 * April 23rd
 * 
 *Exploration.java
 * 
 * Creates an implementation of search a maze
 */

import java.util.Random;

public class Exploration {
    public static void main(String args[]) throws InterruptedException {
        // Random random = new Random();
        // int count = 0;
        // int count2 = 0;
        // int count3 = 0;

        // for (int i = 0; i < 50; i++) {
        //     Maze maze = new Maze(20, 20, 0.7);
        //     MazeBreadthFirstSearch mazeSearch = new MazeBreadthFirstSearch(maze);
        //     Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));

        //     while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //         cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     }
        //     LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //     if (solver != null) {
        //         count++;
        //     }
        // }

        // for (int i = 0; i < 50; i++) {
        //     Maze maze = new Maze(20, 20, 0.7);
        //     MazeDepthFirstSearch mazeSearch = new MazeDepthFirstSearch(maze);
        //     Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));

        //     while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //         cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     }
        //     LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //     if (solver != null) {
        //         count2++;
        //     }
        // }

        // for (int i = 0; i < 50; i++) {
        //     Maze maze = new Maze(20, 20, 0.7);
        //     MazeAStarSearch mazeSearch = new MazeAStarSearch(maze);
        //     Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));

        //     while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //         cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //     }
        //     LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //     if (solver != null) {
        //         count3++;
        //     }
        //     System.out.println(count);
        // }

        // System.out.println("Probablity of solving the maze using BFS: " + (double) count / 50);
        // System.out.println("Probablity of solving the maze using DFS: " + (double) count2 / 50);
        // System.out.println("Probablity of solving the maze using A*: " + (double) count3 / 50);

        // Random random = new Random();

        // for (int j = 0; j < 5; j++){
        //     int count = 0;
        //     int count2 = 0;
        //     int count3 = 0;
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeBreadthFirstSearch mazeSearch = new MazeBreadthFirstSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count+= solver.size();
        //         }
        //     }
    
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeDepthFirstSearch mazeSearch = new MazeDepthFirstSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count2+= solver.size();
        //         }
        
        //     }
    
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeAStarSearch mazeSearch = new MazeAStarSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count3 += solver.size();
        //         }
        //     }
    
        //     System.out.println("Average length of path found by BFS for density " + j * 0.1 + ": " + (double) count / 1000);
        //     System.out.println("Average length of path found by DFS for density " + j * 0.1 + ": " + (double) count2 / 1000);
        //     System.out.println("Average length of path found by A*for density " + j * 0.1 + ": "+  (double) count3 / 1000);
        // }

        // Random random = new Random();

        // for (int j = 0; j < 5; j++){
        //     int count = 0;
        //     int count2 = 0;
        //     int count3 = 0;
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeBreadthFirstSearch mazeSearch = new MazeBreadthFirstSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count+= mazeSearch.getCellsExplored();
        //         }
        //     }
    
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeDepthFirstSearch mazeSearch = new MazeDepthFirstSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count2+= mazeSearch.getCellsExplored();
        //         }
        
        //     }
    
        //     for (int i = 0; i < 1000; i++) {
        //         Maze maze = new Maze(20, 20, j * 0.1);
        //         MazeAStarSearch mazeSearch = new MazeAStarSearch(maze);
        //         Cell cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         Cell cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
    
        //         while (cell1.getType() == CellType.OBSTACLE || cell2.getType() == CellType.OBSTACLE) {
        //             cell1 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //             cell2 = maze.get(random.nextInt(maze.getRows()), random.nextInt(maze.getCols()));
        //         }
        //         LinkedList<Cell> solver = mazeSearch.search(cell1, cell2, false, 0);
        //         if (solver != null) {
        //             count3 += mazeSearch.getCellsExplored();
        //         }
        //     }
    
        //     System.out.println("Average number of Cells explored by BFS for density " + j * 0.1 + ": " + (double) count / 1000);
        //     System.out.println("Average number of Cells explored by DFS for density " + j * 0.1 + ": " + (double) count2 / 1000);
        //     System.out.println("Average number of Cells explored by A* for density " + j * 0.1 + ": "+  (double) count3 / 1000);
        // }
        Maze maze = new Maze(40, 40, 0.3);

        Cell start;
        Cell target;


        Random rand = new Random();
        int randRowStart = rand.nextInt(0,40);
        int randColStart = rand.nextInt(0,40);

        while (maze.landscape[randRowStart][randColStart].getType() != CellType.FREE){
            randRowStart = rand.nextInt(0,40);
            randColStart = rand.nextInt(0,40);
        }

        int randRowTarget = rand.nextInt(0,40);
        int randColTarget = rand.nextInt(0,40);

        while (maze.landscape[randRowTarget][randColTarget].getType() != CellType.FREE){
            randRowTarget = rand.nextInt(0,40);
            randColTarget = rand.nextInt(0,40);
        }

        start = new Cell(randRowStart, randColStart, CellType.FREE);
        target = new Cell(randRowTarget, randColTarget, CellType.FREE);


        MazeDepthFirstSearch DFSmaze = new MazeDepthFirstSearch(maze);
        MazeBreadthFirstSearch BFSmaze = new MazeBreadthFirstSearch(maze);
        MazeAStarSearch AStarMaze = new MazeAStarSearch(maze);


        AStarMaze.search(start,target, true, 50);

        
    }
    
}