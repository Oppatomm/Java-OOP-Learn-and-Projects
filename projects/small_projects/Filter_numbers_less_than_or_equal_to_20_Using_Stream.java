import java.util.*;

public class Filter_numbers_less_than_or_equal_to_20_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList (2 , 3, 6 ,8 ,11 ,14 ,20 , 25 , 28 , 35 , 40 , 31 , 50);

        number.stream()
                .filter(n -> n <= 20)
                .forEach(System.out::println);
    }
}