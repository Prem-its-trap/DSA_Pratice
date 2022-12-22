
class Node { // Node class 
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public Node insertAtTail(Node curr, int data){ // INSERTION AT TAIL 
        if(curr == null){
            curr = new Node(data);
        } else {
            Node temp = new Node(data);
            curr.next = temp;
            curr = curr.next;
        }
        return curr;
    }
    //INSERTION AT HEAD
    public Node insertAtHead(Node curr, int data){
        if(curr == null){
            curr = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = curr;
            curr = temp;
        }
        return curr;
    }
    // REVERSE A LINKEDlIST
    public Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public Node insertAtKthPos(Node head, int k, int data){
        Node newNode = new Node(data); 
        if(k == 1){
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        Node prev = null;
        for(int i=0;i<k-1;i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

        return head;
    }
    public void deleteAtTail(Node head){
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }
    public void deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        Node prevOfSlow = null;

        while(fast != null && fast.next != null){
            prevOfSlow = slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        prevOfSlow.next = slow.next;
    }
    
    public void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}
