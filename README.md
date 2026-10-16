# Vehicle Rental System (Java)

A simple console-based Java application that allows users to register a vehicle rental, calculates costs dynamically based on the vehicle type, and prints a formatted receipt.

## How it Works
The application runs in a command-line menu loop:
1. **Option 1 (Rent a vehicle):** Prompts for vehicle details, automatically assigns rates (RM 150/day for Cars, RM 75/day for Bikes), calculates total pricing, and prints a receipt.
2. **Option 2 (Exit):** Cleanly closes the program.

## Class Architecture & Structure
The project splits responsibilities across four custom classes to keep data, business logic, and user interaction separate:
- **`Main`**: Controls the program flow using a menu loop (`while`), routes inputs, and matches vehicle types to pricing rules.
- **`inputDetails`**: Manages data collection for the vehicle's profile (`vehicleType` and `vehicleBrand`).
- **`rentalCost`**: Handles numerical data (`days`, `rentalPrice`) and dynamically calculates total billing using `getTotalCost()`.
- **`displayDetails`**: Acts as the output formatter (the printer) that reads data from other objects to output the terminal receipt.

## Code Setup & Compilation
Ensure all four `.java` files are saved in the same directory (folder) so Java can automatically link them without manual import paths.

### Compilation
Open your terminal or command prompt inside the project folder and run:

```bash
javac Main.java inputDetails.java rentalCost.java displayDetails.java
