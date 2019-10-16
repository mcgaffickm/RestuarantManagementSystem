/**
 * A class to hold objects of all main forms and other structure like classes
 * @author Michael McGaffick
 * @version 4/25/18
 */
public class Container
{
    //Declares all of the forms and structure class objects
    public static HomeForm hf;
    public static TableManagement tm;
    public static InventoryManagement im;
    public static ReceiptManagement rm;
    public static About ab;
    public static Inventory inv;
    public static ReceiptListing rl;
    public static TableMap map;

    /**
     * Is called on the program's run in order to intialize everything and prepare the home form
     */
    public static void start()
    {
        //Intializes all above variables
        hf = new HomeForm();
        tm = new TableManagement();
        im = new InventoryManagement();
        rm = new ReceiptManagement();
        ab = new About();
        inv = new Inventory();
        map = new TableMap();
        rl = new ReceiptListing();

        //Runs all of the forms to intialize everything
        hf.main();
        tm.main();
        im.main();
        rm.main();
        ab.main();
    }
}
