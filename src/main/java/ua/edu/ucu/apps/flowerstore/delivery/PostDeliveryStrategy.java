package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Post delivering of " + items.size() + " items";
    }
}