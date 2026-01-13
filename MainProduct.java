public class MainProduct
{
   public static void main (String [] args)
   {
        //create and instantiate the object of Product
        //1- use default constructor
        // Product pen = new Product();
        
        // System.out.println("Object "+pen);
        
        //2- use overloaded constructor
        Product book = new Product("Harry Potter", 899, 200.99);
        System.out.println("My item : "+book);
       
   }
}
