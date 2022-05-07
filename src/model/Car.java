package model;

public class Car extends Vehicle {
    protected int numDoors;
    protected boolean polarized;
    protected TypeCar typeCar;

    public Car(boolean newCar, double basePrice, double sellPrice, String mark, String model, String cilinderCapacity,
            double kilometers, String placa, int numDoors, boolean polarized, TypeCar typeCar) {
        super(newCar, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa);
        this.numDoors = numDoors;
        this.polarized = polarized;
        this.typeCar = typeCar;
    }

}
