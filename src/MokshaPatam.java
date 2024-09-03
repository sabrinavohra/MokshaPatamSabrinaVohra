/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Sabrina Vohra
 *
 */

public class MokshaPatam {
    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    // How do we know how long / wide the board is if we only have the size?
    // What does "the first of the two integers leads to the next" mean?
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // Creates board
        int board[][] = new int[boardsize/10][10] ;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++ ) {
                // Iterate through board and add ladders and snakes where applicable
            }
        }
        // Iterates through board
        int i = 0;
        int j = 0;
        while(board[i][j] <= board[boardsize/10][10]) {
            i++;
            j++;
        }
        // If no solution:
        return -1;
        // Make limit for if the roll rolls past the final square (ex. cannot roll 6 on square 95)
    }
}

// Ideas:
    // Start from the end like Maze Solver and find the quickest route back to the beginning
        // Decide whether to take each square and follow each route cancelling out the higher numbers until a conclusion
// is reached

    // Work from the beginning and move through trying every outcome using recursion and printing the lowest one
    // Document which ladder is the longest and make sure to take it