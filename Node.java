/**
 * Node
 */

package node;

public class Node{
    public Node pre;
    public Object data;
    public Node next;

    public Node(Object data){
        // for doubly linked list
        this.data=data;
    }
}