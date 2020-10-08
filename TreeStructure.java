package structure;

public interface TreeStructure extends Structure {
    int preTravel();    // DLR
    int postTravel();   // LRD
    int midTravel();    // LDR
}
