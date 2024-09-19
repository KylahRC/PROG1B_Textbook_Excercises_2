package Ex10;

import java.util.Random;

public class DrugTests3 {
    public static void main(String[] args) {
        int[] employeeCount = new int[30];
        Random random = new Random();
        int lastTestedEmployee = -1;

        for (int week = 1; week <= 52; week++) {
            int testedEmployee;
            do {
                testedEmployee = 1 + random.nextInt(30);
                if (testedEmployee == lastTestedEmployee) {
                    System.out.println("Duplicate detected. Selecting a new number...");
                }
            } while (testedEmployee == lastTestedEmployee);

            lastTestedEmployee = testedEmployee;
            employeeCount[testedEmployee - 1]++;
            System.out.print(testedEmployee + " ");
            if (week % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\nEmployee testing count:");
        for (int i = 0; i < employeeCount.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employeeCount[i] + " times");
        }

        System.out.println("\nEmployees never tested:");
        for (int i = 0; i < employeeCount.length; i++) {
            if (employeeCount[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}

