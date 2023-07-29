package L2.TreeMod;

import java.util.List;

public class GenealogyApp {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTreeImpl();
        familyTree.addPerson(new PersonImpl("John", "male"));
        familyTree.addPerson(new PersonImpl("Mary", "female"));
        familyTree.addPerson(new PersonImpl("Peter", "male"));
        familyTree.addPerson(new PersonImpl("Susan", "female"));

        familyTree.addParentChildRelationship("John", "Peter");
        familyTree.addParentChildRelationship("Mary", "Peter");
        familyTree.addParentChildRelationship("John", "Susan");
        familyTree.addParentChildRelationship("Mary", "Susan");

        String chosenPerson = "John";
        List<Person> childrenOfChosenPerson = familyTree.getChildrenOfPerson(chosenPerson);
        if (childrenOfChosenPerson != null && !childrenOfChosenPerson.isEmpty()) {
            System.out.println("Дети " + chosenPerson + ":");
            for (Person child : childrenOfChosenPerson) {
                System.out.println(child);
            }
        } else {
            System.out.println(chosenPerson + " не имеет детей.");
        }

        FileHandler fileHandler = new FileHandlerImpl();
        fileHandler.saveToFile(familyTree, "family_tree.ser");

        FamilyTree loadedFamilyTree = fileHandler.loadFromFile("family_tree.ser");
        if (loadedFamilyTree != null) {
            System.out.println("Загруженное генеалогическое древо:");
            List<Person> allPeople = loadedFamilyTree.getChildrenOfPerson("John"); // пример использования метода
            for (Person person : allPeople) {
                System.out.println(person);
            }
        }
    }
}