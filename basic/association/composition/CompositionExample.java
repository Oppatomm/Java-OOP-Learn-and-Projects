package association.composition;

class Engine {
    private String type;

    Engine (String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Engine Type : " + type);
    }
}

class Car {
    private String name;
    private Engine engine;

    Car (String name , String typeEngine) {
        this.name = name;
        this.engine = new Engine(typeEngine);
    }

    public void display() {
        System.out.println("Car Model : " + name);
        engine.display();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car ("Aston Martin DB12" , "V8");

        car.display();
    }
}
