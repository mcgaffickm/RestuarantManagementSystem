import java.io.*;
import java.util.Scanner;
/**
 * Main class that begins the program
 * @author Michael McGaffick
 * @version 4/16/18
 */
public class Main
{
    /**
     * The main method to be called upon in order to start the program
     * @param args not used
     */
    public static void main(String args[])
    {
        //Intializes all start objects
        Container.start();
        
        //Loads the inventory
        try
        {
            FileHandler.loadInventory();
            System.out.println("\f");
        }
        catch(Exception ex)
        {
            System.out.println("\fLoading exception has occurred.  Your inventory data has not been loaded!" +
                "\nPlease correct any errors, make sure the file is present, and try again.");
        }

        //Starts the home form
        Container.hf.setVisible(true);
    }

}
