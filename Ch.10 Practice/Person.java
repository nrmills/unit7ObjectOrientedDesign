
public class Person implements Comparable<Person>
{
    private String name;
    
    public Person( String initName )
    {
        name = initName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int compareTo( Person otherPerson )
    {
        String myName = this.getName();
        String otherName = otherPerson.getName();
        
        return myName.compareTo(otherName);
    }
}