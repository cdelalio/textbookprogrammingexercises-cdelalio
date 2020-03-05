import javax.swing.*;
import java.awt.*;

    public class HouseAtNight extends JPanel {
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d=(Graphics2D)g;
            //draw a night sky
            g2d.setColor(new Color(67, 67, 103));
            g2d.fillRect(0,0,getWidth(),getHeight());
            //draw window cross
            g2d.setColor(Color.white);
            g2d.fillRect(440,220,5,35);
            //draw grass
            g2d.setColor(new Color(96, 153, 25));
            g2d.fillRect(0,300,getWidth(),getHeight()-300);
            //draw a red wall
            g2d.setColor(new Color(203, 65, 84));
            g2d.fill3DRect(400,200,150,150, true);
            //draw a window
            g2d.setColor(new Color(157, 163, 168));
            g2d.fillRect(420,220,35,35);
            //draw a door
            g2d.setColor(new Color (141, 69, 50));
            g2d.fill3DRect(475,275,50,75, true);
            //draw moon
            g2d.setColor(new Color (229, 229, 229));
            g2d.fillOval(100,70,80,80);
            /*
            draw sun
            draw  doorknob
            draw roof
            */
            Polygon roof = new Polygon();
            roof.addPoint(75,200);
            roof.addPoint(175,200);
            roof.addPoint(75,200);
            g2d.setColor(Color.white);
            g2d.fillPolygon(roof);
        }

    }

