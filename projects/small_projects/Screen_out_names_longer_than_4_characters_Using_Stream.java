import java.util.*;

public class Screen_out_names_longer_than_4_characters_Using_Stream {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice" , "Bob" , "Jame" , "Nine");

        names.stream()
            .filter(name -> name.length() > 4)
            .forEach(System.out::println);
    }
}