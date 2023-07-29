package L2.TreeMod;

public interface FileHandler {
    void saveToFile(FamilyTree familyTree, String filename);
    FamilyTree loadFromFile(String filename);
}
