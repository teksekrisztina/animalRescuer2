package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Ion";
        dog.age = 2.6;
        dog.health = 10;
        dog.hungerLevel = 7;
        dog.wellBeing = 8;
        dog.favoriteFood = "canned beef";
        dog.favoriteRecreationalActivity = "walking";

        Owner owner = new Owner();
        owner.name = "Krisztina";
        owner.moneyAmount = 5.5;

        PetFood petFood = new PetFood("beef");

        petFood.price = 3.4;
        petFood.quantity = 3;
        petFood.expiryDate = LocalDateTime.now().minusMonths(2);
        petFood.available = true;

        RecreationalActivity recreationalActivity = new RecreationalActivity("walking");


        Vet vet = new Vet();
        vet.name = "Ziad";
        vet.specialization = "small animals";

        Game game = new Game();
        game.animal = dog;
        game.owner = owner;
        game.vet = vet;


    }
}
