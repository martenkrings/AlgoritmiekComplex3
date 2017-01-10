import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Node {
    private nodeColor color;
    private HashMap<Integer, nodeColor> edges;

    public enum nodeColor {
        BLACK, GREEN, ORANGE, PINK, FINISH
    }

    public nodeColor getColor() {
        return color;
    }

    /**
     * Gets the indexes edges with the given color
     * @param c the edge color
     * @return list of edge indexes
     */
    public int[] getEdgesIndexes(nodeColor c) {
        ArrayList<Integer> edgesIndexes = new ArrayList<>();

        for (Integer n: edges.keySet()) {
            if (edges.get(n) == c) {
                edgesIndexes.add(n);
            }
        }

        //if nothing is found return null
        if (edgesIndexes.size() < 1){
            return null;
        }

        //convert the arraylist to array
        int[] smallIntArray = new int[edgesIndexes.size()];

        int i = 0;
        for (Integer integer: edgesIndexes){
            smallIntArray[i] = integer;
            i++;
        }
        return smallIntArray;
    }

    public Node(nodeColor color) {
        this.color = color;
    }

    public void addEdge(int nodeIndex, nodeColor nodeColor){
        edges.put(nodeIndex, nodeColor);
    }
}