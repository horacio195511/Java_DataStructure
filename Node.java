/**
 * Node
 */

package node;
public class Node{
    Node pre;
    Object data;
    Node next;

    public Node(Node pre, Object data, Node next){
        // for doubly linked list
        this.pre=pre;
        this.data=data;
        this.next=next;
    }
    public Node(Object data, Node next){
        // for singly linked list
        this.pre=null;
        this.data=data;
        this.next=next;
    }
}