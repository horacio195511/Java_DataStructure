package structure;

import structure.Abstract_Structure.Abstract_Structure;
import node.Node;
import java.util.Objects;

// this implementation is singly linked list, which means that only the next pointer is used
public class Linked_list implements Abstract_Structure{
    Node head;
    // constructor
    public Linked_list(int headData){
        // create a head node
        // headData as identifier
        head=new Node(headData);
    }
    // there should be some condition about where to insert
    public int add(Node newNode){
        //return 1 if success, add the input element to required place
        Node current=this.head;
        while(current.next != null){
            // roll until to the last node
            current=current.next;
        }
        current.next=newNode;
        return 1;
    }
    public int delete(Object target){
        // search for the wanted Node
        Node targetNode=this.search(target);
        // delete it from list
        if(targetNode!=null){
            Node pre=targetNode.pre;
            pre.next=targetNode.next;
            return 1;
        }else{
            return 0;
        }
    }
    public Node search(Object target){
        // search for the wanted Node
        Node current=this.head;
        Node pre;
        while(current.next!=null){
            pre=current;
            current=current.next;
            if(Objects.equals(current.data, target)){
                current.pre=pre;
                return current;
            }
        }
        return null;
    }

    public void travel(){
        // linear travel
        Node current=this.head;
        while(current.next != null){
            current=current.next;
            System.out.println(current.data.toString());
        }
    }
}