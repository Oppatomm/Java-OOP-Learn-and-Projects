enum Day {
    MONDAY , 
    TUESDAY , 
    WEDNESDAY ,
    THURSDAY ,
    FRIDAY,
    SATURDAY ,
    SUNDAY;
}

public class Workday_Display_System_Using_Enum {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;

        switch (day) {
            case MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY -> System.out.println(day + " : Workday");
            case SATURDAY , SUNDAY -> System.out.println(day + " : Holiday");
        }
    }
}
