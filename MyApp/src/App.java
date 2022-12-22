import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // GraphUsingMatrix g = new GraphUsingMatrix(6);
        // g.addEdge(0, 1);
        // g.addEdge(0, 4);
        // g.addEdge(3, 1);
        // g.addEdge(2, 1);
        // g.addEdge(2, 5);
        // g.addEdge(3, 5);
        // g.addEdge(4, 5);
        // g.printGraph();
        // g.DFS(5);
        // System.out.println();

        // boolean[] vistied = new boolean[6];
        // g.DFS(5,vistied);

        // g.BFS(5);

        // GraphUsingList gl = new GraphUsingList();
        // gl.addEdge('x', 'y');
        // gl.addEdge('x', 'z');
        // gl.addEdge('j', 'y');

        // gl.printGraph();

        // gl.DFS('x');



        // LINKEDLIST METHOD CALL
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        Node curr = null;
        Node head = null;
        for(int i=0;i<5;i++){
            if(curr == null){
                int data = sc.nextInt();
                // curr = l.insertAtHead(curr, data); 
                 curr=l.insertAtTail(curr,data);
                head = curr;
            } else {
                int data = sc.nextInt();
                // curr = l.insertAtHead(curr, data);
                curr=l.insertAtTail(curr,data);
            }
        }
        l.printList(head);
        // l.reverseLL(head);
        System.out.println();
        l.insertAtKthPos(head, 2, 55);
        l.printList(head);
        System.out.println();
        l.deleteAtTail(head);
        l.printList(head);
        System.out.println();
        l.deleteMiddle(head);
        l.printList(head);

    }
}
