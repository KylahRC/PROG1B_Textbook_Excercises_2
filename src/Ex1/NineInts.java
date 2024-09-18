package Ex1;

import java.util.Arrays;

public class NineInts
{
    public static void main(String args[])
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        String forward = Arrays.toString(numbers);
        String backward = Arrays.toString(reverseArray(numbers));

        System.out.println(forward);
        System.out.println(backward);

    }

    public static int[] reverseArray(int[] numbers)
    {
//        the ints needed are declared here bc its faster
        int i;
        int temp;
        int length = numbers.length;
//        its /2 because it only wants to go halfway
//        it swaps the first and last values, second and second last, etc
        for (i = 0; i < length / 2; i++)
        {
            temp = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = temp;
        }
        return numbers;
    }
}
