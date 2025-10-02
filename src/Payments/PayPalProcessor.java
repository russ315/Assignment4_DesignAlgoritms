package Payments;

import Abstractions.IPaymentProcessor;

public class PayPalProcessor implements IPaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}