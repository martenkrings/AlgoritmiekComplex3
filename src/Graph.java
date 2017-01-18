import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Graph class that simulates a playing board
 */
public class Graph {
    //Finish is ALWAYS position 0
    private static final int FINISH = 0;
    private Node[] nodes;

    /**
     * @param nodes   the nodes of the board (Position 0 should be the finish node)
     */
    public Graph(Node[] nodes) {
        //TODO check if node[0] is the only node with finish
        this.nodes = nodes;
    }

    /**
     * Method that returns if the goal has been reached
     * @param pathSoFar LinkedList of steps(states) to take for a solution
     * @return true if yes, false if no
     */
    public boolean goalIsReached(LinkedList<int[]> pathSoFar) {
        if (pathSoFar.size() == 0){
            return false;
        }

        return isGoal(pathSoFar.getLast());
    }

    /**
     * Returns if a state is on the goal
     * @param state the state to check
     * @return true if on goal, else false
     */
    public boolean isGoal(int[] state){
        return state[0] == FINISH || state[1] == FINISH;
    }

    /**
     * Returns all neighbors that are accessible from the given state
     * @param state the state
     * @return neighbors that can be reached from current state
     */
    public List<int[]> getNeighbors(int[] state) {
        ArrayList<int[]> neighbors = new ArrayList<>();

        //find all neighbors that can be navigated to
        int[] neighborsP1 = nodes[state[0]].getEdgesIndexes(nodes[state[1]].getColor());
        int[] neighborsP2 = nodes[state[1]].getEdgesIndexes(nodes[state[0]].getColor());

        //make the found neighbors into states
        for (int n:neighborsP1){
            neighbors.add(new int[]{n, state[1]});
        }
        for (int m:neighborsP2){
            neighbors.add(new int[]{state[0], m});
        }

        return neighbors;
    }
}