/**
 * Aum Desai
 * 
 * CS231
 * 
 * Project 7
 * 
 * April 23rd
 * 
 *MazeBreadthFirstSearch.java
 * 
 * Creates an implementation of search a maze
 */
public class MazeBreadthFirstSearch extends AbstractMazeSearch {

    private Queue<Cell> queue;
    private int cellsExplored;

    public MazeBreadthFirstSearch(Maze maze) {
        super(maze);
        this.queue = new LinkedList<>();
    }

    /**
     * Add cell to the queue
     */
    public void addCell(Cell next) {
        queue.offer(next);
    }

    /**
     * Find next cell to explore
     */
    public Cell findNextCell() {
        return queue.poll();
    }

    /**
     * Get the remaining number of cells to explore
     */
    public int numRemainingCells() {
        return queue.size();
    }

    public int getCellsExplored() {
        return this.cellsExplored;
    }

}