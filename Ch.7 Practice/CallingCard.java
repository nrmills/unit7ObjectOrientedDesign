

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    String cardNumber;
    String pin;

    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard( String initCardNumber, String initPin) 
    {
        cardNumber = initCardNumber;
        pin = initPin;
    }

    public String format()
    {
        String str = super.format()+"\nCard#: "+cardNumber+"\nPIN#: "+pin;
        return str;
    }

}
