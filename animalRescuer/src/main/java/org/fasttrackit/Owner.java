package org.fasttrackit;

public class Owner {
    private String name;
    private double moneyAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void  feed(Animal animal , PetFood petfood  ){

        System.out.println( name +  " just gave some " +  petfood.getName() + " to " +  animal.getName() );


    }

    public void play(Animal animal, RecreationalActivity recreationalActivity ){

        System.out.println( name + " plays with "  + animal.getName() +  " ball game " + recreationalActivity.getName() );



    }

}
