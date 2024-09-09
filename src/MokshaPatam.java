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
    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        Queue<Integer> toExplore = new LinkedList<>();
        toExplore.add(1);
        int currentNode;
        int rolls = 0;
        int[] numRolls = new int[boardsize + 1];
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
        while (!toExplore.isEmpty()) {
            currentNode = toExplore.remove();
            if (currentNode >= boardsize) {
                return numRolls[currentNode];
            }
            for (int r = 1; r <= 6; r++) {
                if((currentNode + r) <= boardsize) {
                    int node = currentNode + r;
                    if (laddersMap[node] > 0) {
                        node = laddersMap[node];
                    }
                    else if (snakesMap[node] > 0) {
                        node = snakesMap[node];
                    }
                    if (numRolls[node] == 0) {
                        numRolls[node] = rolls;
                        toExplore.add(node);
                    }
//                    if (rolls > (node / 6)) {
//                        rolls--;
//                    }
                }
            }
            rolls++;
        }
        return 0;
    }
}
