public class App {
    public static void main(String[] args) throws Exception {
        GraphUsingMatrix g = new GraphUsingMatrix(6);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(3, 1);
        g.addEdge(2, 1);
        g.addEdge(2, 5);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.printGraph();
        System.out.println();
        g.DFS(5);
        // GraphUsingList gl = new GraphUsingList();
        // gl.addEdge('x', 'y');
        // gl.addEdge('x', 'z');
        // gl.addEdge('j', 'y');


        // gl.printGraph();

    }
}
