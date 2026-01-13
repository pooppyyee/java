//Person.java
public class Person_1
{
    private String id, name;
    private int age;
    
    //methods - SET for each data,
    //-> GET methods for each data -> display methods, other methods...
    public void setId(String id)
    {
        this.id = id;
    } 
    public void setName(String name)
    {
        this.name = name;
    } 
    public void setAge(int age)
    {
        this.age = age;
    } 
    
    public String getId() {return id;}//return id in string
    public String getName() {return name;}
    public int getAge() {return age;}
    
}