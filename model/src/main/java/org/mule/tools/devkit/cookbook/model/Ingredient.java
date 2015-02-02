package org.mule.tools.devkit.cookbook.model;

import java.util.Date;

/**
 * Created by Mulesoft.
 */
public class Ingredient extends CookBookEntity {

    private double quantity;
    private UnitType unit;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public UnitType getUnit() {
        return unit;
    }

    public void setUnit(UnitType unit) {
        this.unit = unit;
    }
}
