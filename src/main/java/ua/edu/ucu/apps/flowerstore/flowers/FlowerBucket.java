package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }

        return price;
    }
}
