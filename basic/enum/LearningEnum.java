enum Day {
    MONDAY , 
    TUESDAY , 
    WEDNESDAY ,
    THURSDAY ,
    FRIDAY ,
    SATURDAY ,
    SUNDAY
}

public class LearningEnum {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println(today);
    }
}