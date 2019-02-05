package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Ion");

        dog.setAge(2.6);


        dog.setHealth(10);


        dog.setHungerLevel(7);


        dog.setWellBeing(8);


        dog.setFavoriteFood("canned beef");


        dog.setFavoriteRecreationalActivity("walking");

        dog.setFurType("long");


        Owner owner = new Owner();

        owner.setName("Krisztina");


        owner.setMoneyAmount(5.5);

        CannedFood petFood = new CannedFood("beef");
        petFood.setPrice(3.4);


        petFood.setQuantity(3);

        LocalDateTime expiryDate = LocalDateTime.now().minusMonths(2);
        petFood.setExpiryDate(expiryDate);

        petFood.setAvailable(true);

        petFood.setCanSize(2);


        RecreationalActivity recreationalActivity = new RecreationalActivity("walking");
        recreationalActivity.setName("walking");

        Vet vet = new Vet();

        vet.setName("Ziad");


        vet.setSpecialization("small animals");

        Game game = new Game();

        game.setAnimal(dog);


        game.setOwner(owner);


        game.setVet(vet);

        owner.feed(dog, petFood);
        owner.play(dog, recreationalActivity);
    }


}
