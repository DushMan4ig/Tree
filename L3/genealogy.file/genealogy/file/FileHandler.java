package genealogy.file;

import genealogy.model.FamilyTree;

public interface FileHandler {
    void saveToFile(FamilyTree familyTree, String filename);
    FamilyTree loadFromFile(String filename);
}