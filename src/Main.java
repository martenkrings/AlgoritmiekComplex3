public class Main {
    public static void main(String[] args) {
        new Main().run(args);
    }
    
    private void run(String[] args) {
        Pathfinder pathfinder = new Pathfinder(makeAssignmentDataGraph());
    }

    /**
     * Method to generate test data according to the assignment
     */
    private Graph makeAssignmentDataGraph(){
        Node[] nodes = new Node[23];

        //Make all nodes
        nodes[1] = new Node(Node.nodeColor.PINK);
        nodes[2] = new Node(Node.nodeColor.BLACK);
        nodes[3] = new Node(Node.nodeColor.GREEN);
        nodes[4] = new Node(Node.nodeColor.GREEN);
        nodes[5] = new Node(Node.nodeColor.GREEN);
        nodes[6] = new Node(Node.nodeColor.ORANGE);
        nodes[7] = new Node(Node.nodeColor.ORANGE);
        nodes[8] = new Node(Node.nodeColor.PINK);
        nodes[9] = new Node(Node.nodeColor.PINK);
        nodes[10] = new Node(Node.nodeColor.BLACK);
        nodes[11] = new Node(Node.nodeColor.ORANGE);
        nodes[12] = new Node(Node.nodeColor.PINK);
        nodes[13] = new Node(Node.nodeColor.ORANGE);
        nodes[14] = new Node(Node.nodeColor.GREEN);
        nodes[15] = new Node(Node.nodeColor.ORANGE);
        nodes[16] = new Node(Node.nodeColor.GREEN);
        nodes[17] = new Node(Node.nodeColor.GREEN);
        nodes[18] = new Node(Node.nodeColor.BLACK);
        nodes[19] = new Node(Node.nodeColor.ORANGE);
        nodes[20] = new Node(Node.nodeColor.GREEN);
        nodes[21] = new Node(Node.nodeColor.BLACK);
        nodes[22] = new Node(Node.nodeColor.BLACK);
        nodes[0] = new Node(Node.nodeColor.FINISH);


        //add edges
        nodes[1].addEdge(4, Node.nodeColor.PINK);
        nodes[1].addEdge(5, Node.nodeColor.BLACK);
        nodes[2].addEdge(6, Node.nodeColor.GREEN);
        nodes[2].addEdge(12, Node.nodeColor.PINK);
        nodes[3].addEdge(1, Node.nodeColor.ORANGE);
        nodes[3].addEdge(4, Node.nodeColor.ORANGE);
        nodes[4].addEdge(13, Node.nodeColor.BLACK);
        nodes[5].addEdge(9, Node.nodeColor.ORANGE);
        nodes[6].addEdge(9, Node.nodeColor.GREEN);
        nodes[6].addEdge(10, Node.nodeColor.PINK);
        nodes[7].addEdge(2, Node.nodeColor.GREEN);
        nodes[8].addEdge(3, Node.nodeColor.PINK);
        nodes[9].addEdge(4, Node.nodeColor.GREEN);
        nodes[9].addEdge(14, Node.nodeColor.BLACK);
        nodes[10].addEdge(15, Node.nodeColor.GREEN);
        nodes[11].addEdge(10, Node.nodeColor.PINK);
        nodes[11].addEdge(12, Node.nodeColor.GREEN);
        nodes[12].addEdge(7, Node.nodeColor.GREEN);
        nodes[13].addEdge(8, Node.nodeColor.GREEN);
        nodes[13].addEdge(18, Node.nodeColor.GREEN);
        nodes[14].addEdge(20, Node.nodeColor.ORANGE);
        nodes[14].addEdge(0, Node.nodeColor.GREEN);
        nodes[15].addEdge(22, Node.nodeColor.GREEN);
        nodes[15].addEdge(0, Node.nodeColor.PINK);
        nodes[16].addEdge(15, Node.nodeColor.GREEN);
        nodes[17].addEdge(11, Node.nodeColor.BLACK);
        nodes[17].addEdge(12, Node.nodeColor.PINK);
        nodes[17].addEdge(16, Node.nodeColor.BLACK);
        nodes[18].addEdge(9, Node.nodeColor.ORANGE);
        nodes[18].addEdge(20, Node.nodeColor.ORANGE);
        nodes[19].addEdge(18, Node.nodeColor.GREEN);
        nodes[20].addEdge(19, Node.nodeColor.BLACK);
        nodes[20].addEdge(21, Node.nodeColor.ORANGE);
        nodes[21].addEdge(22, Node.nodeColor.ORANGE);
        nodes[21].addEdge(0, Node.nodeColor.BLACK);
        nodes[22].addEdge(17, Node.nodeColor.ORANGE);

        return new Graph(nodes, 1, 2);
    }
}
