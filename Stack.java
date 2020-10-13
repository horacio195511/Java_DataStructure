package structure;
import node.Node;
import structure.Linked_list;

public class Stack extends Linked_list{
    // a stack must be first in first out
    // this is a linked list implementation Stack
    public Stack(int objectData){
        super(objectData);
    }
    @Override
    public int add(Node newNode){
        // should be doubly linked
        Node pre = this.head;
        Node current = this.head;
        while(current.next != null){
            pre = current;
            current = current.next;
        }
        newNode.pre = current;
        current.next = newNode;
        return 1;
    }

    @Override
    public int delete(Object object) {
        // pop the last element
        Node current = this.head;
        Node pre = this.head;
        while(current.next != null){
            // roll to the last item
            pre = current;
            current = current.next;
        }
        pre.next = null;
        return 1;
    }

    @Override
    public Node search(Object object) {
        // return and pop the last element
        Node current = this.head;
        Node pre = this.head
        while(current.next != null){
            pre = current;
            current = current.next;
        }
        pre.next = null;
        return current;
    }

    @Override
    public void travel() {
        // travel from last element to the element next to head
        // TODO:stack should be doubly linked...
        Node current = this.head;
        while(current.next != null){
            // roll to last one
            current = current.next;
        }
        while(current.pre != null){
            System.out.println(current.data.toString());
            current = current.pre;
        }
    }
}
