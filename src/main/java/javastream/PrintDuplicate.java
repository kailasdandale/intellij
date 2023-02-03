package javastream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class PrintDuplicate {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(12, 12, 23, 23, 4, 4, 1, 56, 67, 8, 7, 65, 43);
        Set<Integer> duplicateNumbers = l.stream()
                .filter(e -> Collections.frequency(l, e) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicateNumbers);

        Set<Integer>set=new HashSet<>();
        List<Integer> ll = l.stream()
                .filter(e -> !set.add(e)).collect(Collectors.toList());
        System.out.println(ll);
    }
    
}
