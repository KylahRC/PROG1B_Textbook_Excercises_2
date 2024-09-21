package Ex3;

import javax.swing.JOptionPane;

public class CarCareChoice
{
    public static void main(String[] args)
    {
//        declarations
        String[] servicesOffered = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        double[] prices = {25.00, 22.00, 15.00, 5.00};
        boolean isMatch = false;
        int matchIndex = 0;

//        place for user to enter what they want
        String selection = JOptionPane.showInputDialog(null,
                "Please type the name of the service to see its price:\nOil Change\nTire Rotation\nBattery Check\nBrake Inspection");

//        loop to cycle through the array
        for (int i = 0; i < servicesOffered.length; i++)
        {
//            checks if the input matches anything in the array
            if (selection.equalsIgnoreCase(servicesOffered[i]))
            {
                isMatch = true;
                matchIndex = i;
                break;
            }
        }

        if (isMatch)
        {
            JOptionPane.showMessageDialog(null,
                    "You selected " + servicesOffered[matchIndex] + "\nThe price for that service is $" + prices[matchIndex]);
        } else
        {
            JOptionPane.showMessageDialog(null, "Sorry, no selection found!");
        }
    }
}

