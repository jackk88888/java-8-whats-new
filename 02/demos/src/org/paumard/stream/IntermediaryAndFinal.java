/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.paumard.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author José
 */
public class IntermediaryAndFinal {
    
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
        
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        
        List<String> list = new ArrayList<>();
        
        stream
                .peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);
        
        System.out.println("Done!");
        System.out.println("size = " + list.size());
    }
}
