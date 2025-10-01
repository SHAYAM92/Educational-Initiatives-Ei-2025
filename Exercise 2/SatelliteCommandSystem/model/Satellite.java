package com.example.satellite.model;

public class Satellite {
    private static Satellite instance;

    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    private Satellite() {
        this.orientation = "NORTH";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public static Satellite getInstance() {
        if (instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public boolean isSolarPanelsActive() {
        return solarPanelsActive;
    }

    public void setSolarPanelsActive(boolean active) {
        this.solarPanelsActive = active;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void setDataCollected(int dataCollected) {
        this.dataCollected = dataCollected;
    }
}