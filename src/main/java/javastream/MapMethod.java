package javastream;

import java.util.Arrays;

public class MapMethod {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5,6,7,8).stream()
                .map(e->e+2)
                .forEach(System.out::println);


    }
}
