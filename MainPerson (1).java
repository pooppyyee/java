/*Define the main class, MainPerson, create and instantiate the object of Person
and / or Address to execute the program*/
public class MainPerson
{
    public static void main (String [] args)
    {
        Address home = new Address();
        Person student = new Person();
        
        home.setAddress(9, "Jalan Rambutan", "A", "Johor Bahru", "Johor");
        //home.displayAddress();
        student.setPerson(123, 20, "Lau", home);
        student.displayPerson();
        
    }
}