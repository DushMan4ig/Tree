package L5.GeneologyTree;

import java.util.Comparator;
import java.util.List;

import L5.Person;
import L5.Tree;

public class GenealogyTree implements Tree {
    // ...

    public List<Person> getSortedPeople(Comparator<Person> comparator) {
        // Реализуйте сортировку списка людей по заданному компаратору
        return null;
    }

    @Override
    public List<Person> getChildren(Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildren'");
    }
}