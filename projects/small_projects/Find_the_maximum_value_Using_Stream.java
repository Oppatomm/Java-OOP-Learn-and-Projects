import java.util.*;

public class Find_the_maximum_value_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList (12, 2, 33, 67 , 80);

        int max = number.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow( () -> new RuntimeException("List is empty"));

        System.out.println("Max value : "+ max);
    }
}