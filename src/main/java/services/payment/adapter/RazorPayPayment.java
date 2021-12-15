package services.payment.adapter;

import model.PaymentStatus;
import services.payment.api.payment.RazorPay;
import services.payment.providerInterface.PaymentProvider;
import services.payment.providerInterface.RazorPayStatus;

public class RazorPayPayment implements PaymentProvider {
    RazorPay api = new RazorPay();

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
        if(api.checkStatus() == RazorPayStatus.FAILED){
            return PaymentStatus.CANCELLED;
        }
        return PaymentStatus.PAID;
    }
}
