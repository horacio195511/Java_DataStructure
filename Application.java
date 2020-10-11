/**
 * project directory
    structure
        |__Abstract_structure
            |__Abstract_structure
            |__Tree_structure
        |__Structure
            |__tree
                |__binary tree
                |__binary search tree
                |__b_tree
            |__linked list
            |__stack
            |__quere
    node
        |__Node
*/
import structure.Linked_list;
import node.Node;

public class Application {
    public static void main(String[] args) {
        // linked list test program
        // create a linked list
        Linked_list list1 = new Linked_list(10);
        // add some node to it
        for(int i=0; i<=10; i++){
            Node newNode = new Node(i+10);
            list1.add(newNode);
        }
        // travel around
        list1.travel();
        // search
        Node targetNode=list1.search(15);
        System.out.println(targetNode.toString());
        // delete nodes
        list1.delete(15);
        // travel around
        list1.travel();
    }
}
