package com.example.task3;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SeaPort implements INamed, ICapableOfEarning {

    private String name;

    public Set<PortActivity> getActivities() {
        return activities;
    }

    private final Set<PortActivity> activities = new HashSet<>(5);

    public SeaPort(String name) {
        this.name = name;
    }


    public void addActivites(PortActivity[] activites) {
        Collections.addAll(this.activities, activites);
    }

    @Override
    public void printName() {
        System.out.println("Port " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMonthlyIncome() {
        double finalIcome = 0;
        for (PortActivity activity : activities) {
            if (activity instanceof ICapableOfEarning) {
                finalIcome += ((ICapableOfEarning) activity).getMonthlyIncome();
            }
        }
        return finalIcome;
    }
}
