package Ex2;

import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        double[] numbers = new double[15];
        int numbersEnteredCounter = 0;
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 15 double values. Enter 99999 to quit:");

        while (numbersEnteredCounter < 15)
        {
            double input = scanner.nextDouble();
            if (input == 99999)
            {
                break;
            }
            numbers[numbersEnteredCounter] = input;
            total += input;
            numbersEnteredCounter++;
        }

        if (numbersEnteredCounter == 0)
        {
            System.out.println("Error: No numbers were entered.");
        } else
        {
            double average = total / numbersEnteredCounter;
            System.out.println("Number of values entered: " + numbersEnteredCounter);
            System.out.println("Average: " + average);

            for (int i = 0; i < numbersEnteredCounter; i++)
            {
                double distance = numbers[i] - average;
                System.out.println("Value: " + numbers[i] + ", Distance from average: " + distance);
            }
        }
    }
}
