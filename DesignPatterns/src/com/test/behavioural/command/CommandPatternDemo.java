package com.test.behavioural.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        TurnOnTVCommand turnOnCommand = new TurnOnTVCommand(tv);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
    }
}