package com.test.behavioural.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.setState(new ConcreteStateA());
        context.request();

        context.setState(new ConcreteStateB());
        context.request();
    }
}