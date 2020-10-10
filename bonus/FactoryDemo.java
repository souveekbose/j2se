/**
 * Program to demonstrate for factory design pattern
 */

interface Pet {
    void makeSound();
}

class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class PetFactory {
    public Pet createPet(String pet) {
        Pet p = null;
        if(pet.equals("dog")) {
            p =  new Dog();
        }
        else if(pet.equals("cat")) {
            p =  new Cat();
        }
        return p;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("Initialize the factory");
        PetFactory factory = new PetFactory();

        System.out.println("Creating a dog...");
        Pet mydog = factory.createPet("dog");
        mydog.makeSound();


        System.out.println("Creating a cat...");
        Pet mycat = factory.createPet("cat");
        mycat.makeSound();


    }
}