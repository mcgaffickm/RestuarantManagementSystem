import java.text.*;
import java.util.ArrayList;
/**
 * The receipt listing structure class to manage receipts
 * @author Michael McGaffick
 * @version 4/24/18
 */
public class ReceiptListing
{
    //Declaration of variables
    private ArrayList<Receipts> list;
    StopWatch sw = new StopWatch();
    NumberFormat nf;

    /**
     * Constructor for this structure class
     */
    public ReceiptListing()
    {
        list = new ArrayList();
        nf = NumberFormat.getCurrencyInstance();
 
        //Adds a blank receipt so sorting and searching can still occur (Will be placed at position zero and almost
        //Invisible to the user
        list.add(new Receipts("", ""));
    }

    /**
     * Adds the receipt to the listing
     * @param the name of the customer/receipt
     * @param items the list of items to be added
     */
    public void add(String name, String items)
    {
        list.add(new Receipts(name, items));
        System.out.println("\f The reciept was successful created.");
    }

    /**
     * Finds the receipt and proceeds to add the item to it
     * @param name of the receipt to add the item to
     * @param item the item to be added
     */
    public void updateAdd(String name, String item)
    {
        sort();
        int loc = binarySearch(name);
        if(loc == -1)
        {
            System.out.println("\fThe name of the receipt was not found.");
        }
        else
        {
            list.get(loc).buy(item);
        }
    }

    /**
     * Finds the receipt and proceeds to remove the item from it
     * @param name of the receipt to remove the item from
     * @param item the item to be removed
     */
    public void updateRemove(String name, String item)
    {
        sort();
        int loc = binarySearch(name);
        if(loc == -1)
        {
            System.out.println("\fThe name of the receipt was not found.");
        }
        else
        {
            list.get(loc).remove(item);
        }
    }

    /**
     * Sorts and prints all of the current receipts
     */
    public void printAll()
    {
        sort();
        for(int j = 1; j < list.size(); j++)
        {
            System.out.println("Reciept: " + j + "\n\tName: " + list.get(j).getName() + "\n\tTotal Price: "
                + nf.format(list.get(j).getPrice()) + "\n\tItems: " + list.get(j).getItems()); 
        }
    }

    /**
     * Searchs for the specified receipt
     * @param name the name on the receipt to be found from user input
     */
    public void search(String name)
    {
        //First sorts the array, then usually the binary search
        sort();
        int loc = binarySearch(name);
        if(loc == -1)
        {
            System.out.println("\fThe name of the receipt was not found.");
        }
        else
        {
            System.out.println("The receipt was found by performing a binary search.\nLocation: " + loc + "\n\tName: " + list.get(loc).getName() +
                "\n\tTotal Price: " + nf.format(list.get(loc).getPrice()) + "\n\tItems: " + list.get(loc).getItems());
        }
    }

    /**
     * Performs a binary search for the specified name
     * @param name the name on the receipt to be found
     */
    public int binarySearch(String name)
    {
        //Binary search algorithm
        int lower = 0;
        int upper = list.size()-1;
        while(lower <= upper)
        {
            int mid = (upper + lower)/2;
            if(list.get(mid).getName().equals(name))
            {
                return mid;
            }
            else if(list.get(mid).getName().compareTo(name) <= -1)
            {
                lower = mid + 1;       
            }
            else
            {
                upper = mid - 1;
            }
        }

        return -1;
    }

    /**
     * Utilizes a selection sort to sort receipts by their name
     */
    public void sort()
    {
        //Creates a fake copy of the unsorted list to test speeds of sorting algorithm
        Receipts[] temps = new Receipts[list.size()];
        for(int j = 0; j < list.size(); j++)
        {
            temps[j] = list.get(j);
        }

        //Selection sort algorithm
        sw.start();
        String smallest = "";
        int locator = 0;
        Receipts temp;
        for(int j = 0; j < list.size()-1; j++)
        {
            locator = j;
            smallest = list.get(locator).getName();
            for(int i = j+1; i < list.size(); i++)
            {
                if(list.get(i).getName().compareTo(smallest) <= -1)
                {
                    smallest = list.get(i).getName();
                    locator = i;
                }
            }
            if(locator != j)
            {
                temp = list.get(j);
                list.set(j,list.get(locator));
                list.set(locator, temp); 
            }
        }
        System.out.println("\fThe list was sorted with a selection sort with a time of " + sw.stop());

        //Runs a bubble sort to compare on a fake list
        sw.start();
        bubbleSort(temps);
        System.out.println("The list was sorted with a bubble sort with a time of " + sw.stop());
    }

    /**
     * Runs a bubble sort on a mirrored copy of unsorted list to test timing
     * @param list the list to be sorted
     */
    public void bubbleSort(Receipts[] list)
    {
        Receipts temp;
        //Bubble sort algorithm
        for(int j = 0; j < list.length; j++)
        {
            for(int i = 1; i < list.length-j; i++)
            {
                if(list[i].getName().compareTo(list[i-1].getName()) <= -1)
                {
                    temp = list[i];
                    list[i] = list[i-1];
                    list[i-1] = temp;
                }
            }
        }
    }

    /**
     * Returns the value at the location
     * @param location the location of the receipt to be found
     * @return the receipt at the location
     */
    public Receipts get(int location)
    {
        return list.get(location);
    }

    /**
     * Returns the number of receipts
     * @return the number of receipts
     */
    public int size()
    {
        return list.size();
    }
}
