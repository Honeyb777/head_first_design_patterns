package org.tutorial.ducks;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("붉은 머리 오리를 보여준다.");
    }

    @Override
    public void fly() {
        System.out.println("비행하기");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
