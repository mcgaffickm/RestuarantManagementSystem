import java.util.HashMap;
import java.util.ArrayList;
/**
 * Creates a listing of the table data, is used as a map
 * @author Michael McGaffick
 * @version 4/4/18
 */
public class TableMap
{
    //Declares variables
    public HashMap <String, Table> tables = new HashMap();
    public ArrayList<String> keyList = new ArrayList();
    StopWatch sw = new StopWatch();

    /**
     * Adds objects to this map
     * @param key the unique identifier for this map class
     * @param table the table object
     */
    public void put(String key, Table table)
    {
        if(table.getSize() > 0)
        {
        tables.put(key, table);
        keyList.add(key);
        sw.start();
        sort();
        System.out.println("\fThe table key list was sorted with an selected sort.  Time: " + 
            sw.stop() + "ms.\nYour sorted table keys: ");
        for(int j = 0; j < keyList.size(); j++){
            System.out.print(keyList.get(j) + " ");
        }
        System.out.println();
    }
}

    /**
     * Uses a selection sort to sort the data of the table key list
     */
    public void sort()
    {
        String smallest = "";
        int locator = 0;
        String temp;

        //Selection sort algorithm
        for(int j = 0; j < keyList.size()-1; j++)
        {
            locator = j;
            smallest = keyList.get(locator);
            for(int i = j+1; i < keyList.size(); i++)
            {
                if(keyList.get(i).compareTo(smallest) <= -1)
                {
                    smallest = keyList.get(i);
                    locator = i;
                }
            }
            if(locator != j)
            {
                temp = keyList.get(j);
                keyList.set(j,keyList.get(locator));
                keyList.set(locator, temp); 
            }
        }
    }

    /**
     * Modifies the boolean properties of the table based on user input
     * @param action the action based on the button that was pushed, programmer input
     * @param key the table to be modified
     */
    public void modifyTable(String action, String key)
    {
        System.out.print("\f");
        if(action.equals("seat"))
        {
            tables.get(key).seat(); 
        }
        else if (action.equals("clean"))
        {
            tables.get(key).clean();
        }
        else if(action.equals("empty"))
        {
            tables.get(key).leaves();
        }
    }

    /**
     * Prints the status of boolean properties of a table
     * @param key the table to be checked
     */
    public void getStatus(String key)
    {
        System.out.print("\f");
        if(tables.get(key).getStatus())
        {
            System.out.println("Table: " + key + "\nis currently empty.");
            if(tables.get(key).getClean())
            {
                System.out.println("is currently clean.");
            }
            else
            { 
                System.out.println("is currently dirty.");
            }
        }
        else
        {
            System.out.println("Table: " + key + "\nis currently filled.");   
        }
        System.out.println("The current size of the table is " + tables.get(key).getSize());
    }

    /**
     * Changes the size of the specified table
     * @param key the table to be changed
     * @param newSize the new size of the table
     */
    public void changeSize(String key, int newSize)
    {
        if(newSize <= 0)
        {
            System.out.println("The current size of the table is impossible.  Please try again.");
        }
        else
        {
            tables.get(key).changeSize(newSize);
            System.out.println("\fTable " + key + " now seats " + newSize + " people.");
        }
    }
}
