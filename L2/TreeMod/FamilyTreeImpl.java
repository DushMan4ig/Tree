package L2.TreeMod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTreeImpl implements FamilyTree {
    private final Map<String, Person> people;

    public FamilyTreeImpl() {
        this.people = new HashMap<>();
    }

    @Override
    public void addPerson(Person person) {
        people.put(person.getName(), person);
    }

    @Override
    public void addParentChildRelationship(String parentName, String childName) {
        Person parent = people.get(parentName);
        Person child = people.get(childName);

        if (parent != null && child != null) {
            parent.addChild(child);
        }
    }

    @Override
    public List<Person> getChildrenOfPerson(String name) {
        Person person = people.get(name);
        if (person != null) {
            return person.getChildren();
        }
        return null;
    }
}