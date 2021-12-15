package services.payment.adapter;

import model.PaymentStatus;
import services.payment.api.payment.Juspay;
import services.payment.providerInterface.PaymentProvider;

public class JuspayPayment implements PaymentProvider {
    Juspay api = new Juspay();

    @Override
    public void makeLink() {
        api.genenrateLink();
    }

    @Override
    public void pay() {
        api.pay();
    }

    @Override
    public PaymentStatus checkStatus() {
        api.status();
        return PaymentStatus.PAID;
    }
}
