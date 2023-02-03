package javastream;

import java.util.Arrays;
import java.util.List;

public class SortArray {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(12, 34, 66, 54, 32, 89, 77, 65);
//        l.stream()
//                .sorted()
//                .forEach(System.out::println);
        l.stream()
                .map(e -> e + 1)
                .forEach(e -> System.out.println(e));

    }

}
