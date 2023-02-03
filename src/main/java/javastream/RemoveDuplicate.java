package javastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {


    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(12, 34, 55, 67, 23, 12, 23);

            l.stream()
                    .distinct()
                    .sorted(Collections.reverseOrder())
                    .forEach(System.out::println);

    }
}
