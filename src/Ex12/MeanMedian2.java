package Ex12;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers (up to 20):");
        int n = scanner.nextInt();

        if (n > 20) {
            System.out.println("Please enter a number up to 20.");
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The values entered are: " + Arrays.toString(numbers));

        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }

    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            return numbers[numbers.length / 2];
        }
    }
}
