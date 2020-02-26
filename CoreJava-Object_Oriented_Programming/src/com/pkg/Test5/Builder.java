package com.pkg.Test5;

public enum Builder {
    DURGA, RADHA, ABHI, RAJU, NARAYAN;

    @Override
    public String toString() {
        switch (this) {
            case ABHI:
                return "abhi";
            case DURGA:
                return "durga";
            case NARAYAN:
                return "narayan";
            case RADHA:
                return "radha";
            case RAJU:
                return "raju";
            default:
                return "";
        }
    }
}
