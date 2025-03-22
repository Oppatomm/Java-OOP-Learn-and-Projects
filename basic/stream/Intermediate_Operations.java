package stream;

import java.util.*;

public class Intermediate_Operations {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Alice" , "Bob" , "Jame" , "Nine" , "David");

        // .filter() - กรองหาชื่อที่มีความยาวเกิน 3 ตัวอักษร
        names.stream()
            .filter(name -> name.length() > 3) 
            .forEach(System.out::println);

        System.out.println("-------");

        // map() - แปลงทุกชื่อเป็นตัวพิมพ์ใหญ่
        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        System.out.println("-------");

        // sorted() - เรียงตามตัวอักษร
        names.stream()
            .sorted()
            .forEach(System.out::println);

        System.out.println("-------");

        // flatMap - จัดการข้อมูลที่มีความซับซ้อน
        List <List<String>> nestedList = Arrays.asList(
            Arrays.asList ("Apple" , "Orange") , 
            Arrays.asList ("Banana" , "Peach")
        );

        nestedList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}