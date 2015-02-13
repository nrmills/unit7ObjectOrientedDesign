
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

/**
 * This component draws the triangle
 */
public class TriangleComponent extends JComponent
{
    private int timesClicked = 0;

    private int location1X;
    private int location1Y;

    private int location2X;
    private int location2Y;
    
    private int location3X;
    private int location3Y;
    
    public TriangleComponent()
    {
        MouseListener listener = new ClickListener();
        this.addMouseListener( listener );
    }
    
    public void paintComponent( Graphics g )
    {
        //all logic + drawing
        Graphics2D g2 = ( Graphics2D ) g;
        
        if( timesClicked == 2 )
        {
            Line2D.Double line = new Line2D.Double( location1X, location1Y, location2X, location2Y );
            g2.draw(line);
        }
        else if( timesClicked == 3 )
        {
            Line2D.Double line = new Line2D.Double( location1X, location1Y, location2X, location2Y );
            g2.draw(line);
            
            line = new Line2D.Double( location2X, location2Y, location3X, location3Y );
            g2.draw(line);
            
            line = new Line2D.Double( location1X, location1Y, location3X, location3Y );
            g2.draw(line);
        }
    }

    public class ClickListener implements MouseListener
    {
        public void mouseClicked( MouseEvent event )
        {
            timesClicked++;
            if( timesClicked == 1)
            {
                location1X = event.getX();
                location1Y = event.getY();
            }
            else if( timesClicked == 2 )
            {
                location2X = event.getX();
                location2Y = event.getY();
            }
            else if( timesClicked == 3 )
            {
                location3X = event.getX();
                location3Y = event.getY();
            }
            else if ( timesClicked == 4 )
            {
                timesClicked = 0;
            }
            repaint();
        }

        public void mouseEntered( MouseEvent event )
        {
        }

        public void mouseExited( MouseEvent event )
        {
        }

        public void mousePressed( MouseEvent event )
        {
        }

        public void mouseReleased( MouseEvent event )
        {
        }
    }

}
