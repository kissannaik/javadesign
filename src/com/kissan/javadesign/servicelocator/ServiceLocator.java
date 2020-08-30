package com.kissan.javadesign.servicelocator;

public class ServiceLocator {

    private static ServiceCache cache = new ServiceCache();

    public static IService getService(ServiceEnum jndiName) {

        IService service = cache.getService(jndiName);

        if( service != null )
            return service;

        InitialContext context = new InitialContext();
        service = (IService) context.lookup(jndiName);
        cache.addService(jndiName, service);

        return service;
    }
}
