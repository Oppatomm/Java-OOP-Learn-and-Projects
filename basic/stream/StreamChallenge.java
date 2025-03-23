package stream;

import java.util.*;

public class StreamChallenge {
    public static void main(String[] args) {
        List <String> names = Arrays.asList ("Alice" , "Bob" , "Jame" , "Nine");

        Optional <String> firstname = names.stream()  
                                            .filter (name -> name.length() > 3)
                                            .sorted()
                                            .findFirst();
            
        firstname.ifPresent(System.out::println);
    }
}
