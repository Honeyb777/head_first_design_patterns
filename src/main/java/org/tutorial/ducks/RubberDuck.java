package org.tutorial.ducks;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    public void fly() {
        System.out.println("아무행동도 하지 않음");
    }

    @Override
    void display() {
        System.out.println("고무오리를 보여준다.");
    }
}
