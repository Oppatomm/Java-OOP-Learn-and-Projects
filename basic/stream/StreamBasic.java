package stream;

import java.util.*;
import java.util.stream.*;

public class StreamBasic {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice" , "Bob" , "Jame");
        Stream <String> nameStream = names.stream();

        nameStream.forEach(System.out::println);
    }
}