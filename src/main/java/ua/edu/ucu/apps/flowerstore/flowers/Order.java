package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    private double price;

    public double calculateTotalPrice() {
        double totPrice = 0;
        for (Item item : items) {
            totPrice += item.getPrice();
        }
        return totPrice;
    }

    public void addItem(Item item) {
        items.add(item);
        calculateTotalPrice();
    }

    void removeItem(Item item) {
        items.remove(item);
        calculateTotalPrice();
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }
}
