package com.example.satellite.command;

import com.example.satellite.model.Satellite;

public class StatusCommand implements Command {
    private final Satellite satellite;

    public StatusCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        System.out.println("Orientation: " + satellite.getOrientation() +
                ", Panels: " + (satellite.isSolarPanelsActive() ? "ACTIVE" : "INACTIVE") +
                ", Data Collected: " + satellite.getDataCollected());
    }
}