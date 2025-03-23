package stream;

import java.util.*;
// import java.util.stream.*;

public class OptionalExample {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice" , "Bob" , "Jame" , "Nine" , "Zemon");

        Optional <String> result = names.stream()
                                        .filter (name -> name.startsWith("Z"))
                                        .findFirst();

        if (result.isPresent()) {
            System.out.println("Found : " + result.get());
        }else {
            System.out.println("Not Found");
        }

        String name = result.orElse("No name");
        System.out.println(name);
    }
}
