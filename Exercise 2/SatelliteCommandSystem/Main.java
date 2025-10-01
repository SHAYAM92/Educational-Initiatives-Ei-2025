package com.example.satellite;

import com.example.satellite.command.Command;
import com.example.satellite.exception.InvalidCommandException;
import com.example.satellite.factory.CommandFactory;
import com.example.satellite.invoker.SatelliteManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SatelliteManager manager = SatelliteManager.getInstance();
        CommandFactory factory = new CommandFactory();

        System.out.println("=== Satellite Command System ===");
        System.out.println("Type 'help' for commands, 'exit' to quit.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Shutting down Satellite System...");
                break;
            }

            if (input.equalsIgnoreCase("help")) {
                System.out.println("Available Commands:");
                System.out.println("  rotate <NORTH|SOUTH|EAST|WEST>");
                System.out.println("  activatePanels");
                System.out.println("  deactivatePanels");
                System.out.println("  collectData");
                System.out.println("  status");
                System.out.println("  exit");
                continue;
            }

            try {
                Command cmd = factory.createCommand(input);
                manager.executeCommand(cmd);
            } catch (InvalidCommandException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}