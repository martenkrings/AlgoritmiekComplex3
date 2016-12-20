import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        new Main().run(args);
    }
    
    private void run(String[] args) {

    }

    /**
     * Method to generate test data according to the assignment
     */
    private Node[] makeAssignmentData(){
        Node[] nodes = new Node[23];

        //Make all nodes
        nodes[0] = new Node(Node.nodeColor.PINK);
        nodes[1] = new Node(Node.nodeColor.BLACK);
        nodes[2] = new Node(Node.nodeColor.GREEN);
        nodes[3] = new Node(Node.nodeColor.GREEN);
        nodes[4] = new Node(Node.nodeColor.GREEN);
        nodes[5] = new Node(Node.nodeColor.ORANGE);
        nodes[6] = new Node(Node.nodeColor.ORANGE);
        nodes[7] = new Node(Node.nodeColor.PINK);
        nodes[8] = new Node(Node.nodeColor.PINK);
        nodes[9] = new Node(Node.nodeColor.BLACK);
        nodes[10] = new Node(Node.nodeColor.ORANGE);
        nodes[11] = new Node(Node.nodeColor.PINK);
        nodes[12] = new Node(Node.nodeColor.ORANGE);
        nodes[13] = new Node(Node.nodeColor.GREEN);
        nodes[14] = new Node(Node.nodeColor.ORANGE);
        nodes[15] = new Node(Node.nodeColor.GREEN);
        nodes[16] = new Node(Node.nodeColor.GREEN);
        nodes[17] = new Node(Node.nodeColor.BLACK);
        nodes[18] = new Node(Node.nodeColor.ORANGE);
        nodes[19] = new Node(Node.nodeColor.GREEN);
        nodes[20] = new Node(Node.nodeColor.BLACK);
        nodes[21] = new Node(Node.nodeColor.BLACK);
        nodes[22] = new Node(Node.nodeColor.FINISH);


        //add edges
        nodes[0].addEdge(nodes[3], Node.nodeColor.PINK);
        nodes[0].addEdge(nodes[4], Node.nodeColor.BLACK);
        nodes[1].addEdge(nodes[5], Node.nodeColor.GREEN);
        nodes[1].addEdge(nodes[11], Node.nodeColor.PINK);
        nodes[2].addEdge(nodes[0], Node.nodeColor.ORANGE);
        nodes[2].addEdge(nodes[3], Node.nodeColor.ORANGE);
        nodes[3].addEdge(nodes[12], Node.nodeColor.BLACK);
        nodes[4].addEdge(nodes[8], Node.nodeColor.ORANGE);
        nodes[5].addEdge(nodes[8], Node.nodeColor.GREEN);
        nodes[5].addEdge(nodes[9], Node.nodeColor.PINK);
        nodes[6].addEdge(nodes[1], Node.nodeColor.GREEN);
        nodes[7].addEdge(nodes[2], Node.nodeColor.PINK);
        nodes[8].addEdge(nodes[3], Node.nodeColor.GREEN);
        nodes[8].addEdge(nodes[13], Node.nodeColor.BLACK);
        nodes[9].addEdge(nodes[14], Node.nodeColor.GREEN);
        nodes[10].addEdge(nodes[9], Node.nodeColor.PINK);
        nodes[10].addEdge(nodes[11], Node.nodeColor.GREEN);
        nodes[11].addEdge(nodes[6], Node.nodeColor.GREEN);
        nodes[12].addEdge(nodes[7], Node.nodeColor.GREEN);
        nodes[12].addEdge(nodes[17], Node.nodeColor.GREEN);
        nodes[13].addEdge(nodes[19], Node.nodeColor.ORANGE);
        nodes[13].addEdge(nodes[22], Node.nodeColor.GREEN);
        nodes[14].addEdge(nodes[21], Node.nodeColor.GREEN);
        nodes[14].addEdge(nodes[22], Node.nodeColor.PINK);
        nodes[15].addEdge(nodes[14], Node.nodeColor.GREEN);
        nodes[16].addEdge(nodes[10], Node.nodeColor.BLACK);
        nodes[16].addEdge(nodes[11], Node.nodeColor.PINK);
        nodes[16].addEdge(nodes[15], Node.nodeColor.BLACK);
        nodes[17].addEdge(nodes[8], Node.nodeColor.ORANGE);
        nodes[17].addEdge(nodes[19], Node.nodeColor.ORANGE);
        nodes[18].addEdge(nodes[17], Node.nodeColor.GREEN);
        nodes[19].addEdge(nodes[18], Node.nodeColor.BLACK);
        nodes[19].addEdge(nodes[20], Node.nodeColor.ORANGE);
        nodes[20].addEdge(nodes[21], Node.nodeColor.ORANGE);
        nodes[20].addEdge(nodes[22], Node.nodeColor.BLACK);
        nodes[21].addEdge(nodes[16], Node.nodeColor.ORANGE);


        //return the list
        return nodes;
    }
}
