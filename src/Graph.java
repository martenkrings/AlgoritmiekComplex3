import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Graph {
    private Node[] nodes;
    //player 1 index 0, player 2 index 1
    private int[] state = new int[2];

    /**
     *
     * @param nodes the nodes of the board (Position 0 should be the finish node)
     * @param p1Start player 1 start location
     * @param p2Start player 2 start location
     */
    public Graph(Node[] nodes, int p1Start, int p2Start) {
        //TODO check if node[0] is the only node with finish
        this.nodes = nodes;

        //TODO check for valid player positions
        this.state[0] = p1Start;
        this.state[1] = p2Start;
    }

    public boolean isGoalReached() {
        if (state[0] == 0 || state[1] == 1) {
            return true;
        }
        return false;
    }

    /**
     * Returns all neighbors that are accessible from the given state
     * @param state the state
     * @return neighbors that can be reached from current state
     */
    public List<int []> getNeighbors(int[] state){
        ArrayList<int[]> neighbors = new ArrayList<>();

        //find all neighbors that can be navigated to
        neighbors.add(nodes[state[0]].getEdgesIndexes(nodes[state[1]].getColor()));
        neighbors.add(nodes[state[1]].getEdgesIndexes(nodes[state[0]].getColor()));

        return neighbors;
    }
}