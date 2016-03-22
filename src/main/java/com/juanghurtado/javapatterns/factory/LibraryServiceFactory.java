package com.juanghurtado.javapatterns.factory;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum LibraryServiceFactory {

    INSTANCE;

    private transient Map<LibraryServiceType, LibraryService> serviceCache = new TreeMap<>();

    public synchronized LibraryService getService(LibraryServiceType serviceType) throws InstantiationException {
        try {
            if (!serviceCache.containsKey(serviceType)) {
                serviceCache.put(serviceType, serviceType.getLibraryServiceClass().newInstance());
            }

            return serviceCache.get(serviceType);
        } catch (Exception ex) {
            Logger.getGlobal().log(Level.SEVERE, "Error while creating a library service instance of type: " + serviceType.name(), ex);
            throw new InstantiationException(ex.getMessage());
        }
    }

}
