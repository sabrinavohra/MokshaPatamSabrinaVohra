import java.util.LinkedList;
import java.util.Queue;

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
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // Creates queue and adds first value to it
        Queue<Integer> toExplore = new LinkedList<>();
        toExplore.add(1);
        int currentNode;
        int rolls = 0;
        // Creates array to keep track of the number of rolls
        int[] numRolls = new int[boardsize + 1];
        // Creates maps to hold values of ladders and snakes
        int[] laddersMap = new int[boardsize + 1];
        for (int[] ladder : ladders) {
            int start = ladder[0];
            int end = ladder[1];
            laddersMap[start] = end;
        }
        int[] snakesMap = new int[boardsize + 1];
        for (int[] snake : snakes) {
            int start = snake[0];
            int end = snake[1];
            snakesMap[start] = end;
        }
        // Moves through while loop until queue is empty
        while (!toExplore.isEmpty()) {
            currentNode = toExplore.remove();
            // Returns number of rolls if the end of the board is reached
            if (currentNode >= boardsize) {
                return numRolls[currentNode];
            }
            // Moves through array to add values to queue
            for (int r = 1; r <= 6; r++) {
                // Makes sure end isn't reached
                if ((currentNode + r) <= boardsize) {
                    int node = currentNode + r;
                    // Checks to see if node is the beginning of a ladder or a snake
                    if (laddersMap[node] > 0) {
                        node = laddersMap[node];
                    } else if (snakesMap[node] > 0) {
                        node = snakesMap[node];
                    }
                    if (numRolls[node] == 0) {
                        numRolls[node] = rolls;
                        toExplore.add(node);
                    }
                    if((node / 6) < rolls) {
                        rolls--;
                    }

                }
            }
            rolls++;
        }
        // Returns 0 if code fails
        return 0;
    }
}