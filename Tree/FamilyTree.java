package Tree;

import java.util.HashMap;
import java.util.Map;
/*
 * Создадим класс FamilyTree, который будет представлять генеалогическое древо. 
 * Для простоты, предположим, что каждый человек имеет только одного родителя (мать или отца). 
 * Каждый узел дерева будет представлять одного человека, 
 * и мы будем использовать связи между узлами для представления родственных отношений.
 */
public class FamilyTree {
     private Map<Person, Person> parents; // Хранит отображение между человеком и его родителем

    public FamilyTree() {
        parents = new HashMap<>();
    }

    // Метод для добавления связи родитель-ребенок в дерево
    public void addParentChildRelationship(Person parent, Person child) {
        parents.put(child, parent);
    }

    // Метод для получения всех детей выбранного человека
    public void getChildrenOfPerson(Person person) {
        System.out.println("Дети для " + person.getFirstName() + " " + person.getLastName() + ":");
        for (Person child : parents.keySet()) {
            if (parents.get(child).equals(person)) {
                System.out.println(child);
            }
        }
    }
}
