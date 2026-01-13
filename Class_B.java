//subclass /child class of Class_A
class Class_B extends Class_A
{
    //data that belongs to Class_B
    private int valP;
    protected int valQ;
    int valR;
    public int valS;
    
    public void setClassB()
    {
        //valA ~ valD are inheited from Class_A
        //valA = 220; //private in Class_A, subclass Class_B cannot MODIFY or USE valA, its illegal
        //protected, public, freindly in Class_A, can USE in Class_B        
        valB = 330;
        valC = 440;
        valD = 550;
        
        /*Can call the superclass using super or without super*/
        
        // super.setClassA();
        
        setClassA(); //whatever is assigned in Class_A
        
        //all these data belongs to & can be used in Class_B
        valP = 88;
        valQ = 89;
        valR = 90;
        valS = 91;
        
        
    }
    public void displayClassB()
    {
        //cannot print out, valA is private, whole line is Illegal
        //System.out.println(+valA +"\t" +valB +"\t" +valC+"\t"+valD +"\t");
        
        //call / invoke parent/superclass method 
        displayClassA(); //Class_B can call methods of Class_A
        System.out.println(+valP +"\t" +valQ +"\t" +valR+"\t"+valS +"\t");
        
        
    }
}
 