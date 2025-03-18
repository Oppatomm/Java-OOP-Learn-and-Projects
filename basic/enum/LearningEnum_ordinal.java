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
public class LearningEnum_ordinal {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day.ordinal());
    }
}
