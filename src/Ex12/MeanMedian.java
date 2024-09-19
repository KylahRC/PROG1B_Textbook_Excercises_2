package Ex12;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];

        System.out.println("Enter nine integers:");
        for (int i = 0; i < 9; i++) {
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
        return numbers[numbers.length / 2];
    }
}
