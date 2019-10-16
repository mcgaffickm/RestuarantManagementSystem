/**
 * Holds the items for sale and their prices
 * @author Michael McGaffick
 * @version 4/9/18
 */
public class Items
{
    //Declares variables
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor for items
     * @param name the name of the item
     * @param price the price of the item
     */
    public Items(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Returns the given name of the item
     * @return a string of the given name
     */
    public String getName()
    {
        return name;   
    }

    /**
     * Returns the price of the item
     * @return a double of the price of the given item
     */
    public double getPrice()
    {
        return price;   
    }

    /**
     * Returns the quantity of the item
     * @return an int of the quantity of the item
     */
    public int getQuantity()
    {
        return quantity;   
    }

    /**
     * Removes one from quantity when a customer purchases the item
     */
    public void subtract()
    {
        quantity--;   
    }
}
