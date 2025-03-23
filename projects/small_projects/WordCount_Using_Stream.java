import java.util.*;

public class WordCount_Using_Stream {
    public static void main(String[] args) {
        String sentence = "Today is a sunny Monday";

        long wordcount = Arrays.stream(sentence.split("\\s+"))
                                .count();

        System.out.println("Total words : " + wordcount);
    }
}