package com.epam.lab.Commands;

//Client
public class Client implements com.epam.lab.Command{

    @Override
            public void execute(){

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        System.out.println("Light is on");
        control.pressButton();
        //switch off
       // control.setCommand(lightsOff);
        //control.pressButton();
    }
}