import java.util.HashMap;
import java.util.Stack;
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
    public void DFS(char x){
        HashMap<Character, Boolean> visited = new HashMap<>();
        Stack<Character> st = new Stack<>();

        for(Character key : g.keySet()){
            visited.put(key, false);
        }

        st.push(x);
        while(!st.isEmpty()){
            char  curr = st.pop();

            if(!visited.get(curr)){
                visited.put(curr, true);
                System.out.print(curr+" ");
            }
            ArrayList<Character> adj = g.get(curr);
            for(int i=0;i<adj.size();i++){
                char temp = adj.get(i);
                if(!visited.get(temp)){
                    st.push(curr);
                    st.push(temp);
                    break;
                }
            }
        }
    }
    public void printGraph(){
        System.out.println(g);
    }
}
