package com.example.satellite.invoker;

import com.example.satellite.command.Command;

public class SatelliteManager {
    private static SatelliteManager instance;

    private SatelliteManager() { }

    public static SatelliteManager getInstance() {
        if (instance == null) {
            instance = new SatelliteManager();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute();
    }
}