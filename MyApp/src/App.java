public class App {
    public static void main(String[] args) throws Exception {
        // GraphUsingMatrix g = new GraphUsingMatrix(2);
        // g.addEdge(0, 1);
        // g.addEdge(1, 0);
        // g.printGraph();

        GraphUsingList gl = new GraphUsingList();
        gl.addEdge('x', 'y');
        gl.addEdge('x', 'z');
        gl.addEdge('j', 'y');


        gl.printGraph();

    }
}
