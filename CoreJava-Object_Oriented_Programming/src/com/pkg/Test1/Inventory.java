package com.pkg.Test1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Guitar> listOfguitar;

    public Inventory(){
        listOfguitar=new ArrayList<>();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, Double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        listOfguitar.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : listOfguitar) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar searchGuitar(Guitar searchGuitar) {
        for (Guitar guitar : listOfguitar) {
            if (guitar.getBuilder() != null || searchGuitar.getBuilder() != null ||
                    guitar.getModel() != null || searchGuitar.getModel() != null ||
                    guitar.getBackWood() != null || searchGuitar.getBackWood() != null ||
                    guitar.getType() != null || searchGuitar.getType() != null ||
                    guitar.getTopWood() != null || searchGuitar.getTopWood() != null) {

                if (guitar.getBuilder().equals(searchGuitar.getBuilder()) &&
                        guitar.getModel().equals(searchGuitar.getModel()) &&
                        guitar.getBackWood().equals(searchGuitar.getBackWood()) &&
                        guitar.getType().equals(searchGuitar.getType()) &&
                        guitar.getTopWood().equals(searchGuitar.getTopWood())) {

                    return guitar;
                }
            }else {
                continue;
            }

        }


        return null;
    }
}
