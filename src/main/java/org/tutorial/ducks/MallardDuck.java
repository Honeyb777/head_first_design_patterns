package org.tutorial.ducks;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("청둥오리를 보여준다.");
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
