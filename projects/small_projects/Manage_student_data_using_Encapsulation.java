class Student {
    private String name;
    private int age;
    private String grade;

    public Student (String name , int age ,String grade) {
        this.name = name;
        this.age = (age < 0) ? -1 : age;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return (age < 0) ? "Invalid age" : String.valueOf(age);
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade (String grade) {
        if (grade == null) {
            this.grade = "Invalid grade";
        }else {
            this.grade = grade;
        }
    }

    void print_result () {
        System.out.println ("Name : " + getName() + 
                            "\nAge : " + getAge() + 
                            "\nGrade : " + getGrade());
    }
}

public class Manage_student_data_using_Encapsulation {
    public static void main (String[] args) {

        Student student = new Student("Sumate Boonkird" , -2 , "ปริญญาตรี ชั้นปีที่ 4");
        Student student2 = new Student("Sumate Boonkird" , 15 , null);
        Student student3 = new Student("Sumate Boonkird" , 25 , "มัธยมศึกษาปีที่ 6");

        student.print_result();
        System.out.println("---------------------------------");
        student2.print_result();
        System.out.println("---------------------------------");
        student3.print_result();

    }
}