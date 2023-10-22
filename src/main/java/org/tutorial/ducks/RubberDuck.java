package org.tutorial.ducks;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    void display() {
        System.out.println("고무오리를 보여준다.");
    }
}
