package services.payment.adapter;

import model.PaymentStatus;
import services.payment.api.payment.PayU;
import services.payment.providerInterface.PaymentProvider;

public class PayUPayment implements PaymentProvider {

    PayU api = new PayU();

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
