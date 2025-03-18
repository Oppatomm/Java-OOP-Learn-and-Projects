// package enum;
enum Day {
    MONDAY , 
    TUESDAY , 
    WEDNESDAY ,
    THURSDAY ,
    FRIDAY ,
    SATURDAY ,
    SUNDAY
}
public class LearningEnum_compareTo {
    public static void main(String[] args) {
        Day day1 = Day.THURSDAY;  // 3

        Day day2 = Day.THURSDAY; //6
        System.out.println(day1.compareTo(day2));   // -3
    }
}
