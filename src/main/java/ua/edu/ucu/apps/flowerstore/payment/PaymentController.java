package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/credit_card")
    String getCreditCard(@RequestParam double price) {
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        if ("success".equals(creditCardPaymentStrategy.pay(price))) {
            return "Using Credit Card Payment";
        }
        return "Cannot pay";
    }

    @GetMapping("/paypal")
    String getPayPal(@RequestParam double price) {
        PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
        if ("success".equals(payPalPaymentStrategy.pay(price))) {
            return "Using PayPal Payment";
        }
        return "Cannot pay";
    }
}
