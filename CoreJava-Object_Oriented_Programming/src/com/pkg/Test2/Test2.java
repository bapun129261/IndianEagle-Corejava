package com.pkg.Test2;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Random random = new Random();
        inventory.addGuitar(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 32322.0,new GuitarSpec(Builder.DURGA, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER));
        inventory.addGuitar(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 32892.0,new GuitarSpec(Builder.RADHA, Model.STRATOCASTOR, Type.ELECTRIC, Wood.INDIANWOOD));
        inventory.addGuitar(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 32975.0,new GuitarSpec(Builder.ABHI, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.SITKA));
        inventory.addGuitar(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 82422.0,new GuitarSpec(Builder.NARAYAN, Model.STRATOCASTOR, Type.ELECTRIC, Wood.INDIANWOOD));
        inventory.addGuitar(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 64222.0,new GuitarSpec(Builder.RAJU, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER));

        List<Guitar> guitars = inventory.searchGuitar(new GuitarSpec(Builder.RAJU, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER));
        for (Guitar guitar: guitars){
            System.out.println(guitar);
        }
        System.out.println(inventory);

    }
}
