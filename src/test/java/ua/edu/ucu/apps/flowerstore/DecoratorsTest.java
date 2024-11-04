package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.flowers.PaperDecorator;
import ua.edu.ucu.apps.flowerstore.flowers.RibbonDecorator;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerBucket;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerPack;

import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.Random;

public class DecoratorsTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        Flower flower = new Flower();
        flower.setPrice(price);

        FlowerBucket fb = new FlowerBucket();

        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        fb.add(flowerPack);

        Item item = fb;
        item = new RibbonDecorator(item);
        item = new PaperDecorator(item);

        Assertions.assertTrue(item.getPrice() >= price * quantity);
    }
}