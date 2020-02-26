package com.pkg.Test5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        InstrumentSpec customSpec = null, customSpec2 = null, customSpec3 = null, customSpec4 = null, customSpec5 = null;
        Map<String, Enum> properties = null, properties2 = null, properties3 = null, properties4 = null, properties5 = null;

        properties = new HashMap<>();
        properties.put("InstrumentType", InstrumentType.BANJO);
        properties.put("Builder", Builder.ABHI);
        properties.put("Type", Type.ELECTRIC);
        properties.put("Model", Model.STRATOCASTOR);
        properties.put("TopWood", Wood.INDIANWOOD);
        properties.put("BackWood", Wood.INDIANWOOD);
        customSpec = new InstrumentSpec(properties);

        properties2 = new HashMap<>();
        properties2.put("InstrumentType", InstrumentType.BASS);
        properties2.put("Builder", Builder.DURGA);
        properties2.put("Type", Type.ACOUSTIC);
        properties2.put("Model", Model.STRATOCASTOR);
        properties2.put("TopWood", Wood.ALDER);
        properties2.put("BackWood", Wood.INDIANWOOD);
        customSpec2 = new InstrumentSpec(properties2);


        properties3 = new HashMap<>();
        properties3.put("InstrumentType", InstrumentType.BASS);
        properties3.put("Builder", Builder.NARAYAN);
        properties3.put("Type", Type.ACOUSTIC);
        properties3.put("Model", Model.STRATOCASTOR);
        properties3.put("TopWood", Wood.ALDER);
        properties3.put("BackWood", Wood.INDIANWOOD);
        customSpec3 = new InstrumentSpec(properties2);


        inventory.addInstrument("ABHI123", 898565.33, customSpec);
        inventory.addInstrument("DURGA123", 698565.33, customSpec2);
        inventory.addInstrument("NARAYAN123", 598565.33, customSpec3);
        inventory.addInstrument("NARAYAN123NEW", 55565.33, customSpec);

        List<Instrument> instrumentList = inventory.searchInstrument(customSpec);

        for (Instrument instrument : instrumentList) {
            System.out.println("SerialNumber :"+instrument.getSerialNumber());
            System.out.println("Price : $"+instrument.getPrice());
            System.out.println("Builder :"+instrument.getSpec().getProperty("Builder"));
            System.out.println("Type :"+instrument.getSpec().getProperty("Type"));
            System.out.println("Model :"+instrument.getSpec().getProperty("Model"));
            System.out.println("TopWood :"+instrument.getSpec().getProperty("TopWood"));
            System.out.println("BackWood :"+instrument.getSpec().getProperty("BackWood"));
            System.out.println("--------------------------------------------------------------------------");
        }
        /*  System.out.println(inventory.get("DURGA123"));*/

    }
}
