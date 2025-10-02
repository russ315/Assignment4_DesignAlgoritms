import Abstractions.IPayment;
import Abstractions.Payment;
import Payments.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IPayment onlinePayPal = new OnlinePayment(new PayPalProcessor());
        onlinePayPal.makePayment(100.0);

        IPayment offlineBank = new OfflinePayment(new BankTransferProcessor());
        offlineBank.makePayment(250.0);

        IPayment subscriptionStripe = new SubscriptionPayment(new StripeProcessor());
        subscriptionStripe.makePayment(50.0);
    }
}