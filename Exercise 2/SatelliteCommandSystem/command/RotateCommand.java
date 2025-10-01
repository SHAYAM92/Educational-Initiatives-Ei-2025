package com.example.satellite.command;

import com.example.satellite.model.Satellite;

public class RotateCommand implements Command {
    private final Satellite satellite;
    private final String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        satellite.setOrientation(direction.toUpperCase());
        System.out.println("Orientation changed to " + direction.toUpperCase());
    }
}