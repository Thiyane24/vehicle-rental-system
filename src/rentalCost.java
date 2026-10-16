import java.util.Scanner;

public class rentalCost {

    private Scanner sc = new Scanner(System.in);
    private int days;
    private double rentalPrice;

    // Constructor
    public rentalCost(int days, double rentalPrice) {
        this.days = days;
        this.rentalPrice = rentalPrice;
    }

    // Getters and Setters
    public void setDays() {
        System.out.println("Enter the number of days:");
        this.days = sc.nextInt();
    }

    public int getDays() {
        return this.days;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double getRentalPrice() {
        return this.rentalPrice;
    }


    public double getTotalCost() {
        return this.rentalPrice * this.days;
    }
}
