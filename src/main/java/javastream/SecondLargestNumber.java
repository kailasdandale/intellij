package javastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class SecondLargestNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 34, 56, 78, 7, 65, 43, 32, 16, 88, 90);

        Integer i = list.stream()
                .sorted()
                .collect(Collectors.toList()).get(list.size() - 2);
        System.out.println(i);
        List<Integer> ii = list.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("hello");
        System.out.println("hello word");
        System.out.println(ii);
    }
}
