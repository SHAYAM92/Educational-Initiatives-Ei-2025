# Satellite Command System

A console-based Java application simulating a satellite control system in orbit. Users can control satellite orientation, activate/deactivate solar panels, and collect data. The project demonstrates **OOP, SOLID principles, and design patterns** (Command, Singleton, Factory).

---

## Table of Contents

- [Features](#features)
- [Design Patterns Used](#design-patterns-used)
- [Project Structure](#project-structure)
- [Setup & Run](#setup--run)
- [Commands](#commands)
- [Sample Session](#sample-session)
- [Future Enhancements](#future-enhancements)

---

## Features

- **Rotate Satellite**: Change orientation (North, South, East, West).  
- **Activate/Deactivate Solar Panels**: Control power state.  
- **Collect Data**: Collect data only if solar panels are active.  
- **View Status**: Display current orientation, solar panel state, and collected data.  
- **Command-line Interface**: Interactive console input.  
- **Error Handling**: Handles invalid commands gracefully.  

**SOLID Principles Implemented:**

- **Single Responsibility**: Each class has a specific role.  
- **Open/Closed**: Easily extend commands using the `CommandFactory`.  
- **Liskov Substitution**: Commands follow the same interface.  
- **Interface Segregation**: Command interface is minimal.  
- **Dependency Inversion**: High-level `SatelliteManager` depends on `Command` interface.  

---

## Design Patterns Used

- **Command Pattern** – Encapsulates each operation (`RotateCommand`, `CollectDataCommand`) as an object.  
- **Singleton Pattern** – `Satellite` and `SatelliteManager` have a single instance to maintain consistent state.  
- **Factory Pattern** – `CommandFactory` creates command objects dynamically from user input.  

---