
//trying to push from local to remote...

import java.util.Scanner;

public class SwitchWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week (e.g., Monday, Tuesday): ");
        String day = scanner.nextLine().trim().toLowerCase(); // Convert input to lowercase for comparison

        switch (day) {
            case "monday":
                System.out.println("Start of the work week!");
                break;
            case "tuesday":
                System.out.println("Second day of the week.");
                break;
            case "wednesday":
                System.out.println("Midweek already!");
                break;
            case "thursday":
                System.out.println("Almost the weekend.");
                break;
            case "friday":
                System.out.println("End of the work week!");
                break;
            case "saturday":
                System.out.println("It's the weekend! Relax!");
                break;
            case "sunday":
                System.out.println("Enjoy your Sunday!");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}
