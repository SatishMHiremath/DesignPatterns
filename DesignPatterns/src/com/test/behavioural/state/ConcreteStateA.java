package com.test.behavioural.state;

class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling request in state A");
    }
}

