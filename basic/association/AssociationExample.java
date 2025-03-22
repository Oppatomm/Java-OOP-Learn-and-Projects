package association;

class Teacher {
    private String name;

    Teacher (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;

    Student (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AssociationExample {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Jame");
        Student student = new Student("Tom");

        System.out.println(teacher.getName() + " teaches " + student.getName() );
    }
}
