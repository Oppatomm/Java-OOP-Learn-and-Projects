import java.util.*;

class Person {
    private String name;
    private int age;

    Person (String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return  name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "( " +  age + " year old )";
    }
}

public class Find_the_oldest_person_in_the_group_Using_Stream {
    public static void main(String[] args) {
        List <Person> person = Arrays.asList (
            new Person ("Alice" , 12) ,
            new Person ("Jame" ,25) , 
            new Person ("Nine" , 22) ,
            new Person ("David" , 35)
        );

        Person oldest = person.stream()
                        .max(Comparator.comparingInt(Person::getAge))
                        .orElseThrow (() -> new RuntimeException("List is empty"));
                        
        System.out.println("The oldest person is : " + oldest);


    }
}