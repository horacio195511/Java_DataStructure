/**
 * Node
 */

package node;
public class Node{
    Node pre;
    Object data;
    Node next;

    public Node(Object data){
        // for doubly linked list
        this.data=data;
    }
}