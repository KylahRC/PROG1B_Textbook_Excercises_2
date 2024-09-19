package Ex7;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class BirthdayReminder {
    public static void main(String[] args) {
        final String SENTINEL = "ZZZ";
        final int MAX_FRIENDS = 10;
        String[] names = new String[MAX_FRIENDS];
        LocalDate[] birthdates = new LocalDate[MAX_FRIENDS];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        // Collecting names and birthdates
        while (count < MAX_FRIENDS) {
            System.out.print("Enter a name or ZZZ to quit: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            names[count] = name;

            System.out.print("Enter birthdate (YYYY-MM-DD) for " + name + ": ");
            try {
                LocalDate birthdate = LocalDate.parse(scanner.nextLine());
                birthdates[count] = birthdate;
                count++;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }

        // Displaying the count and names
        System.out.println("\nYou have entered " + count + " names.");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }

        // Querying birthdates
        while (true) {
            System.out.print("\nEnter a name to get the birthdate or ZZZ to quit: ");
            String queryName = scanner.nextLine();
            if (queryName.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(queryName)) {
                    System.out.println("Birthday of " + names[i] + " is " + birthdates[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("The name entered is not in the list.");
            }
        }
        scanner.close();
    }
}

