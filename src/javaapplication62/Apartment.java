
package javaapplication62;

/**
 *
 * @author huda sawalha
 */
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

class House extends Property {
    private double gardenSize;

    public House(String address, String name, double size, double gardenSize) {
        super(address, name, size);
        this.gardenSize = gardenSize;
    }

    @Override
    public double getRentalPrice() {
        return 3000 + (getSize() * 2) + (gardenSize * 10);
    }
}

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

