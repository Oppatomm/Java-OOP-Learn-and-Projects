package stream;

import java.util.*;
import java.util.stream.*;

public class Terminal_Operations {
    public static void main(String[] args) {
        
        List <String> names = Arrays.asList ("Alice" , "Bob" , "Jame" , "Nine");

        // .collect - รวมผลลัพธ์เป็น List
        List <String> filterdNames = names.stream()
                                        .filter(name -> name.length() > 3)
                                        .collect(Collectors.toList());
        System.out.println(filterdNames);

        // .forEach - วนลูปแสดงผลลัพธ์
        names.stream()
            .forEach(System.out::println);

        // .count() - นับจำนวนทั้งหมด
        long count = names.stream().count();
        System.out.println("Count : " + count);

        // .findFirst() - คืนค่าตัวแรก ที่อยู่ใน Stream
        Optional <String> first = names.stream().findFirst();
        first.ifPresent(System.out::println);

        // .reduce - รวมค่าทั้งหมดให้เหลือค่าเดียว
        String combinedNames = names.stream().reduce("" , (a ,b ) -> a + b);
        System.out.println(combinedNames);
    }
}
