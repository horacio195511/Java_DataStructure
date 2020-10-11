package structure.Abstract_Structure;
import node.Node;

public interface Abstract_Structure {
    public int add();          // return 1 if success add
    public int delete();       // return 1 if success delete
    public Node search();    // return the Object if found
    public void travel();      // print out the data in the Structure
}
