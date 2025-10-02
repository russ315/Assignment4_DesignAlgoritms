package Payments;

import Abstractions.IPaymentProcessor;
import Abstractions.Payment;

public class OnlinePayment extends  Payment {
    public OnlinePayment(IPaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Initiating online payment...");
        processor.process(amount);
    }
}
