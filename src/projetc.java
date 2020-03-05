import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;// Using Swing's components and containers
import java.awt.geom.Line2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;

    /** Custom Drawing Code Template */
// A Swing application extends javax.swing.JFrame
    public class projetc extends JFrame {
        // Define constants
        public static final int CANVAS_WIDTH  = 640;
        public static final int CANVAS_HEIGHT = 480;

        // Declare an instance of the drawing canvas,
        // which is an inner class called DrawCanvas extending javax.swing.JPanel.
        private DrawCanvas canvas;

        // Constructor to set up the GUI components and event handlers
        public projetc() {
            canvas = new DrawCanvas();    // Construct the drawing canvas
            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

            // Set the Drawing JPanel as the JFrame's content-pane
            Container cp = getContentPane();
            cp.add(canvas);
            // or "setContentPane(canvas);"

            setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
            pack();              // Either pack() the components; or setSize()
            setTitle("......");  // "super" JFrame sets the title
            setVisible(true);    // "super" JFrame show
        }

        /**
         * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
         */
        private class DrawCanvas extends JPanel {
            // Override paintComponent to perform your own painting
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                super.paintComponent(g);     // paint parent's background
                setBackground(Color.white);  // set background color for this JPanel
                g.setColor(new Color(195, 203, 217));
                g.fillRect(0, 250, 640, 230);
                //penguin left wing
                g.setColor(new Color(0, 0, 0));
                Graphics2D g2d = (Graphics2D)g;
                AffineTransform old = g2d.getTransform();
                g2d.rotate(Math.toRadians(30));
                g.fillOval(310,50,30,90);
                g2d.setTransform(old);
                //penguin right wing
                g2d.rotate((0.5));
                g2d.fillOval(450,0,90,30);
                g2d.setTransform(old);
                //penguin border
                g.setColor(new Color(0, 0, 0));
                g.fillOval(250,90,150,240);
                //penguin body
                g.setColor(Color.white);
                g.fillOval(260,110,130,180);

                //penguin eyes
                g.setColor(new Color(0, 0, 0));
                g.fillOval(300,120,10,20);
                g.fillOval(336,120,10,20);

                //penguin nose outline
                g2.setStroke(new BasicStroke(3));
                g.drawOval(312,150,25,10);
                g2.setStroke(new BasicStroke(1));
                //penguin feet outline
                g.fillOval(260,290,40,40);
                g.fillOval(350,290,40,40);


                //fill nose
                g.setColor(new Color(252, 255, 76));
                g.fillOval(312,150,25,10);
                //fill penguin feet
                g.fillOval(264,294,33,33);
                g.fillOval(354,294,33,33);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Monospaced", Font.PLAIN, 20));
                g.drawString("Penguin", 280, 50);
            }
        }

        // The entry main method
        public static void main(String[] args) {
            // Run the GUI codes on the Event-Dispatching thread for thread safety
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new projetc(); // Let the constructor do the job
                }
            });
        }
    }

