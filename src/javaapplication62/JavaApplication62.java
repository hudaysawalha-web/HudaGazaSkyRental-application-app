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


public class JavaApplication62 {
    public static void main(String[] args) {
        Property apartment = new Apartment("123 Street", "Good Apartment", 75.0, 3);
        Property house = new House("456 Avenue", "Cozy House", 120.0, 30.0);
        Property shop = new Shop("789 Boulevard", "Corner Shop", 50.0, true);

        Customer customer = new Customer("Huda Sawalha", "Huda.Sawalha@example.com");
        Owner owner = new Owner("John Doe", "John.Doe@example.com");

        rent(customer, owner, apartment, 18, new PayPal("Huda.Sawalha@example.com"));
    }

    public static void rent(Customer customer, Owner owner, Property property, int rentalPeriod, PaymentMethod paymentMethod) {
        Contract contract = new Contract(customer, owner, property, rentalPeriod, paymentMethod.getClass().getSimpleName());
        contract.printContract();
        paymentMethod.pay(contract.getTotalPrice());
    }
}


    

