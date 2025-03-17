abstract class Employee {
    private String name;

    public Employee (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    private int salary = 30000;

    FullTimeEmployee (String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println(getName() + " a full-time employee, receives a salary of " + salary + " baht per month.");
    }
}

class PartTimeEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    PartTimeEmployee (String name , int hourlyRate , int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        System.out.println(getName() + " a part-time employee, earns " + (hourlyRate * hoursWorked) + " baht per day.");
    }

}
public class Calculate_Employee_Salary_Using_Abstract_Class_and_Interface {
    public static void main (String [] args) {

        Employee fulltime = new FullTimeEmployee("Jame");
        fulltime.calculateSalary();

        System.out.println("-----------------");

        Employee parttime = new PartTimeEmployee("Nine", 60, 8);
        parttime.calculateSalary();
    }
}
