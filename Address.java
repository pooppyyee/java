 public class Address
{
    private String street, block, town, state;
    private int hseNo;
    public void setAddress(int hNo, String str, String blk, String twn, String sta)
    {
        /*Write the method definition for setAddress*/
        hseNo = hNo;
        street = str;
        block = blk;
        town = twn;
        state = sta;
        
    }
    /*Write the accessor methods for each field / data*/
    public int getHseNo()
    {
        return hseNo;
    }
    public String getStreet() 
    {
        return street;
    }
    public String getBlock() 
    {
        return block;
    }
    public String getTown() 
    {
        return town;
    }  
    public String getState() 
    {
        return state;
    } 
    /*Write the display method to display all values of the Address*/
    public void displayAddress()
    {
        System.out.println("House No is " +hseNo);
        System.out.println("Street is " +street);
        System.out.println("Block is " +block);
        System.out.println("Town is " +town);
        System.out.println("State is " +state);
    }
    /*Write the overloaded toString method*/
    public String toString()
    {
        return "Address is " +hseNo + ",Street " + street + ",Block " + block + ",Town " + town + ",State " + state; 
    }
}