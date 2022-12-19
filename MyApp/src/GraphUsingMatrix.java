public class GraphUsingMatrix {
    int[][] graph;

    GraphUsingMatrix(int v){
        graph = new int[v][v];
    }
    void addEdge(int x, int y){ // undirected graphh
        graph[x][y] = 1;
        graph[y][x] = 1;
    }
    void addEdgeDir(int from, int to){ // directed graph
        graph[from][to] = 1;
    }
    void printGraph(){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
}
