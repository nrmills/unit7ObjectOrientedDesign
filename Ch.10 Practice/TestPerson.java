import java.util.Arrays;
import java.util.Scanner;

public class TestPerson
{
    public static Person firstPerson( Person [] people )
    {
        Person first = people[0];
        for( int i = 1; i < people.length; i++ )
        {
            if ( people[i].compareTo(first) < 0 )
            {
                first = people[i];
            }
        }
        return first;
    }
    
    public static void main(String[] args)
    {
        //initialize person objects
        Person [] people = new Person[10];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 naems: ");
        for( int i = 0; i < 10 && scanner.hasNext(); i++ )
        {
            people[i] = new Person( scanner.next() );
        }
        
        System.out.println( "First: " + firstPerson.getName() );
        System.out.println( "Last: " + lastPerson.getName() );
        
    }
}