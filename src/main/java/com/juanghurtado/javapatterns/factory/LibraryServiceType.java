package com.juanghurtado.javapatterns.factory;

import com.juanghurtado.javapatterns.factory.library.FantasyLibraryService;
import com.juanghurtado.javapatterns.factory.library.SamuraiLibraryService;

public enum LibraryServiceType {

    // @formatter:off
    SAMURAI(SamuraiLibraryService.class),
    FANTASY(FantasyLibraryService.class);
    // @formatter:on

    private Class<? extends LibraryService> libraryService;

    private LibraryServiceType(Class<? extends LibraryService> service) {
        this.libraryService = service;
    }

    public Class<? extends LibraryService> getLibraryServiceClass() {
        return libraryService;
    }

}
