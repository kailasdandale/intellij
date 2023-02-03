package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWorlds {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("komal", "avi", "dipak", "ni3", "avi", "komal");

        Map<String, Long> map = l.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        map.forEach((k,v)->{
           if(map.get(k)>1){
               System.out.println(k);
           }
        });

     //   System.out.println(map);


    }
}
