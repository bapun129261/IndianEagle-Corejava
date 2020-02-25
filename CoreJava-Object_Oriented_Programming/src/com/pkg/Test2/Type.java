package com.pkg.Test2;

public enum Type {
    ELECTRIC, ACOUSTIC;

    @Override
    public String toString() {
        switch (this) {
            case ELECTRIC:
                return "electric";
            case ACOUSTIC:
                return "acoustic";
            default:
                return "";
        }
    }
}
