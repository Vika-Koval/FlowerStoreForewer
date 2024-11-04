package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;
    public abstract double getPrice();
}
