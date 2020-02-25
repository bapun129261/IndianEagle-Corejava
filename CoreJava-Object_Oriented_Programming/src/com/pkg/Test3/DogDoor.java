package com.pkg.Test3;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class DogDoor {

    private Boolean open;
    private List<Bark> allowedBarks;

    public DogDoor() {
        open = false;
        allowedBarks = new ArrayList<>();
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }


    public void open() {
        System.out.println("door is opening");
        open = true;


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 3000);
    }

    public void close() {
        System.out.println("door is closing");
        open = false;
    }

    public Boolean isOpen() {
        return open;
    }

    public void addAllowBark(Bark bark) {
        allowedBarks.add(bark);

    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }


}
