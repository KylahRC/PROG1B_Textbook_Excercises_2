package Ex8;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        String[] names = new String[30];
        String[] phoneNumbers = new String[30];
        int count = 10;

        // Assign names and phone numbers for the first 10 people
        names[0] = "Alice"; phoneNumbers[0] = "123-456-7890";
        names[1] = "Bob"; phoneNumbers[1] = "234-567-8901";
        names[2] = "Charlie"; phoneNumbers[2] = "345-678-9012";
        names[3] = "David"; phoneNumbers[3] = "456-789-0123";
        names[4] = "Eve"; phoneNumbers[4] = "567-890-1234";
        names[5] = "Frank"; phoneNumbers[5] = "678-901-2345";
        names[6] = "Grace"; phoneNumbers[6] = "789-012-3456";
        names[7] = "Hank"; phoneNumbers[7] = "890-123-4567";
        names[8] = "Ivy"; phoneNumbers[8] = "901-234-5678";
        names[9] = "Jack"; phoneNumbers[9] = "012-345-6789";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name (or 'quit' to exit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println("Phone number: " + phoneNumbers[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                if (count < 30) {
                    System.out.print("Name not found. Enter phone number for " + name + ": ");
                    String phoneNumber = scanner.nextLine();
                    names[count] = name;
                    phoneNumbers[count] = phoneNumber;
                    count++;
                } else {
                    System.out.println("The phone directory is full. Cannot add more entries.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
