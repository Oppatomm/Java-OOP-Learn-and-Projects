enum Day {
    MONDAY , 
    TUESDAY , 
    WEDNESDAY ,
    THURSDAY ,
    FRIDAY ,
    SATURDAY ,
    SUNDAY
}

public class LearningEnum_switchcase {
    public static void main (String [] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY -> System.out.println("Weekday");
            case SATURDAY , SUNDAY -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}