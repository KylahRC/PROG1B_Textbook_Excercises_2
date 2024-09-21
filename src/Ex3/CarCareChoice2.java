package Ex3;

import javax.swing.JOptionPane;

public class CarCareChoice2
{
    public static void main(String[] args)
    {
//        declarations
        String[] services = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        double[] prices = {25.00, 22.00, 15.00, 5.00};
        boolean isMatch = false;
        int matchIndex = 0;

        String selection = JOptionPane.showInputDialog(null,
                "Please type the first three characters of the service to see its price:\nOil Change\nTire Rotation\nBattery Check\nBrake Inspection");

//            checks if the input matches anything in the array
        for (int i = 0; i < services.length; i++)
        {
//            this gets the first 3 letters in the stuff they entered
//            tyops never happen in the first 3 letters, obviously
            if (selection.substring(0, 3).equalsIgnoreCase(services[i].substring(0, 3)))
            {
                isMatch = true;
                matchIndex = i;
                break;
            }
        }

        if (isMatch)
        {
            JOptionPane.showMessageDialog(null,
                    "You selected " + services[matchIndex] + "\nThe price for that service is $" + prices[matchIndex]);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry, no selection found!");
        }
    }
}

