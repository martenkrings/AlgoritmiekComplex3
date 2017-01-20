import java.util.*;

/**
 * Pathfinder class
 * Finds a path(or not) throug a Graph using depth first search.
 * The first Node of the Graph must be the finnish
 */
public class Pathfinder {
    //the Graph
    private Graph graph;

    /**
     * Default constructor
     */
    public Pathfinder(){

    }

    /**
     * Method that tries to find a path trough a given board
     * @param graph the gameboard
     * @param p1Start the start position of player 1
     * @param p2Start the start position of player 2
     * @return The found path/solution, empty list if no solution found
     */
    public LinkedList<int[]> findPath (Graph graph, int p1Start, int p2Start){
        this.graph = graph;
        return dfs(new int[]{p1Start, p2Start}, new ArrayList<int[]>());
    }

    /**
     * Recursive dfs method
     * @param start the start position
     * @return the found solutin, empty list if no solutuin found
     */
    private LinkedList<int[]> dfs(int[] start, ArrayList<int[]> visited){
        LinkedList<int[]> solution;
        visited.add(start);

        //if I am on the goal return myself as solution
        if (graph.isGoal(start)){
            solution = new LinkedList<int[]>();
            solution.add(start);
            return solution;
        }

        //Get all the neighbors of the state
        List<int[]> neighbors = graph.getNeighbors(start);

        //for al your neighbors
        for (int[] neighbor:neighbors) {

            //if we have not visited this neighbor then visit it
            if (!contains(visited, neighbor)) {
                solution = dfs(neighbor, visited);
                //if we find a solution return it with ourself added to it
                if (graph.goalIsReached(solution)) {
                    solution.addFirst(start);
                    return solution;
                }
            }
        }

        //If no solution has been found than return an empty list
        return new LinkedList<int[]>();
    }

    /**
     * Handmade contains method
     * @param arrayList List of state
     * @param state state
     * @return true if state is already in list else false
     */
    private boolean contains(ArrayList<int[]> arrayList, int[] state){
        //for all elements in arraylist
        for (int[] i:arrayList){
            //if state is in the arraylist return true
            if (i[0] == state[0] && i[1] == state[1] || i[0] == state[1] && i[1] == state[0]){
                return true;
            }
        }

        //else return false
        return false;
    }
}
