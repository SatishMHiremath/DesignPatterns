package com.test.behavioural.template;

class CricketGame extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Play!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

