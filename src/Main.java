import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opt = new Scanner(System.in);

        char option = '0';


        while(option != '2') {
            System.out.println("\nSelect an option:\n1. Rent a vehicle\n2. Exit");
            option = opt.next().charAt(0);

            if (option == '1') {
                // Get vehicle details from user
                inputDetails input = new inputDetails("", "");
                input.setVehicleType();
                input.setVehicleBrand();

                // Set price based on type
                double price = 0;
                if (input.getVehicleType().equalsIgnoreCase("car")) {
                    price = 150.0;
                } else if (input.getVehicleType().equalsIgnoreCase("bike")) {
                    price = 75.0;
                }else if (input.getVehicleType().equalsIgnoreCase("truck")) {
                    price = 250.0;
                }else{
                    System.out.println("Invalid input");
                }

                // Get number of days from user
                rentalCost cost = new rentalCost(0, price);
                cost.setDays();

                // Print the final receipt
                displayDetails printer = new displayDetails();
                printer.printRentalDetails(input, cost);
            }
            else if(option == '2'){
                System.out.println("Exiting the program. Thank you!");
            }
            else {
                System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }

        opt.close();
    }
}
