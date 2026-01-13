//ArrayList is a class that has methods - better than array bcs INDEFINITE SIZE 
import java.util.*; //ArrayList stored in utility package
//add(), size(), get()...
/*Q6: What other methods can be used from AL?
clone(), remove(), isEmpty(), set()
*/
public class SimpleArrayList
{
    public static void main (String [] args)
    {
        //a) String of values for ArrayList
        ArrayList<String> namesFriends = new ArrayList<String>();
        
            /*Q4: Use the object namesFriends and add the names of 5 friends */
        namesFriends.add("ALI");
        namesFriends.add("ABU");
        namesFriends.add("BABA");
        namesFriends.add("BUBU");
        namesFriends.add("CACA");
        
            /*Q5: Display the names using for loop*/
        for(String n:namesFriends)
        {
            System.out.print(n + "\t");
        }
        
        //b) Primitive data types for ArrayList -use CLASSES
        //Integer, Double, Float, Boolean (capital 1st letter)
        ArrayList<Integer> ages = new ArrayList();
        ages.add(12);
        ages.add(13);
        ages.add(10);
        ages.add(19);
        
        System.out.println(ages);
        for(int a:ages)
        {
            System.out.print(a + "\t");
        }
        
        /* 
            Q2: Correct this display
        1- use size() instead of length
        2- use get() instead of [i]
        */
        
        for(int i=0; i< ages.size(); i++)  //cannot use "length" for AL
        {
            System.out.print(ages.get(i) + "\t");   
        }
        
        /*
            Q3: Declare and assign an AL of Double and Boolean values. Display the values
        */
        ArrayList<Double> score = new ArrayList();
        score.add(87.5);
        score.add(81.0);        
        score.add(78.5);        
        score.add(70.5);
        
        for(int i = 0; i<score.size(); i++)
        {
            System.out.print(score.get(i) + "\t");
        }
        
        ArrayList<Boolean> light = new ArrayList();
        light.add(true);
        light.add(false);
 
        
        for(boolean l:light)
        {
            System.out.println(l);
        }
        
        
        //c) ArrayList without specifying the data type //gabung semua sekali
        ArrayList anything = new ArrayList();
        anything.add("Samson");
        anything.add(123);
        anything.add(8.00);
        anything.add('X');
        
        System.out.println(anything);
        
        //  Q1: Can the values be displayed using enhance for loop / normal for loop?: can
        for(Object any: anything) //cannot use for(ArrayList any : anything)
        {
            System.out.println(any);
        }
        System.out.println("--------------------------------------------");
        
        for(int i=0; i< anything.size(); i++)
        {
            System.out.println(anything.get(i)+"\t"); 
        }
     
    }
}