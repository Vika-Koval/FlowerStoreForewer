package ua.edu.ucu.apps.flowerstore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeliveryController {
    Delivery delivery;
    public DeliveryController() {
        this.delivery = new DHLDeliveryStrategy();
    }

    @GetMapping("/delivery")
    public String getDelivery() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
        delivery.deliver(items);
        return "Delivery done";
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
