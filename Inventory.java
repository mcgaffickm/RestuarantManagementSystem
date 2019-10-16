import java.util.*;
import java.text.*;
/**
 * The Inventory structure class
 * @author Michael McGaffick
 * @version 4/9/18
 */
public class Inventory
{
    //Declaration of variables
    ArrayList<Items> inventory;
    NumberFormat nf;
    StopWatch sw = new StopWatch();

    /**
     * Constructor for the inventory
     */
    public Inventory()
    {
        nf = NumberFormat.getCurrencyInstance();
        inventory = new ArrayList();
    }

    /**
     * Turns the parameters into an item to add to the array
     * @param name the name of the item
     * @param price the price of the item
     */
    public void add(String name, double price, int quantity)
    {
        if(price <= 0)
        {
            System.out.println("\fPlease enter a larger price than 0.");
        }
        else if (quantity <= 0)
        {
            System.out.println("\fPlease enter a larger quantity than 0.");
        }
        else
        {
            add(new Items(name, price, quantity));
        }
    }

    /**
     * Adds the given value to the inventory list
     * @param item the item to be added
     */
    public void add(Items item)
    {
        inventory.add(item);

        //Always sorts the list with a selection sort
        sw.start();
        sort();
        System.out.println("\fThe item list was sorted with an selected sort.  Time: " + 
            sw.stop() + "ms.\nYour sorted inventory: ");
        for(int j = 0; j < inventory.size(); j++){
            System.out.print(inventory.get(j).getName() + " ");
        }
        System.out.println();
    }

    /**
     * Returns the value at the location
     * @param location the location of the item to be found
     * @return the item found at the location
     */
    public Items get(int location)
    {
        return inventory.get(location);
    }

    /**
     * Returns the number of total items
     * @return the size of the inventory (how many items there are)
     */
    public int size()
    {
        return inventory.size();
    }

    /**
     * Searchs for a given item
     * @param name the name of the item to be found
     */
    public void search(String name)
    {
        boolean bool = true;

        //Linear search algorithm
        for(int j = 0; j < inventory.size(); j++)
        {
            if(inventory.get(j).getName().equals(name))
            {
                System.out.println("\fItem has been with a linear search at location: " + (j+1) + 
                    "\nName: " + inventory.get(j).getName() + " Price: " + nf.format(inventory.get(j).getPrice()) +
                    " Quantity: " + inventory.get(j).getQuantity());
                bool = false;
            }
        }
        if(bool)
        {
            System.out.println("\f" + name + " was not found.");
        }
    }

    /**
     * Searchs for a given item without the output
     * @param name the name of the item to be found
     */
    public int search2(String name)
    {
        //Linear search again
        for(int j = 0; j < inventory.size(); j++)
        {
            if(inventory.get(j).getName().equals(name))
            {
                return j;
            }
        }
        return -1;
    }

    /**
     * Removes the given item from the inventory list
     * @param name the item to be removed
     */
    public void remove(String name)
    {
        boolean bool = true;
        for(int j = 0; j < inventory.size(); j++)
        {
            if(inventory.get(j).getName().equals(name))
            {
                inventory.remove(j);
                System.out.println("\fItem: " + name + " has successfully been removed.");
                bool = false;
            }
        }
        if(bool)
        {
            System.out.println("\f" + name + " was not found.");
        }
    }

    /**
     * Sorts the list of items with a selection sort
     */
    public void sort()
    {
        //Selection sort algorithm
        String smallest = "";
        int locator = 0;
        Items temp;
        for(int j = 0; j < inventory.size()-1; j++)
        {
            locator = j;
            smallest = inventory.get(locator).getName();
            for(int i = j+1; i < inventory.size(); i++)
            {
                if(inventory.get(i).getName().compareTo(smallest) <= -1)
                {
                    smallest = inventory.get(i).getName();
                    locator = i;
                }
            }
            if(locator != j)
            {
                temp = inventory.get(j);
                inventory.set(j,inventory.get(locator));
                inventory.set(locator, temp); 
            }
        }
    }
}