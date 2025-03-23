import java.util.*;

public class Screen_and_sort_names_Using_Stream {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice" , "Anna" , "Jame" , "Nine" , "Alex");

        names.stream()
            .filter(name -> name.startsWith("A"))
            .sorted()
            .forEach(System.out::println);
    }
}