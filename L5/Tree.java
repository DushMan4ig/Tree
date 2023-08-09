package L5;

import java.util.List;

public interface Tree {
    List<Person> getChildren(Person person);
}

public class GenealogyTree implements Tree {
    private Person root;

    public GenealogyTree(Person root) {
        this.root = root;
    }

    @Override
    public List<Person> getChildren(Person person) {
        return person.getChildren();
    }
}