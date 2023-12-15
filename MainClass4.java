import java.util.Scanner;

class Geometry {

    public float CalculateArea(float side) {
        return side * side;
    }
    public double CalculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double CalculateArea(double width,double length) {
        return width * length;
    }
}
public class MainClass4 {
    public static void main(String[] args) {
        Geometry g = new Geometry();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        float s = sc.nextFloat();
        System.out.println("Area of the Square: "+g.CalculateArea(s));
         
        System.out.println();
        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of the Circle: "+g.CalculateArea(r));

        System.out.println();

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.println("Area of the Rectangle: "+g.CalculateArea(l,w));
    }

}