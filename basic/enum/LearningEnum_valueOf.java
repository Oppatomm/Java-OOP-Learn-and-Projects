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
public class LearningEnum_valueOf {
    public static void main(String[] args) {
        Day day = Day.valueOf("MONDAY");
        System.out.println(day);
    }
}
