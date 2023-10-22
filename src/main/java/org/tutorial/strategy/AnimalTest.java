package org.tutorial.strategy;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.makeSomeAnimals();
    }

    public void makeSomeAnimals() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // treat dog and cats as their supertype, Animal;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        animals.forEach(Animal::makeSound); // can call makeSound on any Animal
    }

    public abstract class Animal {
        abstract void makeSound();
    }

    public class Dog extends Animal {
        @Override
        void makeSound() {
            bark();
        }
        void bark() {
            System.out.println("멍멍");
        }
    }

    public class Cat extends Animal {
        @Override
        void makeSound() {
            meow();
        }
        void meow() {
            System.out.println("야옹");
        }
    }
}
