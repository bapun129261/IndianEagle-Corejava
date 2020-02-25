package com.pkg.Test4;

public abstract class InstrumentSpec {
    private Builder builder;
    private Model model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, Model model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public boolean isMatchesInstrement(InstrumentSpec searchInstrument) {

        if (type != searchInstrument.getType())
            return false;
        if (builder != searchInstrument.getBuilder())
            return false;
        if (backWood != searchInstrument.getBackWood())
            return false;
        if (topWood != searchInstrument.getTopWood())
            return false;
        if (model != searchInstrument.getModel())
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "builder=" + builder +
                ", model=" + model +
                ", type=" + type +
                ", backWood=" + backWood +
                ", topWood=" + topWood ;

    }
}
