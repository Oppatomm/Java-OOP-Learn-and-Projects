class Person {
    private String firstname;
    private String lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main (String[] args) {

        Person person = new Person();

        person.setFirstname("Sumate");
        person.setLastname("Boonkird");
        person.setAge(19);

        System.out.println("Name : " + person.getFirstname() + " " + person.getLastname() );
        System.out.println("Age : " + person.getAge() );
    }
}