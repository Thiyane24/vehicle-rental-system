import java.util.Scanner;

public class inputDetails {
    Scanner sc = new Scanner(System.in);
    public String vehicleType;
    public String vehicleBrand;

    //Constructor
    public inputDetails(String vehicleType, String vehicleBrand) {
        this.vehicleType = vehicleType;
        this.vehicleBrand = vehicleBrand;
    }

    //Getters and setters
    public String getVehicleType(){
        return this.vehicleType;
    }
    public String getVehicleBrand(){
        return this.vehicleBrand;
    }

    public void setVehicleType(){
        System.out.println("Enter Vehicle Type: ");
        this.vehicleType = sc.nextLine();
    }

    public void setVehicleBrand(){
        System.out.println("Enter Vehicle Brand: ");
        this.vehicleBrand = sc.nextLine();
    }
}
