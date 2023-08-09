package com.genealogy.file;

import com.genealogy.model.FamilyTree;

public class FileHandlerImpl implements FileHandler {
    @Override
    public void saveToFile(FamilyTree familyTree, String filename) {
        // Реализация сохранения дерева в файл
    }

    @Override
    public FamilyTree loadFromFile(String filename) {
        // Реализация чтения дерева из файла и возврат его
        return null;
    }
}