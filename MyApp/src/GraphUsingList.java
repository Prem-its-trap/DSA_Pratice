import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class GraphUsingList {
    HashMap<Character, ArrayList<Character>> g;

    GraphUsingList(){
        g = new HashMap<>();
    }
    public void addEdge(char x, char y){ // undirected graph
       ArrayList arr = g.getOrDefault(x, new ArrayList<>());
       arr.add(y);
       g.put(x,arr);

       arr = g.getOrDefault(y, new ArrayList<>());
       arr.add(x);
       g.put(y, arr);
    }
    // public void addEdgeDir(char x, char y){
    
    // }
    public void printGraph(){
        System.out.println(g);
    }
}
