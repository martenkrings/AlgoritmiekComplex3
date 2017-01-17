import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    //Color of the node
    private Color color;
    //Edge of the Node(Index, edgeColor)
    private HashMap<Integer, Color> edges;

    //Enum for colors
    public enum Color {
        BLACK, GREEN, ORANGE, PINK, FINISH
    }

    /**
     * Constructor for Node
     * @param color color of the Node
     */
    public Node(Color color) {
        this.color = color;
        this.edges = new HashMap<>();
    }

    /**
     * Ads an edge to the Node
     * @param nodeIndex index of where to the edge connects
     * @param edgeColor color of the edge
     */
    public void addEdge(int nodeIndex, Color edgeColor){
        edges.put(nodeIndex, edgeColor);
    }

    //Getter for color
    public Color getColor() {
        return color;
    }

    /**
     * Gets the indexes edges with the given color
     * @param c the edge color
     * @return list of edge indexes
     */
    public int[] getEdgesIndexes(Color c) {
        ArrayList<Integer> edgesIndexes = new ArrayList<>();

        for (Integer n: edges.keySet()) {
            if (edges.get(n) == c) {
                edgesIndexes.add(n);
            }
        }

        //if nothing is found return null
        if (edgesIndexes.size() < 1){
            return new int[]{};
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
}