package L2.TreeMod;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements Person {
    private final String name;
    private final String gender;
    private final List<Person> children;

    public PersonImpl(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public List<Person> getChildren() {
        return children;
    }

    @Override
    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return name + " (" + gender + ")";
    }
}

