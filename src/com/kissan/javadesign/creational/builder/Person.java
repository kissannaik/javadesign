package com.kissan.javadesign.creational.builder;

public class Person {

    private final String name;
    private final String email;
    private final int age;
    private final String address;

    public Person(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private final String name;
        private final String email;
        private int age;
        private String address;

        public Builder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
