package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {

        List<String> s = Arrays.asList("kailas", "pavan", "dipak");
        List<String> l = s.stream()
                .map(e ->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(l);
    }
}
