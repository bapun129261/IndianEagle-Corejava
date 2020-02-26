package com.pkg.Test5;

public enum InstrumentType {
    GUITAR, MANDOLIN, DOBRO, BASS, FIDDLE, BANJO;

    @Override
    public String toString() {
        switch (this) {
            case BASS:
                return "bass";
            case BANJO:
                return "banjo";
            case DOBRO:
                return "dobro";
            case FIDDLE:
                return "fiddle";
            case GUITAR:
                return "guitar";
            case MANDOLIN:
                return "mandolin";
            default:
                return "";
        }
    }
}
