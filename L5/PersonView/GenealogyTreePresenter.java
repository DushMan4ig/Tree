package L5.PersonView;

import java.util.List;

import L5.Person;
import L5.Tree;

public class GenealogyTreePresenter {
    private Tree model;
    private PersonView personView;
    private GenealogyTreeView treeView;

    public GenealogyTreePresenter(Tree model, PersonView personView, GenealogyTreeView treeView) {
        this.model = model;
        this.personView = personView;
        this.treeView = treeView;
    }

    public void showChildrenOfPerson(Person person) {
        List<Person> children = model.getChildren(person);
        treeView.showChildren(children);
    }
}