package ua.edu.ucu.apps.flowerstore.delivery;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
