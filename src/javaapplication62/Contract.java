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
class Contract {
    private Customer customer;
    private Property property;
    private int rentalPeriod;
    private String paymentMethod;
    private double totalPrice;

    public Contract(Customer customer, Property property, int rentalPeriod, String paymentMethod) {
        this.customer = customer;
        this.property = property;
        this.rentalPeriod = rentalPeriod;
        this.paymentMethod = paymentMethod;
        this.totalPrice = property.getRentalPrice() * rentalPeriod;
    }
    
        public double GetTotalPrice()
    {
        return totalPrice;
    }

    public void printContract() {
        System.out.println("Contract Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Property: " + property.getName());
        System.out.println("Rental Period: " + rentalPeriod + " months");
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Total Price: " + totalPrice);
    }
}