interface Vehicle {
    void move();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car moving...");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle moving...");
    }
}

public class Abstraction {
    public static void main (String [] args) {

        Vehicle myCar = new Car();
        myCar.move();

        Vehicle myBicycle = new Bicycle();
        myBicycle.move();
    }
}
