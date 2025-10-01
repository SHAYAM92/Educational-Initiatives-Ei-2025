package com.example.satellite.command;

import com.example.satellite.model.Satellite;

public class CollectDataCommand implements Command {
    private final Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        if (satellite.isSolarPanelsActive()) {
            satellite.setDataCollected(satellite.getDataCollected() + 10);
            System.out.println("Data collected: " + satellite.getDataCollected() + " units.");
        } else {
            System.out.println("Cannot collect data. Solar panels are inactive.");
        }
    }
}