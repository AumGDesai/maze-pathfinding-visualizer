/**
 * Aum Desai
 * 
 * CS231
 * 
 * Project 7
 * 
 * April 23rd
 * 
 *MazeDepthFirstSearch.java
 * 
 * Creates an implementation of search a maze
 */

public class MazeDepthFirstSearch extends AbstractMazeSearch {

    private Stack<Cell> stack;
    private int cellsExplored;

    public MazeDepthFirstSearch(Maze maze) {
        super(maze);
        this.stack = new LinkedList<>();
    }

    /**
     * Add cell to the stack
     */
    public void addCell(Cell next) {
        stack.push(next);
    }

    /**
     * Find Next Cell to explore
     */
    public Cell findNextCell() {
        return stack.pop();
    }

    /**
     * Get the total number of remaining cells
     */
    public int numRemainingCells() {
        return stack.size();
    }

    public int getCellsExplored() {
        return this.cellsExplored;
    }

}