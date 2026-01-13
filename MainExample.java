//this is main class too (has main method)
public class MainExample 
{
    public static void displayName() //static method (non-main)
    {
        System.out.println("Ruby Jiang");
    }
    
    public void displayFriend() //non-static method
    {
        System.out.println("Hai!!!! nani ga suki?");
    }
    
    public static void main(String [] args) //static method (main)
    {
        //can only use static data & call static method with no problem
        //calling static method
        displayName();
        
        //call / invoke NON-STATIC method, cannot use displayFriend(); 
        // not recommended
        //use an obj of the class
        // MainExample me = new MainExample();
        // me.displayFriend();
        
        //use instantiation of the class to call non-static method
        new MainExample().displayFriend();
        
        
    }
}