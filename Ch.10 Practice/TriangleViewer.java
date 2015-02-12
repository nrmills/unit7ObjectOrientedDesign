
import javax.swing.JFrame;
//import javax.swing.JLabel;


public class TriangleViewer
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private JFrame frame;
    //private JLabel label;
    
    public TriangleViewer()
    {
        frame = new JFrame();
        
        MouseListener listener = new ClickListener();
        frame.addMouseListener( listener );
        
        frame.setSize( 500,500 );
        frame.setTitle( "Triangle Drawer" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        TriangleComponent component = new TriangleComponent();
        frame.add( component );
        
        frame.setVisible( true );
    }
}