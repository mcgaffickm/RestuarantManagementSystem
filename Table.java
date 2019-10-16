/**
 * A class that represents a table in the restuarant
 * @author Michael McGaffick
 * @version 4/4/18
 */
public class Table
{
    //Declares instance variables
    private int size = 0;
    private boolean isFree = true, isClean = true;

    /**
     * Constructor for table objects
     * @param size the maximum number of people that can be seated
     */
    public Table (int size)
    {
        if(size <= 0)
        {
            System.out.println("The current size of the table is impossible.  Please try again.");
        }
        else
        {
            this.size = size;  
        }
    }

    /**
     * Changes the size of a given table for any number of reasons
     * @param newSize the new size
     */
    public void changeSize(int newSize)
    {
        this.size = newSize;   
    }

    /**
     * Gets the current status of if table is cleaned or not of the table
     * @return a boolean whether table is clean (true) or dirty (false)
     */
    public boolean getClean()
    {
        return isClean;   
    }

    /**
     * Gets the current size of the table
     * @return an int of the size of the table
     */
    public int getSize()
    {
        return size;   
    }

    /**
     * Gets the current status of if table is opened or not of the table
     * @return a boolean of whether is open (true) or filled (false)
     */
    public boolean getStatus()
    {
        return isFree;   
    }

    /**
     * Someone sits at the table which means it is no longer cleaned nor free
     */
    public void seat()
    {
        //Checks to make sure the table is available
        if(!isFree || !isClean)
        {
            System.out.println("The table is not suitable for customers.  Please revise and try again.");
        }
        else
        {
            isFree = false;  
            isClean = false;
            System.out.println("Customers have been seated.");
        }
    }

    /**
     * Someone sits leaves the table, thus freeing it up
     */
    public void leaves()
    {
        if(isFree)
        {
            System.out.println("There is no way to empty a table when there are currently no customers.");        
        }
        else
        {
            isFree = true;
            System.out.println("Customers have left the table.");
        }
    }

    /**
     * Table is now cleaned by bus boy, so it can be used again
     */
    public void clean()
    {
        if(!isFree)
        {
            System.out.println("Customers are currently at the table!");
        }
        else if(isClean)
        {
            System.out.println("The table is already clean!");
        }
        else
        {
            isClean = true;
            System.out.println("The table has been cleaned.");
        }
    }
}
