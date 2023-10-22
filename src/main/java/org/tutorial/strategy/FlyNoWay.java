package org.tutorial.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("아무행동도 하지 않음");
    }
}
