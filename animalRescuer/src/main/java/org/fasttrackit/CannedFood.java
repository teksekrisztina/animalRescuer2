package org.fasttrackit;

public class CannedFood extends PetFood {

    private double canSize;

    public CannedFood(String name) {
        super(name);
    }

    public double getCanSize() {
        return canSize;
    }

    public void setCanSize(double canSize) {
        this.canSize = canSize;
    }
}
