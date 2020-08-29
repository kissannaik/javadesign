package com.kissan.javadesign.behavioral.iterator;

import java.util.Arrays;

/**
 * Iterator pattern is very commonly used design pattern in Java !!!
 * 	 This is used to get a way to access the elements of a collection object in
 * 		sequential manner without any need to know its underlying representation
 *
 */
public class App {

    public static void main(String[] args) {
        StringRepository stringRepository = new StringRepository();

        for(IIterator iter=stringRepository.getIterator(); iter.hasNext();)
            System.out.println(iter.getNext());
    }
}
