package structure.Abstract_Structure;
import structure.Abstract_Structure.Abstract_Structure;

public interface TreeStructure extends Abstract_Structure {
    int preTravel();    // DLR
    int postTravel();   // LRD
    int midTravel();    // LDR
}
