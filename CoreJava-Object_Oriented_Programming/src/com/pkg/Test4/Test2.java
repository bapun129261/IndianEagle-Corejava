package com.pkg.Test4;

import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Random random = new Random();
        inventory.addInstrument(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 32322.0, new GuitarSpec(Builder.DURGA, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 6));
        /*inventory.addInstrument(Integer.toHexString(random.nextInt()).toUpperCase(), 32322.0, new GuitarSpec(Builder.DURGA, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 6));*/
        inventory.addInstrument(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 39822.0, new GuitarSpec(Builder.ABHI, Model.STRATOCASTOR, Type.ELECTRIC, Wood.ALDER, Wood.SITKA, 6));
        inventory.addInstrument(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 68522.0, new MandolinSpec(Builder.NARAYAN, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, Style.F));
        inventory.addInstrument(Integer.toHexString(random.ints().filter(i -> !(i <= 0)).findAny().getAsInt()).toUpperCase(), 98522.0, new MandolinSpec(Builder.RADHA, Model.STRATOCASTOR, Type.ELECTRIC, Wood.SITKA, Wood.INDIANWOOD, Style.A));
        inventory.addInstrument("RAJU123", 98522.0, new MandolinSpec(Builder.RAJU, Model.STRATOCASTOR, Type.ACOUSTIC, Wood.ALDER, Wood.INDIANWOOD, Style.F));
        InstrumentSpec spec = new GuitarSpec(Builder.ABHI, Model.STRATOCASTOR, Type.ELECTRIC, Wood.ALDER, Wood.SITKA, 6);
        InstrumentSpec spec1 = new MandolinSpec(Builder.RADHA, Model.STRATOCASTOR, Type.ELECTRIC, Wood.SITKA, Wood.INDIANWOOD, Style.A);
        List<Instrument> instruments = inventory.searchInstrument(spec1);
        for (Instrument instrument : inventory.getInstrumentList()) {
            System.out.println(instrument);
        }
        System.out.println("--------------------------------------------------------------------");
        for (Instrument instrument : instruments) {
            System.out.println(instrument);
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println(inventory.get("RAJU123"));

    }
}
