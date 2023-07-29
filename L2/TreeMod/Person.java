package L2.TreeMod;

import java.util.List;

    public interface Person {
    String getName();
    String getGender();
    List<Person> getChildren();
    void addChild(Person child);
}
