import java.util.*;
// import java.util.stream.*;

class Student {
    private String name;
    private int score;

    Student (String name , int score) {
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return name + " : " + score;
    }
}

public class Filter_students_who_passed_the_exam_Using_Stream {
    public static void main(String[] args) {
        List <Student> students = Arrays.asList(
            new Student("Alice", 43) ,
            new Student("Bob", 50) ,
            new Student("Jame" , 55) , 
            new Student("Nine" , 62)
        );
        
        System.out.println("Students who passed : ");
        students.stream()
                .filter(s -> s.getScore() > 50)
                .forEach(System.out::println);
    }
}
