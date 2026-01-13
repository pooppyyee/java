public class MainABC 
{
    public static void main (String [] args) 
    {
        //Create & instantiate obj of either class A / B
        // Class_A ca = new Class_A(); //default constructor
        // ca.setClassA();
        // ca.displayClassA();
        
        Class_B cb = new Class_B(); // child can do parent thing
        //cb.setClassA(); //can call setClassA(), but if called in ClassB already, don't call here
        cb.setClassB(); 
        
        //cb.displayClassA(); //can call but no need if called in ClassB displayClassB already
        cb.displayClassB();
        
        
        
    }
}