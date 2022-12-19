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
    void addEdge(int x, int y , int w){// undirected weighted
        graph[x][y] = w;
        graph[y][x] = w;
    }
    void addEdgeDir(int x,int y,int w){ // directed weighted
        graph[x][y] = w;
    }
    void printGraph(){
        for(int[] x: graph){
            for(int j: x){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
