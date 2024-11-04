package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "DHL delivery of " + items.size() + " items";
    }
}