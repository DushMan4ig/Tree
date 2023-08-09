package L5;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int birthYear;
    private String gender;
    private Person father;
    private Person mother;
    private List<Person> children = new ArrayList<>();

    public Person(String name, int birthYear, String gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }

    public List<Person> getChildren() {
        return null;
    }
}