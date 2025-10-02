package Payments;

import Abstractions.IPaymentProcessor;
import Abstractions.Payment;

public class OfflinePayment extends Payment {
    public OfflinePayment(IPaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Initiating offline payment...");
        processor.process(amount);
    }
}