package services.payment.providerInterface;

import model.PaymentStatus;

public interface PaymentProvider {

    public void makeLink();
    public void pay();
    public PaymentStatus checkStatus();

}