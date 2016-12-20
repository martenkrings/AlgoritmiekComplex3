import java.util.HashMap;

public class Node {
    private nodeColor color;
    private HashMap<nodeColor, Node> paths;

    private enum nodeColor {
        BLACK, GREEN, ORANGE, PINK
    }
}