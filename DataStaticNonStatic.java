//can we call static/non static data in non static method???

// CAN. 
//non static data - if changed in one of the method, it will not change anymore
//123 will forever be 123
//static data - always changeable in methods
public class DataStaticNonStatic
{
    int valueInt = 123;                //non static data
    static double valueDouble = 9.99;  //static data
    
    // public void showValueInt() //non static method
    // {
    //     System.out.println("Value :" +valueInt);
    // }
    
    // public void showValueDouble() //non static method
    // {
    //     System.out.println("Value :" +valueDouble);
    // }
    
    public void increaseValues()
    {
        valueInt++;
        valueDouble *= 10;
    }
    
    public void showAll()
    {
        System.out.println("Value :" +valueInt);
        System.out.println("Value :" +valueDouble);
    }
    
    public static void main (String[] args)
    {
        //new DataStaticNonStatic().showValueInt();
        //new DataStaticNonStatic().showValueDouble();
        new DataStaticNonStatic().increaseValues();
        new DataStaticNonStatic().showAll();
        new DataStaticNonStatic().increaseValues();
        new DataStaticNonStatic().showAll();
        
    }
}