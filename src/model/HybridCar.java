package model;

public class HybridCar extends Car {
    private double gasolineCapacity;
    private double gasolineConsume;
    private TypeGasoline typeGasoline;
    private TypeCharger typeCharger;
    private double batteryDuration;
    private double batteryConsume;

    public HybridCar(boolean newCar, double basePrice, double sellPrice, String mark, String model,
            String cilinderCapacity, double kilometers, String placa, int numDoors, boolean polarized, TypeCar typeCar,
            double gasolineCapacity, double gasolineConsume,
            TypeGasoline typeGasoline, TypeCharger typeCharger, double batteryDuration, double batteryConsume) {
        super(newCar, basePrice, sellPrice, mark, model, cilinderCapacity, kilometers, placa, numDoors, polarized,
                typeCar);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = gasolineConsume;
        this.typeGasoline = typeGasoline;
        this.typeCharger = typeCharger;
        this.batteryDuration = batteryDuration;
        this.batteryConsume = batteryConsume;
    }

}
