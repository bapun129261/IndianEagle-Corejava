package com.pkg.Test4;

public class GuitarSpec extends InstrumentSpec {

    private int numStrings;


    public GuitarSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood,int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    @Override
    public boolean isMatchesInstrement(InstrumentSpec searchInstrument) {
        if (!(super.isMatchesInstrement(searchInstrument)))
            return false;
        if (numStrings != ((GuitarSpec) searchInstrument).getNumStrings())
            return false;
        return true;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" + super.toString()+
                ",numStrings=" + numStrings +
                '}';
    }


}
