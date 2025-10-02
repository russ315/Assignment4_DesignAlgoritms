import Abstractions.Payment;
import Payments.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Payment onlinePayPal = new OnlinePayment(new PayPalProcessor());
        onlinePayPal.makePayment(100.0);

        Payment offlineBank = new OfflinePayment(new BankTransferProcessor());
        offlineBank.makePayment(250.0);

        Payment subscriptionStripe = new SubscriptionPayment(new StripeProcessor());
        subscriptionStripe.makePayment(50.0);
    }
}