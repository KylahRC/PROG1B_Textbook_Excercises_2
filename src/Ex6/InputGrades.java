package Ex6;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter ID for student #" + (i + 1) + ": ");
            students[i].setStudentID(scanner.nextLine());

            for (int j = 0; j < 5; j++) {
                CollegeCourse course = new CollegeCourse();
                System.out.print("Enter course ID #" + (j + 1) + ": ");
                course.setCourseID(scanner.nextLine());
                System.out.print("Enter credit hours for course #" + (j + 1) + ": ");
                course.setCreditHours(scanner.nextInt());
                System.out.print("Enter grade for course #" + (j + 1) + " (A, B, C, D, F): ");
                char grade;
                while (true) {
                    grade = scanner.next().charAt(0);
                    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
                        break;
                    } else {
                        System.out.print("Invalid grade. Enter grade for course #" + (j + 1) + " (A, B, C, D, F): ");
                    }
                }
                course.setGrade(grade);
                students[i].setCourse(course, j);
                scanner.nextLine(); // consume the newline
            }
        }

        scanner.close();
    }
}
