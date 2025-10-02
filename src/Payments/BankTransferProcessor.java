package Payments;

import Abstractions.IPaymentProcessor;

public class BankTransferProcessor implements IPaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing payment of $" + amount + " via Bank Transfer.");
    }
}
