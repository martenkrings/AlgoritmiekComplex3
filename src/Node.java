import java.util.HashMap;
import java.util.HashSet;

public class Node {
    private nodeColor color;
    private HashMap<Node, nodeColor> edges;

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

    private enum nodeColor {
        BLACK, GREEN, ORANGE, PINK, FINISH
    }
}