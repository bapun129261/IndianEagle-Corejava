package com.pkg.Test4;

public enum Model {
    STRATOCASTOR;

    @Override
    public String toString() {
        switch (this) {
            case STRATOCASTOR:
                return "Stratocastor";
            default:
                return "";
        }

    }
}
