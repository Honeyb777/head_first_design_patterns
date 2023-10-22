package org.tutorial.ducks;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("아무행동도 하지 않음");
    }

    @Override
    public void fly() {
        System.out.println("아무행동도 하지 않음");
    }

    @Override
    void display() {
        System.out.println("나무오리를 보여준다.");
    }
}
