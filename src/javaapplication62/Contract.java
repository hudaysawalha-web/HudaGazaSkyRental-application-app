package javaapplication62;

class Contract {
    private Customer customer;
    private Owner owner;
    private Property property;
    private int rentalPeriod;
    private String paymentMethod;
    private double totalPrice;

    public Contract(Customer customer, Owner owner, Property property, int rentalPeriod, String paymentMethod) {
        this.customer = customer;
        this.owner = owner;
        this.property = property;
        this.rentalPeriod = rentalPeriod;
        this.paymentMethod = paymentMethod;
        this.totalPrice = property.getRentalPrice() * rentalPeriod;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void printContract() {
        System.out.println("Contract Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Owner: " + owner.getName());
        System.out.println("Property: " + property.getName());
        System.out.println("Rental Period: " + rentalPeriod + " months");
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Total Price: " + totalPrice);
    }
}
