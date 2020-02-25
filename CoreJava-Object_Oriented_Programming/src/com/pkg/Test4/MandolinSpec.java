package com.pkg.Test4;

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean isMatchesInstrement(InstrumentSpec searchInstrument) {
      /*  System.out.println("sub MandolinSpec search @@@@");*/
        if (!(super.isMatchesInstrement(searchInstrument))) {
            return false;
        }
        if (style != ((MandolinSpec) searchInstrument).getStyle()) {

            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MandolinSpec{" +super.toString()+
                ",style=" + style +
                '}';
    }
}
