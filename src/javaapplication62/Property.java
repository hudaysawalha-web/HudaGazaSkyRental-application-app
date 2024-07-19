
package javaapplication62;

/**
 *
 * @author huda sawalha
 */
abstract class Property {
    private String address;
    private String name;
    private double size;

    public Property(String address, String name, double size) {
        this.address = address;
        this.name = name;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public abstract double getRentalPrice();
}

