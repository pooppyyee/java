public class BakeryItem
{
    private String desc;
    private int itemId, stock;
    private double price;
    /*default constructor => parameterless constructor
    = creates and instantiates an empty 
    object - so we set the values to 0, 0.00 or null*/
    public BakeryItem()
    {
        // desc = null;
        // itemId = 0;
        // stock = 0;
        // price = 0.00;
        //call overloaded constructor
        this(null, 0, 0, 0.00);
    }
    /*overloaded constructor = creates and instantiates an object with 
    the data passed through the arguments*/
    public BakeryItem(String d,int i, int s, double p)
    {
        // desc = d;
        // itemId = i;
        // stock = s;
        // price = p;
        //call the setBakeryItem() method
        setBakeryItem(d, i, s, p);
    }
    /*setBakeryItem method = initialize all values to the data after
    the object is created*/
  public void setBakeryItem(String de, int id, int st, double pr) //can be beza
    {
        desc = de;
        itemId = id;
        stock = st;
        price = pr;
    }
    
    public void displayBakeryItem()
    {
        System.out.println("Item id " +itemId);
        System.out.println("Description " +desc);
        System.out.println("Price RM" +price);
        System.out.println("Stock " +stock);
    }
}