/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author huda sawalha
 */
interface PaymentMethod {
    void pay(double amount);
}

class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
public class JavaApplication62 {

  
    public static void main(String[] args) {
        Property apartment = new Apartment("123 Street", "Good Apartment", 75.0, 3);
        Property house = new House("456 Avenue", "Cozy House", 120.0, 30.0);
        Property shop = new Shop("789 Boulevard", "Corner Shop", 50.0, true);

        Customer customer = new Customer("Huda Sawalha", "Huda.Sawalha@example.com");

        Contract apartmentContract = new Contract(customer, apartment, 18, "visa");
        apartmentContract.printContract();

        PaymentMethod paymentMethod = new PayPal("Huda.Sawalha@example.com");
        paymentMethod.pay(apartmentContract.GetTotalPrice());
    }
}

    

