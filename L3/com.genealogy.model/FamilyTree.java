package com.genealogy.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Person> {
    private Person root;

    public FamilyTree(Person root) {
        this.root = root;
    }

    // Методы для поиска, добавления и работы с древом

    @Override
    public Iterator<Person> iterator() {
        return new FamilyTreeIterator();
    }

    private class FamilyTreeIterator implements Iterator<Person> {
        // Реализация итератора
    }
}