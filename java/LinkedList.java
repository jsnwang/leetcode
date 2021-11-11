class Node {
    Node next;
    int data;
    
    //constructor
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
public class LinkedList {
    Node head;

    public void append(int data){
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteValue(int data) {
        if (head == null) {
            return;
        }
        if(head.data == data) {
            head = head.next;
        }
        Node current = head;
        while(current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void insert(Node prev, int data) {
        Node node = new Node(data);

        node.next = prev.next;
        prev.next = node;
    }
    public void reverse(Node node){
        Node prev = null;
        Node next = null;
        Node current = node;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        head = prev;
    }
    public void printList(){
        Node node = head;
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public void mergeLists(Node l1, Node l2){
        
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.append(3);
        ll.append(2);
        ll.insert(ll.head.next, 13);

        ll.printList();
        
    }
}