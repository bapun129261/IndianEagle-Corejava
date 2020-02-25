package com.pkg.Test4;

public enum Style {
    A, F;

    @Override
    public String toString() {
        switch (this) {
            case A:
                return "a";
            case F:
                return "f";
            default:
                return "";
        }
    }
}
