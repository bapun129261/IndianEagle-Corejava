package com.pkg.Test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Guitar> listOfguitar;

    public Inventory() {
        listOfguitar = new ArrayList<>();
    }

    public void addGuitar(String serialNumber,Double price,  GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        listOfguitar.add(guitar);
    }


    public List<Guitar> searchGuitar(GuitarSpec searchGuitar) {
        List<Guitar> searchedGuitar = new LinkedList<>();

        for (Guitar guitar : listOfguitar) {
            if (guitar.getSpec().isMatchGuitar(searchGuitar)) {
                searchedGuitar.add(guitar);
            } else continue;
        }
        return searchedGuitar;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "listOfguitar=" + listOfguitar +
                '}';
    }
}
