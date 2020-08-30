package com.kissan.javadesign.servicelocator;

public class InitialContext {

    public Object lookup(ServiceEnum jndiName) {

        switch (jndiName) {
            case DATABASE_SERVICE:
                return new DatabaseService();
            case MESSAGING_SERVICE:
                return new MessagingService();
            default:
                return null;
        }
    }
}
