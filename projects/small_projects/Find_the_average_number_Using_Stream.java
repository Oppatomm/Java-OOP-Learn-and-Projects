import java.util.*;

public class Find_the_average_number_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList (10 , 20 , 30 ,40, 50);

        double average = number.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0);

        System.out.println("Average : " + average);

    }
}
