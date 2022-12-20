import java.util.Stack;
public class GraphUsingMatrix {
    int[][] graph;
    int size  = 0;

    GraphUsingMatrix(int v){
        graph = new int[v][v];
        size = v;
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

    void DFS(int start){
        boolean[] vistied = new boolean[size];
        Stack<Integer> st = new Stack<Integer>();

        st.push(start);

        while(!st.isEmpty()){
            int  curr = st.pop(); // getting out the stack top element 

            if(!vistied[curr]){
                vistied[curr] = true;
                System.out.print(curr+" ");
            }
            int adj[] = graph[curr]; // current element ka pura array isme get kr lenge

            for(int i=0;i<adj.length;i++){
                if(adj[i] == 1 && !vistied[i]){
                    st.push(curr);
                    st.push(i);
                    break;
                }
            }
        }
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
