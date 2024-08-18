import java.util.Scanner;

public class metric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters, miles, feet, inches;

        System.out.println("Enter measurement in meters: ");
        if (scanner.hasNextDouble()) {
            meters = scanner.nextDouble();
            if (meters >= 0) {
                miles = meters * 0.000621;
                feet = meters * 3.281;
                inches = meters * 39.37;

                System.out.println("Measurement in miles: " + miles);
                System.out.println("Measurement in feet: " + feet);
                System.out.println("Measurement in inches: " + inches);
            } else {
                System.out.println("invalid: Enter a positive number");
            }
        }
        else {
            System.out.println("Invalid: enter a number");
        }
    }
}
