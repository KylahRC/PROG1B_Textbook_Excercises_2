package Ex15;

import java.util.Scanner;

public class DayOfWeek {
    // Enumeration for the days of the week
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of days
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Prompt the user for a day
        System.out.print("Enter a day of the week: ");
        String input = scanner.next().toUpperCase();

        // Display business hours for the chosen day
        Day chosenDay = Day.valueOf(input);
        switch (chosenDay) {
            case SUNDAY:
                System.out.println("Business hours: 11 AM to 5 PM");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Business hours: 9 AM to 9 PM");
                break;
            case SATURDAY:
                System.out.println("Business hours: 10 AM to 6 PM");
                break;
            default:
                System.out.println("Invalid day entered.");
                break;
        }

        scanner.close();
    }
}

