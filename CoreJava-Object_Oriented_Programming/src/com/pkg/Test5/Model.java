package com.pkg.Test5;

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
