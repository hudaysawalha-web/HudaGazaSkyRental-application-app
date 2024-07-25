package javaapplication62;

class Apartment extends Property {
    private int floor;

    public Apartment(String address, String name, double size, int floor) {
        super(address, name, size);
        this.floor = floor;
    }

    @Override
    public double getRentalPrice() {
        return 1000 + (getSize() * 2) + (floor * 50);
    }
}
