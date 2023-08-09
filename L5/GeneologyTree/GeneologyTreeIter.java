package L5.GeneologyTree;

import java.util.Iterator;
import java.util.List;

import L5.Person;
import L5.Tree;

public class GeneologyTreeIter implements Tree, Iterable<Person> {
    // ...

    @Override
    public Iterator<Person> iterator() {
        // Реализуйте итератор для обхода дерева
        return null;
    }

    @Override
    public List<Person> getChildren(Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildren'");
    }
}