package com.pkg.Test4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instrumentList;

    public Inventory() {
        instrumentList = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, Double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        instrumentList.add(instrument);
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
            if (searchInstrument instanceof GuitarSpec) {
                if (instrument.getSpec() instanceof GuitarSpec) {
                    if (instrument.getSpec().isMatchesInstrement(searchInstrument)) {
                        searchedInstruments.add(instrument);
                    }
                } else continue;

            } else if (searchInstrument instanceof MandolinSpec) {
                if (instrument.getSpec() instanceof MandolinSpec) {
                    if (instrument.getSpec().isMatchesInstrement(searchInstrument)) {
                        searchedInstruments.add(instrument);
                    }
                } else continue;

            }
        }

        return searchedInstruments;
    }

    public List<Instrument> getInstrumentList() {
        return instrumentList;
    }
}
