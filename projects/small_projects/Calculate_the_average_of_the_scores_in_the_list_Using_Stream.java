import java.util.*;

public class Calculate_the_average_of_the_scores_in_the_list_Using_Stream {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList (25 , 20 , 48 , 70 ,13 ,89 , 15 ,62 ,33);

        double average = number.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);
        System.out.printf("Average : %.2f\n" , average);
    }
}
