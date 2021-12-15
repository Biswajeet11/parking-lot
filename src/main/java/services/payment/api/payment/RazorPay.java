package services.payment.api.payment;

import services.payment.providerInterface.RazorPayStatus;

public class RazorPay {
    public void genenrateLink(){
        System.out.println("RazorPay link generated");
    }

    public void pay(){
        System.out.println("Paid using RazorPay");
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.FAILED;
    }
}
