package Ex5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SalespersonDatabase {
    private static final int MAX_RECORDS = 20;
    private static Salesperson[] database = new Salesperson[MAX_RECORDS];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose an option: (1) Add (2) Delete (3) Change (4) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addRecord(scanner);
                    break;
                case 2:
                    deleteRecord(scanner);
                    break;
                case 3:
                    changeRecord(scanner);
                    break;
                case 4:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            displayDatabase();
        }
    }

    private static void addRecord(Scanner scanner) {
        if (count >= MAX_RECORDS) {
            System.out.println("Database is full.");
            return;
        }

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (database[i].getId() == id) {
                System.out.println("ID already exists.");
                return;
            }
        }

        System.out.print("Enter sales: ");
        double sales = scanner.nextDouble();
        database[count++] = new Salesperson(id, sales);
    }

    private static void deleteRecord(Scanner scanner) {
        if (count == 0) {
            System.out.println("Database is empty.");
            return;
        }

        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (database[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                database[i] = database[i + 1];
            }
            database[--count] = null;
        } else {
            System.out.println("ID not found.");
        }
    }

    private static void changeRecord(Scanner scanner) {
        if (count == 0) {
            System.out.println("Database is empty.");
            return;
        }

        System.out.print("Enter ID to change: ");
        int id = scanner.nextInt();
        Salesperson toChange = null;
        for (int i = 0; i < count; i++) {
            if (database[i].getId() == id) {
                toChange = database[i];
                break;
            }
        }

        if (toChange != null) {
            System.out.print("Enter new sales: ");
            double sales = scanner.nextDouble();
            toChange.setAnnualSales(sales);
        } else {
            System.out.println("ID not found.");
        }
    }

    private static void displayDatabase() {
        Salesperson[] sortedDatabase = new Salesperson[count];
        System.arraycopy(database, 0, sortedDatabase, 0, count);
        Arrays.sort(sortedDatabase, Comparator.comparingInt(Salesperson::getId));

        for (Salesperson sp : sortedDatabase) {
            System.out.println(sp);
        }
    }
}

