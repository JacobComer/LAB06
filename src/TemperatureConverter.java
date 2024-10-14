import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in C: ");
        boolean done = false;

        do {
            if(in.hasNextDouble()) {
                double celsius = in.nextDouble();
                if (celsius < -273.15) {
                    System.out.println("Invalid input: Temperature cannot be below absolute zero.");
                } else {
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                }
                done = true;
            } else {
                System.out.println("Invalid input: Temperature is incorrect.Please enter a valid input.");
            }
            in.nextLine();
        } while (!done);


        in.close();
    }


}

