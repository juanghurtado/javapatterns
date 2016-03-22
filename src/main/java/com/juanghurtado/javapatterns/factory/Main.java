package com.juanghurtado.javapatterns.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        try {
            LibraryService fantasyBooksService = LibraryServiceFactory.INSTANCE.getService(LibraryServiceType.FANTASY);
            LibraryService samuraiBooksService = LibraryServiceFactory.INSTANCE.getService(LibraryServiceType.SAMURAI);

            // Should print "fantasy books"
            Logger.getGlobal().info(fantasyBooksService.getBooks().toString());

            // Should print "samurai books"
            Logger.getGlobal().info(samuraiBooksService.getBooks().toString());
        } catch (InstantiationException e) {
            Logger.getGlobal().log(Level.SEVERE, "Error obtaining library service", e);
        }
    }

}
