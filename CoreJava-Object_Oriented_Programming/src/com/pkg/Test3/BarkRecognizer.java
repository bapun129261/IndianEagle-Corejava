package com.pkg.Test3;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void voiceRecognizer(Bark dogBark) {
        for (Bark bark : door.getAllowedBarks()) {
            if (bark.getSound().equals(dogBark.getSound())) {
                System.out.println("Voice Recognizer Heard a " + dogBark.getSound() + "...." + dogBark.getSound() + "...!!!!");
                door.open();
            } else {
                continue;
            }
        }
    }

}
