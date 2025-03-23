import java.util.*;

public class Screen_out_and_display_odd_numbers_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number  = Arrays.asList (2, 45, 5, 66, 82, 13, 90 ,23, 43, 48 ,65);

        number.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}