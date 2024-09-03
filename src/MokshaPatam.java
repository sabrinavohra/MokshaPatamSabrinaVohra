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
        int board[][] = new int[boardsize/10][10];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                // Iterate through board and add ladders and snakes where applicable
            }
        }
        // Iterate through board and take as many ladders as possible without reaching snakes
        int i = 0;
        int j = 0;
        while(board[i][j] <= board[boardsize/10][10]) {
            i++;
            j++;
        }
        return -1;
    }
}

// Ideas
    // Start from the end like Maze Solver and find the quickest route back to the beginning
        // Keep track of how much each roll is depending on where the snakes and ladders are - don't necessarily roll 6 every time
    // Work from the beginning and move through trying every outcome using recursion and printing the lowest one
    // Document which ladder is the longest to make sure to take it