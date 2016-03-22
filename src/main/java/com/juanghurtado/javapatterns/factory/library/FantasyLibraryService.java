package com.juanghurtado.javapatterns.factory.library;

import java.util.LinkedList;
import java.util.List;

import com.juanghurtado.javapatterns.factory.LibraryService;

public class FantasyLibraryService implements LibraryService {

    public List<String> getBooks() {
        List<String> books = new LinkedList<>();

        books.add("Lord of the Rings");
        books.add("Game of Thrones");
        books.add("Harry Potter");

        return books;
    }

}
