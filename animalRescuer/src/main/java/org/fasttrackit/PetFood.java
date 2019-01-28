package org.fasttrackit;

import java.time.LocalDateTime;

public class PetFood {
    String name;
    double price;
    int quantity;
    LocalDateTime expiryDate;
    boolean available;


    public PetFood(String name) {
        this.name = name;
    }
}
