import java.util.*;
// import java.util.stream.*;

public class Filter_and_include_only_numbers_greater_than_10_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList(5 , 10 , 15 , 20 , 25 , 30 , 35 , 40 ,45 , 50);

        int sum = number.stream()
                        .filter (n -> n > 10)
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println("The sum of numbers greater than 10 : " + sum);
    }
}