package model;

public class Vehicle {
    protected boolean newCar;
    protected double basePrice;
    protected double sellPrice;
    protected String mark;
    protected String model;
    protected String cilinderCapacity;
    protected double kilometers;
    protected String placa;

    public Vehicle(boolean newCar, double basePrice, double sellPrice, String mark, String model,
            String cilinderCapacity, double kilometers, String placa) {
        this.newCar = newCar;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.mark = mark;
        this.model = model;
        this.cilinderCapacity = cilinderCapacity;
        this.kilometers = kilometers;
        this.placa = placa;
    }

}
