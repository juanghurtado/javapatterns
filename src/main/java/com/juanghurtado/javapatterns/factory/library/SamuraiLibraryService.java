package com.juanghurtado.javapatterns.factory.library;

import java.util.LinkedList;
import java.util.List;

import com.juanghurtado.javapatterns.factory.LibraryService;

public class SamuraiLibraryService implements LibraryService {

    public List<String> getBooks() {
        List<String> books = new LinkedList<>();

        books.add("Musashi");
        books.add("Taiko");
        books.add("Usagi Yojimbo");

        return books;
    }

}
