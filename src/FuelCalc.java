import java.util.Scanner;

public class FuelCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double gallonsInTank = null;
        Double fuelEfficiency = null;
        Double gasPrice = null;
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons max: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
            } else {
                System.out.println("Please enter a valid number for gallons max.");
            }
            in.nextLine();
        }
        while (gallonsInTank == null);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
            } else {
                System.out.println("Please enter a valid number for fuel efficiency.");
            }
            in.nextLine();
        }
        while (fuelEfficiency == null);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
            } else {
                System.out.println("Please enter a valid number for gas price.");
            }
            in.nextLine();
        }
        while (gasPrice == null);
        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        double distanceWithCurrentGas = gallonsInTank * fuelEfficiency;

        System.out.println("\nCost per 100 miles: $ " + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distanceWithCurrentGas + " miles");

        in.close();
    }
}
