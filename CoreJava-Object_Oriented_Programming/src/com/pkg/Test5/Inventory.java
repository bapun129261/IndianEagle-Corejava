package com.pkg.Test5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instrumentList;

    public Inventory() {
        instrumentList = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, Double price, InstrumentSpec spec) {
        instrumentList.add(new Instrument(serialNumber,price,spec));
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : instrumentList) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }


    public List<Instrument> searchInstrument(InstrumentSpec searchInstrument) {
        List<Instrument> searchedInstruments = new LinkedList<>();

        for (Instrument instrument : instrumentList) {
           if(instrument.getSpec().isMatchesInstrement(searchInstrument))
               searchedInstruments.add(instrument);
        }

        return searchedInstruments;
    }

    public List<Instrument> getInstrumentList() {
        return instrumentList;
    }
}
