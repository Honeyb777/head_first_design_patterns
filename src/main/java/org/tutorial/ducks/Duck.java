package org.tutorial.ducks;

abstract class Duck {
    public void quack() {
        System.out.println("꽥꽥");
    }

    public void swim() {
        System.out.println("헤엄치기");
    };
    abstract void display();
    public void fly() {
        System.out.println("비행하기");
    }
}
