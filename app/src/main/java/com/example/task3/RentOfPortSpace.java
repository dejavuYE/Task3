package com.example.task3;

public class RentOfPortSpace extends PortActivity implements ICapableOfEarning {

    private double monthlyIncome;

    public RentOfPortSpace(String name, double monthlyIncome) {
        super(name);
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

}