import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sander on 10-1-2017.
 */
public class Pathfinder {
    private Graph graph;
    private ArrayList<int[]> statesVisited;



    /**
     * Default constructor
     * @param graph the playing board

     */
    public Pathfinder(Graph graph){
        this.graph = graph;
        statesVisited = new ArrayList<>();
    }

    public LinkedList<int[]> findPath (){

    }

    private LinkedList<int[]> dfs(int[] start){
        LinkedList<int[]> solution;
        if (graph.isGoalReached()){
            solution = new LinkedList<int[]>();
            solution.add(start);
            return solution;
        }
        List<int[]> neighbors = graph.getNeighbors(start);
        for (int[] neighbor:neighbors) {
            solution = dfs(neighbor);
            if (graph.goalIsReached(solution)){
                solution.add(0, start);
                return solution;
            }
        }


        return new LinkedList<int[]>(); //Geen oplossing
    }
}
