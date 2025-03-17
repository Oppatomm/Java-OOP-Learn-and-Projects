class Calculate {
    public int math (int x) {
        return x;
    }
    public int math (int x , int y) {
        return x + y;
    }

    public int math (int x , int y , int z) {
        return x + y + z;
    }
}

public class Polymorphism_MethodOverloading {
    public static void main (String [] args) {
        Calculate cal = new Calculate();

        System.out.println(cal.math(10));
        System.out.println(cal.math(10,20));
        System.out.println(cal.math(10,20,30));
    }
}
