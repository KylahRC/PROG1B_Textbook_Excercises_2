package Ex14;

import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) {
        // Initialize the 2D array with course details
        String[][] courses = {
                {"CIS101", "Mon 9 am", "Khan"},
                {"CIS102", "Tue 10 am", "Smith"},
                {"CIS103", "Wed 11 am", "Johnson"},
                {"CIS101", "Thu 1 pm", "Khan"},
                {"CIS104", "Fri 2 pm", "Lee"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course name: ");
        String courseName = scanner.nextLine();

        boolean courseFound = false;

        // Search for the course in the array
        for (int i = 0; i < courses.length; i++) {
            if (courses[i][0].equalsIgnoreCase(courseName)) {
                System.out.println("Course: " + courses[i][0] + ", Time: " + courses[i][1] + ", Instructor: " + courses[i][2]);
                courseFound = true;
            }
        }

        if (!courseFound) {
            System.out.println("Error: Course not found.");
        }

        scanner.close();
    }
}

