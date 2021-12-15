package services.payment.api.payment;

public class PayU {
    public void genenrateLink(){
        System.out.println("PayU link generated");
    }

    public void pay(){
        System.out.println("Paid using PayU");
    }

    public boolean status(){
        System.out.println("PayU status");
        return true;
    }
}
