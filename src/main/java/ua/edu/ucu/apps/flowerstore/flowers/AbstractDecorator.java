package ua.edu.ucu.apps.flowerstore.flowers;

public abstract class AbstractDecorator extends Item {
    private final Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
