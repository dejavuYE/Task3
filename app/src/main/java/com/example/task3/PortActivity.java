package com.example.task3;

public abstract class PortActivity implements INamed {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public PortActivity(String name) {
        this.name = name;
    }


}
