package Tree;
/*
 * Теперь у нас есть модели для человека и генеалогического древа. 
 * Мы можем использовать FamilyTree для проведения исследований, например, для получения всех детей выбранного человека:
 */
public class GenealogyResearchApp {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванов", 1950);
        Person person2 = new Person("Анна", "Иванова", 1960);
        Person person3 = new Person("Петр", "Иванов", 1985);
        Person person4 = new Person("Мария", "Иванова", 1988);

        FamilyTree familyTree = new FamilyTree();
        familyTree.addParentChildRelationship(person1, person2);
        familyTree.addParentChildRelationship(person2, person3);
        familyTree.addParentChildRelationship(person2, person4);

        // Проведем исследование: получим всех детей выбранного человека
        familyTree.getChildrenOfPerson(person2);
    }
}
