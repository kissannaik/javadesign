package com.kissan.javadesign.servicelocator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceCache {
    private Map<ServiceEnum, IService> services;

    public ServiceCache(){
        this.services = new HashMap<>();
    }

    public IService getService(ServiceEnum serviceEnum){
        IService service = services.get(serviceEnum);

        if(service != null)
            return service;
        else
            return null;
    }

    public void addService(ServiceEnum serviceEnum, IService service){
        this.services.put(serviceEnum, service);
    }
}
