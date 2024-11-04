package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Pay " + price + " UAH with Credit card";
    }
}
