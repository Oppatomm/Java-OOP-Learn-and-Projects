class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog : Woof woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat : Meow meow");
    }
}


public class Polymorphism_MethodOverride {
    public static void main (String [] args) {
        Animal myAnimal = new  Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

    }
}
