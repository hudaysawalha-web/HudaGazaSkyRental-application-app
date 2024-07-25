package javaapplication62;

class Shop extends Property {
    private boolean hasWarehouse;

    public Shop(String address, String name, double size, boolean hasWarehouse) {
        super(address, name, size);
        this.hasWarehouse = hasWarehouse;
    }

    @Override
    public double getRentalPrice() {
        return 5000 + (getSize() * 5) + (hasWarehouse ? 500 : 0);
    }
}
