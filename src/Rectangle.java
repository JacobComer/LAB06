import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Double width = null, height = null;

        System.out.print("Enter the width of the rectangle: ");
        do {
            if(in.hasNextDouble()) {
                width = in.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a valid width: ");
            }
            in.nextLine();
        } while(width == null);

        System.out.print("Enter the height of the rectangle: ");
        do {
            if(in.hasNextDouble()) {
                height = in.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a valid height: ");
            }
            in.nextLine();
        } while(height == null);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("\nResults:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length: " + diagonal);

        in.close();
    }
}