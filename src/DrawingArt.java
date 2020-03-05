import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;
public class DrawingArt extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D)g;
        //draw a  light blue sky
        g2d.setColor(new Color(82,140,203));
        g2d.fillRect(0,0,getWidth(),getHeight());
        //draw grass
        g2d.setColor(new Color(96, 153, 25));
        g2d.fillRect(0,300,getWidth(),getHeight()-300);
        //draw a red wall
        g2d.setColor(new Color(203, 65, 84));
        g2d.fillRect(100,200,150,150);
        //draw a window
        g2d.setColor(new Color(0, 0, 0));
        g2d.fillRect(120,220,35,35);
        //draw window cross
        g2d.setColor(Color.white);
        g2d.fillRect(140,220,5,35);
        //draw a door
        g2d.setColor(new Color (141, 69, 50));
        g2d.fillRect(175,275,50,75);
        //draw sun
        //draw  doorknob
        //draw roof
        Polygon  roof =new Polygon();
        roof.addPoint(75,200);
        roof.addPoint(175,200);
        roof.addPoint(75,200);
        g2d.setColor(new Color (161, 71, 67));
        g2d.fillPolygon(roof);
    }

}
