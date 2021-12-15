package services.payment.api.payment;

public class Juspay {

    public void genenrateLink(){
        System.out.println("Juspay link generated");
    }

    public void pay(){
        System.out.println("Paid using Juspay");
    }

    public boolean status(){
        System.out.println("Juspay status");
        return true;
    }
}
