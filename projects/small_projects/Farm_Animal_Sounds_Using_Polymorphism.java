import java.util.ArrayList;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Farm_Animal_Sounds_Using_Polymorphism {
    public static void main(String[] args) {

        Animal Dog = new Dog();
        Animal Cat = new Cat();

        ArrayList <Animal> animals = new ArrayList<>();

        animals.add(Dog);
        animals.add(Cat);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
