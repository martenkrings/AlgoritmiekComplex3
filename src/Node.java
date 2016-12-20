import java.util.HashMap;
import java.util.HashSet;

public class Node {
    private nodeColor color;
    private HashMap<Node, nodeColor> edges;

    public enum nodeColor {
        BLACK, GREEN, ORANGE, PINK, FINISH
    }

    public nodeColor getColor() {
        return color;
    }

    public HashSet<Node> getEdges(nodeColor c) {
        HashSet<Node> nodes = new HashSet<>();

        for (Node n: edges.keySet()) {
            if (edges.get(n) == c) {
                nodes.add(n);
            }
        }

        return nodes;
    }

    public Node(nodeColor color) {
        this.color = color;
    }

    public void addEdge(Node node, nodeColor nodeColor){
        edges.put(node, nodeColor);
    }
}