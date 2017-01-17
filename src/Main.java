import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        new Main().run(args);
    }
    
    private void run(String[] args) {
        //make a new Pathfinder
        Pathfinder pathfinder = new Pathfinder();

        //print the found route
        printResult(pathfinder.findPath(makeAssignmentDataGraph(), 1, 2));
    }

    /**
     * Prints the data of a LinkedList
     * @param result list to print
     */
    private void printResult(LinkedList<int[]> result){
        int counter = 0;
        for (int[] i : result){
            System.out.print("Stap " + counter);
            System.out.println(Arrays.toString(i));
            counter++;
        }
    }

    /**
     * Method to generate test data according to the assignment
     */
    private Graph makeAssignmentDataGraph(){
        Node[] nodes = new Node[23];

        //Make all nodes
        nodes[1] = new Node(Node.Color.PINK);
        nodes[2] = new Node(Node.Color.BLACK);
        nodes[3] = new Node(Node.Color.GREEN);
        nodes[4] = new Node(Node.Color.GREEN);
        nodes[5] = new Node(Node.Color.GREEN);
        nodes[6] = new Node(Node.Color.ORANGE);
        nodes[7] = new Node(Node.Color.ORANGE);
        nodes[8] = new Node(Node.Color.PINK);
        nodes[9] = new Node(Node.Color.PINK);
        nodes[10] = new Node(Node.Color.BLACK);
        nodes[11] = new Node(Node.Color.ORANGE);
        nodes[12] = new Node(Node.Color.PINK);
        nodes[13] = new Node(Node.Color.ORANGE);
        nodes[14] = new Node(Node.Color.GREEN);
        nodes[15] = new Node(Node.Color.ORANGE);
        nodes[16] = new Node(Node.Color.GREEN);
        nodes[17] = new Node(Node.Color.GREEN);
        nodes[18] = new Node(Node.Color.BLACK);
        nodes[19] = new Node(Node.Color.ORANGE);
        nodes[20] = new Node(Node.Color.GREEN);
        nodes[21] = new Node(Node.Color.BLACK);
        nodes[22] = new Node(Node.Color.BLACK);
        nodes[0] = new Node(Node.Color.FINISH);


        //add edges
        nodes[1].addEdge(4, Node.Color.PINK);
        nodes[1].addEdge(5, Node.Color.BLACK);
        nodes[2].addEdge(6, Node.Color.GREEN);
        nodes[2].addEdge(12, Node.Color.PINK);
        nodes[3].addEdge(1, Node.Color.ORANGE);
        nodes[3].addEdge(4, Node.Color.ORANGE);
        nodes[4].addEdge(13, Node.Color.BLACK);
        nodes[5].addEdge(9, Node.Color.ORANGE);
        nodes[6].addEdge(9, Node.Color.GREEN);
        nodes[6].addEdge(10, Node.Color.PINK);
        nodes[7].addEdge(2, Node.Color.GREEN);
        nodes[8].addEdge(3, Node.Color.PINK);
        nodes[9].addEdge(4, Node.Color.GREEN);
        nodes[9].addEdge(14, Node.Color.BLACK);
        nodes[10].addEdge(15, Node.Color.GREEN);
        nodes[11].addEdge(10, Node.Color.PINK);
        nodes[11].addEdge(12, Node.Color.GREEN);
        nodes[12].addEdge(7, Node.Color.GREEN);
        nodes[13].addEdge(8, Node.Color.GREEN);
        nodes[13].addEdge(18, Node.Color.GREEN);
        nodes[14].addEdge(20, Node.Color.ORANGE);
        nodes[14].addEdge(0, Node.Color.GREEN);
        nodes[15].addEdge(22, Node.Color.GREEN);
        nodes[15].addEdge(0, Node.Color.PINK);
        nodes[16].addEdge(15, Node.Color.GREEN);
        nodes[17].addEdge(11, Node.Color.BLACK);
        nodes[17].addEdge(12, Node.Color.PINK);
        nodes[17].addEdge(16, Node.Color.BLACK);
        nodes[18].addEdge(9, Node.Color.ORANGE);
        nodes[18].addEdge(20, Node.Color.ORANGE);
        nodes[19].addEdge(18, Node.Color.GREEN);
        nodes[20].addEdge(19, Node.Color.BLACK);
        nodes[20].addEdge(21, Node.Color.ORANGE);
        nodes[21].addEdge(22, Node.Color.ORANGE);
        nodes[21].addEdge(0, Node.Color.BLACK);
        nodes[22].addEdge(17, Node.Color.ORANGE);

        return new Graph(nodes);
    }
}
