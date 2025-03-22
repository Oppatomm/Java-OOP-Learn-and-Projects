package association.aggregation;
import java.util.ArrayList;
import java.util.List;

class Teacher {
    private String name;

    Teacher (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Teacher : " + name);
    }
}

class School {
    private String name;
    private List<Teacher> teachers;

    School (String name , List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return  name;
    }

    public void display() {
        System.out.println("School : " + name);
        for (Teacher s : teachers) {
            s.display();
        }
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Jame");
        Teacher teacher2 = new Teacher("Mr. Nine");

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(teacher1);
        teachersList.add(teacher2);

        School school = new School("saohai wimolwitthayanukul school" , teachersList);

        school.display();

    }
}
