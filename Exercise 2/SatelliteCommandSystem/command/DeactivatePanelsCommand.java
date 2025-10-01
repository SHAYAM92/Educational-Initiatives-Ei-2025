package com.example.satellite.command;

import com.example.satellite.model.Satellite;

public class DeactivatePanelsCommand implements Command {
    private final Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.setSolarPanelsActive(false);
        System.out.println("Solar panels deactivated.");
    }
}