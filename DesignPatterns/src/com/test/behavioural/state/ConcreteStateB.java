package com.test.behavioural.state;

class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handling request in state B");
    }
}

