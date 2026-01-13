public class Person
{
    private Address add;
    private String pName;
    private int pId;
    private int pAge;
    public void setPerson(int pId, int pAge, String pName, Address add)
    {
        this.pId = pId;
        this.pAge = pAge;
        this.pName = pName;
        this.add = add;
    }
    public int getId ()
    {
        return pId;
    }
    /*Write the get methods for the other data, including add*/
    public int getAge ()
    {
        return pAge;
    }
    public String getName ()
    {
        return pName;
    }
    public Address getAdd ()
    {
        return add;
    }
    public void displayPerson()
    {
        System.out.println("Id is " +pId);
        System.out.println("Name is " +pName);
        System.out.println("Age is " +pAge);
        /*Include the statement in Java to display the details of Address*/
        System.out.println(add); //SINCE add is an Object
        //need toString overridden method to display
        //if tak guna, output messy hexa code
    }
}
 

 
//========================================================
 
