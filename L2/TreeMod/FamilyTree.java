package L2.TreeMod;

import java.util.List;

    public interface FamilyTree {
    void addPerson(Person person);
    void addParentChildRelationship(String parentName, String childName);
    List<Person> getChildrenOfPerson(String name);
    }
