abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow meow");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moo Moo");
    }
}

class Sheep extends Animal {
    @Override
    void makeSound() {
        System.out.println("Baa Baa");
    }
}

public class Inheritance {
    public static void main (String [] args) {
        
        // Dog
        Dog myDog = new Dog();
        myDog.makeSound();


        // Cat
        Cat myCat = new Cat();
        myCat.makeSound();


        // Cow
        Cow myCow = new Cow();
        myCow.makeSound();


        //Sheep
        Sheep mySheep = new Sheep();
        mySheep.makeSound();
    }
}