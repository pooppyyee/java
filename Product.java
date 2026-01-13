public class Product 
{
    private String description;
    private int productId;
    private double productPrice;
    
    //constructor = default constructor
    public Product()
    {
        //body of constructor can be left empty
    }
    //overloaded constructor - have 1 or more arguments
    public Product (String desc, int id, double pr)
    {
        description = desc;
        productId = id;
        productPrice = pr;
    }
    
    public String toString()
    {   //can direct return prodDetails mah?
        String prodDetails = "Product Details "+productId +" "+description+" RM"+productPrice;
        return prodDetails;
    }
    
}