package com.example.task3;

public class ShipMaintenance extends PortActivity implements ICapableOfEarning {

    private int numberOfShipsPerMonth;
    private double costOfServicingOneVessel;

    public ShipMaintenance(String name, int numberOfShipsPerMonth, double costOfServicingOneVessel) {
        super(name);
        this.numberOfShipsPerMonth = numberOfShipsPerMonth;
        this.costOfServicingOneVessel = costOfServicingOneVessel;
    }

    @Override
    public double getMonthlyIncome() {
        return numberOfShipsPerMonth * costOfServicingOneVessel;
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

}