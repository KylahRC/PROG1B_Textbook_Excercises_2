package Ex16;

import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a planet name: ");
        String userInput = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].toLowerCase().equals(userInput)) {
                System.out.println("You entered: " + planets[i]);
                System.out.println(planets[i] + " is planet number " + (i + 1) + " from the sun.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid planet name. Please enter a valid planet name.");
        }

        scanner.close();
    }
}

