import java.util.Scanner; //scanner obj has methods to read from user input
public class MainPerson 
{
    public static void main(String[] args)
    {
        //-----------------Task 3 [USE CLASS Person: methods] ----------------------------------------
        /*
        setId(i), setName(n), setAge(a), getId(), getName(), getAge()
        */
        Scanner sc = new Scanner(System.in);
        Person_1 p1 = new Person_1();
        
        //use this obj to call the SET and GET methods, use values from user
        String personId, personName;   //do not use access specifier here
        int personAge;                 //do not use access specifier here
        
        System.out.println("Enter id of person: ");
        personId = sc.nextLine();    //personId may be only 1 word
        System.out.println("Enter name of person: ");
        personName = sc.nextLine(); 
        System.out.println("Enter age of person: ");
        personAge = sc.nextInt(); 
        
        p1.setId(personId);
        p1.setName(personName);
        p1.setAge(personAge);
        
        System.out.println("Name is " + p1.getName());
        System.out.println("Id is " + p1.getId() + "\n" + "Age is " + p1.getAge());
        
                      
        
        
        //-----------------Task 2 [GET USER VALUES] ----------------------------------------
        // Scanner sc = new Scanner(System.in);
        // Person student = new Person();
        // String personId, personName;   //do not use access specifier here
        // int personAge;                 //do not use access specifier here
        
        // System.out.println("Enter id of person: ");
        // personId = sc.nextLine();    //personId may be only 1 word
        // System.out.println("Enter name of person: ");
        // personName = sc.nextLine(); 
        // System.out.println("Enter age of person: ");
        // personAge = sc.nextInt(); 
        
        // student.setPerson(personId, personName, personAge);
        // student.displayPerson();
        
        
        
        //-----------------Task 1 [HARD CODED DATA] ----------------------------------------
        // //Create and instantiate the obj of Person 
        // Person bingo = new Person();
        
        // //use the obj to invoke the mutator method - pass values to the obj
        // bingo.setPerson("A123", "bingoooooo", 24);
        
        // //use the obj to invoke
        // bingo.displayPerson();
        
    }
}