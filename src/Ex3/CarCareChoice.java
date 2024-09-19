package Ex3;

import javax.swing.JOptionPane;

public class CarCareChoice
{
    public static void main(String[] args)
    {
        String[] services = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        double[] prices = {25.00, 22.00, 15.00, 5.00};
        boolean isMatch = false;
        int matchIndex = 0;

        String selection = JOptionPane.showInputDialog(null,
                "Please type the name of the service to see its price:\nOil Change\nTire Rotation\nBattery Check\nBrake Inspection");

        for (int i = 0; i < services.length; i++)
        {
            if (selection.equalsIgnoreCase(services[i]))
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
        } else
        {
            JOptionPane.showMessageDialog(null, "Sorry, no selection found!");
        }
    }
}

