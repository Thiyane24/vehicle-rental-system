
public class displayDetails {


    public void printRentalDetails(inputDetails input, rentalCost cost) {
        System.out.println("\nRENTAL RECEIPT ");
        System.out.println("Vehicle Type:  " + input.getVehicleType());
        System.out.println("Vehicle Brand: " + input.getVehicleBrand());
        System.out.println("Rental Period: " + cost.getDays() + " days");
        System.out.println("Price per Day: RM" + cost.getRentalPrice());
        System.out.println("Total Cost:    RM" + cost.getTotalCost());
     ;
    }
}
