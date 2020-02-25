package com.pkg.Test2;

import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private Model model;
    private Type type;
    private Wood wood;


    public GuitarSpec(Builder builder, Model model, Type type, Wood wood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.wood = wood;

    }

    public boolean isMatchGuitar(GuitarSpec searchGuitar) {
        if (type != searchGuitar.getType())
            return false;
        if (builder != searchGuitar.getBuilder())
            return false;
        if (wood != searchGuitar.getWood())
            return false;
        if (model != searchGuitar.getModel())
            return false;

        return true;
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

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", model=" + model +
                ", type=" + type +
                ", wood=" + wood +
                '}';
    }
}
