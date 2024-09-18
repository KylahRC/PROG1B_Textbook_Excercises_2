package Ex2;

import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String args[])
    {
        double[] numArray = new double[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number (99999 to exit): ");
        String numberEntered = scanner.nextLine();

        switch (numberEntered)
        {
            case "99999":
                System.exit(0);

            default:

                System.out.println("Enter number (99999 to exit): ");
                numberEntered = scanner.nextLine();

                switch (numberEntered)
                {
                    case "99999":
                        System.exit(0);

                    default:
                        double doubleNumberEntered = Double.parseDouble(numberEntered);
                        int count = 0;

                        numArray[count] = doubleNumberEntered;

                        double total = ++doubleNumberEntered;
                        double average = (total / count);

                        double distance = doubleNumberEntered - average;

                        System.out.println("Count: " + count);
                        System.out.println("Number entered: " + doubleNumberEntered);
                        System.out.println("Average: " + doubleNumberEntered);
                        System.out.println("Distance from average: " + distance);
                }

        }
    }


}
