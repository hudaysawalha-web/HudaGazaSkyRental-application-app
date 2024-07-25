package javaapplication62;

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
