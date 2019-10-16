import java.util.ArrayList;
import java.util.Scanner;
/**
 * Holds the receipts of when a customer purchases an item
 * @author Michael McGaffick
 * @version 4/9/18
 */
public class Receipts
{
    private String customerName;
    private ArrayList<Items> purchases = new ArrayList();
    private double total;
    /**
     * Constructor for receipts
     * @param name the name of the customer
     * @param items to be added (A blank receipt should also work)
     */
    public Receipts(String name, String items)
    {
        customerName = name;
        String temp;
        int location;
        Scanner sc = new Scanner(items);
        while(sc.hasNext())
        {
            temp = sc.next();
            location = Container.inv.search2(temp);

            //Error checking to make sure the items exist
            if(location != -1){
                if(Container.inv.get(location).getQuantity() != 0){
                    purchases.add(Container.inv.get(location));
                    Container.inv.get(location).subtract();
                }
                else
                {
                    System.out.println("\fItem: " + temp + " is not available, please restock inventory.");
                }
            }
            else
            {
                System.out.println("\fItem: " + temp + " was not found, please try again.");
            }
        }
        calculateTotal();
    }

    /**
     * Action of buying an item, adds item to receipt
     * @param item the item that was bought
     */
    public void buy(String item)
    {
        int location = Container.inv.search2(item);

        //Error checking for the item
        if(location != -1){
            if(Container.inv.get(location).getQuantity() != 0){
                purchases.add(Container.inv.get(location));
                Container.inv.get(location).subtract();
                System.out.println("The item was successfully added.");
            }
            else
            {
                System.out.println("\fItem: " + item + " is not available, please restock inventory.");
                calculateTotal();
            }
        }
        else
        {
            System.out.println("\fItem: " + item + " was not found, please try again.");
        }
        calculateTotal();
    }

    /**
     * Removes the specified item from a receipt, but does not add back to inventory
     * @param item the item to be removed
     */
    public void remove(String item)
    {
        int loc = -1;
        for(int j = 0; j < purchases.size();j++)
        {
            if(purchases.get(j).getName().equals(item))
            {
                loc = j;
            }
        }

        //Error checking
        if(loc == -1)
        {
            System.out.println("Item was not found.");
        }
        else
        {
            total =  total - purchases.get(loc).getPrice();
            purchases.remove(loc);
            System.out.println("The item was successfully removed.");
        }
    }

    /**
     * Calculates the total price
     */
    public void calculateTotal()
    {
        total = 0;
        for(int j = 0; j < purchases.size(); j++)
        {
            total = total + purchases.get(j).getPrice();
        }
    }

    /**
     * Returns the receipt's price
     * @return a double of the price
     */
    public double getPrice()
    {
        return total;
    }

    /**
     * Returns the receipt's names
     * @return a string of the customer's name
     */
    public String getName()
    {
        return customerName;
    }

    /**
     * Returns the receipt's items
     * @return a string of the items on the receipt
     */
    public String getItems()
    {
        sort();
        String line = "";
        for(int j = 0; j < purchases.size(); j++)
        {
            line = line + purchases.get(j).getName() + " ";
        }
        return line;
    }

    /**
     * Sorts the items in a receipt by name
     */
    public void sort()
    {
        String smallest = "";
        int locator = 0;
        Items temp;

        //Selection sort
        for(int j = 0; j < purchases.size()-1; j++)
        {
            locator = j;
            smallest = purchases.get(locator).getName();
            for(int i = j+1; i < purchases.size(); i++)
            {
                if(purchases.get(i).getName().compareTo(smallest) <= -1)
                {
                    smallest = purchases.get(i).getName();
                    locator = i;
                }
            }
            if(locator != j)
            {
                temp = purchases.get(j);
                purchases.set(j,purchases.get(locator));
                purchases.set(locator, temp); 
            }
        }
    }
}
