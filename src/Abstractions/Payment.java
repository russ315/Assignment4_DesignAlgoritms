package Abstractions;

public abstract class Payment implements IPayment {
    protected IPaymentProcessor processor;

    public Payment(IPaymentProcessor processor) {
        this.processor = processor;
    }

    @Override
    public abstract void makePayment(double amount);
}
