// package enum;
enum Day {
    MONDAY("Start of the week.") , 
    TUESDAY("Productivity rises.") , 
    WEDNESDAY("Midweek point.") ,
    THURSDAY("Weekend feels near.") ,
    FRIDAY("Weekend excitement.") ,
    SATURDAY("Relax and enjoy.") ,
    SUNDAY("Rest and prepare.") ;

    private String description;

    Day (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class LearningEnum_Method {
    public static void main (String [] args) {
        Day today = Day.FRIDAY;

        System.out.println("FRIDAY : " + today.getDescription());
    }
}
