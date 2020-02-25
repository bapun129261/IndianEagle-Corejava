package com.pkg.Test4;

public enum Wood {
    ALDER, SITKA, INDIANWOOD;

    @Override
    public String toString() {
        switch (this) {
            case ALDER:
                return "alder";
            case SITKA:
                return "sitka";
            case INDIANWOOD:
                return "indanwood";

            default:
                return "";
        }
    }
}
