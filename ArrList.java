import java.util.*; 

public class ArrList
{
    public static void main(String [] args)
    {
        /* a) Create an AL of BakeryItem objects */
        ArrayList<BakeryItem> itemsOnSale = new ArrayList<BakeryItem>(); //5 marks 
        
        /* METHOD 1: Add data to itemsOnSale = create a separate obj for each item */
        /*
        BakeryItem b1 = new BakeryItem(); //b1 is empty obj
        b1.setBakeryItem("Kaya Bun", 123, 10, 2.00);
        itemsOnSale.add(b1);
        b1.setBakeryItem("Cheese Bun", 234, 15, 3.00);
        itemsOnSale.add(b1);  //re-using obj b1
        */
        
        /* METHOD 2: use overloaded constructor to add */
        // /*
        itemsOnSale.add(new BakeryItem("Kaya Bun", 123, 10, 2.00));
        itemsOnSale.add(new BakeryItem("Cheese Bun", 234, 15, 3.00));
        itemsOnSale.add(new BakeryItem("Chili Bun", 345, 30, 5.00));
        
        // */
        
        /* METHOD 3: prompt user input, read and store in BakeryItem obj, 
        add to the itemsOnSale */
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter item name: ");
        String desc = sc.nextLine();
        System.out.println("Enter item id: ");
        int itemId = sc.nextInt();
        System.out.println("Enter item quantity: ");
        int stock = sc.nextInt();    
        System.out.println("Enter item price (RM): ");
        double price = sc.nextDouble();     
        
        BakeryItem b2 = new BakeryItem(desc, itemId, stock, price);
        itemsOnSale.add(b2);
        
        /* Display the data from itemsOnSale => use iterator (loop) */
        Iterator<BakeryItem> items = itemsOnSale.iterator(); 
        while(items.hasNext())
        {
            BakeryItem bii = items.next();
            //System.out.println(bii); //add toString() method inside BakeryItem class to use
            bii.displayBakeryItem();
        }
        
        
    }
}