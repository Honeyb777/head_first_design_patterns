package org.tutorial.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("아무행동도 하지 않음");
    }
}
