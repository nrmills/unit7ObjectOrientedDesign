

/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    String idNumber;

    /**
     * Default constructor for objects of class IDCard
     */
    public IDCard( String n, String id )
    {
        super(n);
        idNumber = id;
    }
    
    public boolean equals( Object otherObject )
    {
        if( this.getClass() == otherObject.getClass() )
        {
            IDCard other = ( IDCard ) otherObject;
            return getName().equals( other.getName() )
                && idNumber.equals( other.idNumber );
        }
        return false;
    }

    public String format()
    {
        String str = super.format()+"\nID#: "+idNumber;
        return str;
    }

}
