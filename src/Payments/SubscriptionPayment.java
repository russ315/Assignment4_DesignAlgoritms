package Payments;

import Abstractions.IPaymentProcessor;
import Abstractions.Payment;

public class SubscriptionPayment extends Payment {
    public SubscriptionPayment(IPaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Initiating subscription payment...");
        processor.process(amount);
    }
}
