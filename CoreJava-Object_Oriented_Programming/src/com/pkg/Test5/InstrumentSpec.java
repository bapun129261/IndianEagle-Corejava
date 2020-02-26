package com.pkg.Test5;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map<String, Enum> properties;

    public InstrumentSpec(Map<String, Enum> properties) {
        if (!(properties.isEmpty()))
            this.properties = properties;
        else
            this.properties = new HashMap<>();
    }


    public Enum getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Enum> getProperties() {
        return properties;
    }


    public boolean isMatchesInstrement(InstrumentSpec searchInstrument) {
        for (String propertyName : searchInstrument.properties.keySet()) {
            if (!(getProperty(propertyName).equals(searchInstrument.getProperty(propertyName)))) {
                return false;
            }
        }
        return true;
    }


}
