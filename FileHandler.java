import java.util.Scanner;
import java.io.*;
/**
 * A class that handles input and output to files
 * @author Michael McGaffick
 * @version 4/25/18
 */
public class FileHandler
{
    /**
     * Saves the current data from the inventory to its respective file
     */
    public static void saveInventory() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("SaveFiles/Inventory.txt"));
        for(int j = 0; j < Container.inv.size(); j++)
        {
            pw.println(Container.inv.get(j).getName() + " " + 
                Container.inv.get(j).getPrice() + " " + 
                Container.inv.get(j).getQuantity());
        }

        pw.close();
    }

    /**
     * Loads the inventory from the file, called at the startup of the program
     */
    public static void loadInventory() throws IOException
    {
        Scanner scInvFile = new Scanner(new File("SaveFiles/Inventory.txt"));
        Scanner scInv;
        while(scInvFile.hasNextLine())
        {
            String line = scInvFile.nextLine();
            scInv = new Scanner(line);
            Container.inv.add(scInv.next().toLowerCase(), scInv.nextDouble(), scInv.nextInt());
        }
    }

    /**
     * Saves the table map to the specified file
     * @param fileName the name of the file with extension that you wish to save the table map to
     */
    public static void saveTablemap(String fileName) throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("SaveFiles/" + fileName));
        for(int j = 0; j < Container.map.keyList.size(); j++)
        {
            pw.println(Container.map.keyList.get(j) + " " + Container.map.tables.get(Container.map.keyList.get(j)).getSize());
        }
        System.out.println("Your table map has been saved to file: SaveFiles/" + fileName);
        pw.close();
    }

    /**
     * Loads the table map from the specified file
     * @param fileName the name of the file where you wish to load the table map from
     */
    public static void loadTablemap(String fileName) throws IOException
    {
        Scanner scTabFile = new Scanner(new File("SaveFiles/" + fileName));
        Scanner scTab;
        while(scTabFile.hasNextLine())
        {
            String line = scTabFile.nextLine();
            scTab = new Scanner(line);
            Container.map.put(scTab.next(), new Table(scTab.nextInt()));
        }
        System.out.println("\fYour table map has been loaded from file: SaveFiles/" + fileName);
    }

    /**
     * Saves the receipts to a file based on system time
     */
    public static void saveReceipts() throws IOException
    {
        //Uses the system time to create the file name
        long time = System.currentTimeMillis();
        PrintWriter pw = new PrintWriter(new File("SaveFiles/" + time + ".txt"));
        for(int j = 1; j < Container.rl.size(); j++)
        {
            pw.println("Receipt: " + (j) + "\n\tName: " + Container.rl.get(j).getName() + "\n\tPrice: " + 
                Container.rl.get(j).getPrice() + "\n\tItems: " + 
                Container.rl.get(j).getItems());
        }
        System.out.println("\fYour receipts have been saved to the file: SaveFiles/" +time+ ".txt");
        pw.close();
    }
}
