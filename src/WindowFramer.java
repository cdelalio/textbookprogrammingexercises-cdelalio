import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class WindowFramer extends  JFrame{
    public WindowFramer() {
        setTitle("Window Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add an instance of the extended JPanel
        add(new HouseAtNight());
        setSize( 800, 600);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                WindowFramer dw = new WindowFramer();
                dw.setVisible(true);
                Dimension dim=dw.getSize();
                Insets ins= dw.getInsets();
                System.out.println("Window Size is "+dim.width+"by"+dim.height);
            }
        });
    }
    
}
