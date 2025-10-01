package com.example.satellite.factory;

import com.example.satellite.command.*;
import com.example.satellite.exception.InvalidCommandException;
import com.example.satellite.model.Satellite;

public class CommandFactory {
    private final Satellite satellite = Satellite.getInstance();

    public Command createCommand(String input) throws InvalidCommandException {
        String[] parts = input.split("\s+");
        String cmd = parts[0].toLowerCase();

        switch (cmd) {
            case "rotate":
                if (parts.length < 2) {
                    throw new InvalidCommandException("Rotate command requires a direction (NORTH/SOUTH/EAST/WEST).");
                }
                return new RotateCommand(satellite, parts[1]);
            case "activatepanels":
                return new ActivatePanelsCommand(satellite);
            case "deactivatepanels":
                return new DeactivatePanelsCommand(satellite);
            case "collectdata":
                return new CollectDataCommand(satellite);
            case "status":
                return new StatusCommand(satellite);
            default:
                throw new InvalidCommandException("Unknown command: " + input);
        }
    }
}