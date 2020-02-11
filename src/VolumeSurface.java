import java.util.Scanner;
import java.lang.Math;
public class VolumeSurface {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double r, h;
        System.out.println("Please enter a radius and height.");
        r=  input.nextInt();
        h=  input.nextInt();
        sphereVolume(r);
        sphereSurface(r);
        cylinderVolume(r, h);
        cylinderSurface(r,h);
        coneVolume(r, h);
        coneSurface(r, h);

    }
    /**
     * returns the volume of a sphere
     * @param r first integer
     * @return double
     */
    public static double sphereVolume(double r)
    {
        double volume = (4/3)*(3.1415)*Math.pow(r, 3);
        System.out.println("The volume of the sphere is " + Math.round(volume)+ ".");
        return volume;
    }
    /**
     * returns the surface area of a sphere
     * @param r first integer
     * @return double
     */
    public static double sphereSurface(double r)
    {
        double volume = (4)*(3.1415)*Math.pow(r, 2);
        System.out.println("The surface area of the sphere is " + Math.round(volume)+ ".");
        return volume;
    }
    /**
     * returns the volume of a cylinder
     * @param r first integer
     * @param h second integer
     * @return double
     */
    public static double cylinderVolume(double r, double h)
    {
        double volume= (3.1415*r*r*h);
        System.out.println("The volume of the cylinder is " + Math.round(volume)+ ".");
        return volume;
    }
    /**
     * returns the surface area of a cylinder
     * @param r first integer
     * @param h second integer
     * @return double
     */
    public static double cylinderSurface(double r, double h)
    {
        double volume= (2*3.1415*r*h)+(2*3.1415*Math.pow(r,2));
        System.out.println("The surface area of the cylinder is "+ Math.round(volume)+ ".");
        return volume;
    }
    /**
     * returns the volume of a cone
     * @param r first integer
     * @param h second integer
     * @return double
     */
    public static double coneVolume(double r, double h)
    {
        double volume= 3.1415*r*r*(h/3);
        System.out.println("The volume of the cone is "+ Math.round(volume)+ ".");
        return volume;
    }
    /**
     * returns the surface area of a cone
     * @param r first integer
     * @param h second integer
     * @return double
     */
    public static double coneSurface(double r, double h)
    {
        double volume= r*3.1415*(r+Math.sqrt((h*h)+(r*r)));
        System.out.println("The surface area of the cone is "+ Math.round(volume) + ".");
        return volume;
    }
}
