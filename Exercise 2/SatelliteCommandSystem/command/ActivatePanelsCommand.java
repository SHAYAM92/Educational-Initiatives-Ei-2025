package com.example.satellite.command;

import com.example.satellite.model.Satellite;

public class ActivatePanelsCommand implements Command {
    private final Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.setSolarPanelsActive(true);
        System.out.println("Solar panels activated.");
    }
}