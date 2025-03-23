import java.util.*;

public class Calculate_the_sum_of_even_numbers_Using_Stream {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(12 , 4 , 33 , 97 , 88 , 9);

        int sum = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println("Sum of even numbers : " + sum);
    }
}