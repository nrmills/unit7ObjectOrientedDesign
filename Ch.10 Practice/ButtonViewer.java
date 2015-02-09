import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 80;
    
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA, buttonB;
    private JLabel label;
    
    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();
        buttonA = new JButton( "A" );
        panel.add( buttonA );

        buttonB = new JButton( "B" );
        panel.add( buttonB );

        label = new JLabel( "No Button Clicked" );
        panel.add( label );

        frame.add( panel );

        ActionListener listener = new ClickListener();

        buttonA.addActionListener( listener );
        buttonB.addActionListener( listener );

        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        frame.setVisible( true );
    }

    public class ClickListener implements ActionListener
    {
        
        public void actionPerformed( ActionEvent event )
        {
            label.setText( "Button" + event.getActionCommand() + " was clicked! " ); 
        }
    }
    
    public static void main( String[] args )
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}