enum UrgencyLevel {
    LOW , 
    MEDIUM , 
    HIGH
}

class Task {
    private String name;
    private UrgencyLevel level;

    Task (String name , UrgencyLevel level) {
        this.name = name;
        this.level = level;
    }

    public void displayTask() {
        System.out.println(name + " : " + level);
    }

}

public class Task_Urgency_System_Using_Enum {
    public static void main (String [] args) {

        Task task1 = new Task("Web Developer" , UrgencyLevel.LOW);
        Task task2 = new Task("Web Developer" , UrgencyLevel.MEDIUM);
        Task task3 = new Task("Web Developer" , UrgencyLevel.HIGH);

        task1.displayTask();

        System.out.println("---------------------");

        task2.displayTask();

        System.out.println("----------------------");

        task3.displayTask();
    }
}
