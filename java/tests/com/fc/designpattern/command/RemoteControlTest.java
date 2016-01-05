package com.fc.designpattern.command;

import com.fc.designpattern.command.lib.GarageDoor;
import com.fc.designpattern.command.lib.Light;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/4/16.
 */
public class RemoteControlTest {

    SimpleRemoteControl simpleRemoteControl;
    Command lightOn, lightOff, garageOpen, garageClose;

    @Before
    public void setUp() throws Exception {
        // 6 button remote, 3 devices
        this.simpleRemoteControl = new SimpleRemoteControl(3);

        // Lights
        Light light = new Light(); // receiver
        lightOn = new LightOnCommand(light); // on command
        lightOff = new LightOffCommand(light); //off command

        // Garage door
        GarageDoor garageDoor = new GarageDoor(); // receiver
        garageOpen = new GarageDoorOpenCommand(garageDoor);
        garageClose = new GarageDoorCloseCommand(garageDoor);

        // Place commands into invoker
        this.simpleRemoteControl.setCommand(0, lightOn, lightOff);
        this.simpleRemoteControl.setCommand(1, garageOpen, garageClose);
        // third set of buttons has NoCommand

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        assertEquals("light is on", this.simpleRemoteControl.pressOnButton(0));
        assertEquals("light is off", this.simpleRemoteControl.pressOffButton(0));
        assertEquals("garage door is open", this.simpleRemoteControl.pressOnButton(1));
        assertEquals("garage door is close", this.simpleRemoteControl.pressOffButton(1));
        assertEquals("garage door is open", this.simpleRemoteControl.pressUndoButton());

        Command macro = new MacroCommand(new Command[] {lightOn, garageOpen, garageClose});
        this.simpleRemoteControl.setCommand(0, lightOn, macro);
        assertEquals("light is on", this.simpleRemoteControl.pressOnButton(0));
        assertEquals("light is on, garage door is open, garage door is close, ", this.simpleRemoteControl.pressOffButton(0));
    }

}