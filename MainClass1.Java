import java.util.Scanner;

class Calculator {

    public int Addition(int a, int b) {
        return a + b;
    }
    public double Addition(double a, double b) {
        return a + b;
    }
    public int Substraction(int a, int b) {
        return a - b;
    }
     public double Substraction(double a, double b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Multiplication(double a, double b) {
        return a * b;
    }
    public double Division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
           System.out.println("Can not divided by zero");
           return Double.NaN;
        }
    }
    public double Division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Can not divided by zero");
            return Double.NaN;
        }
    }

}
public class MainClass1 {
    public static void main(String[] args) {
        Calculator C = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Integer value : ");
        int c = sc.nextInt();
        System.out.println("Enter 2nd Integer value : ");
        int d = sc.nextInt();
        
        System.out.println("Addition: "+C.Addition(c,d));
        System.out.println("Substraction: "+C.Substraction(c,d));
        System.out.println("Multiplication: "+C.Multiplication(c,d));
        System.out.println("Division: "+C.Division(c,d));

        System.out.println();

        System.out.print("Enter 1st Double value : ");
        double e = sc.nextDouble();
        System.out.print("Enter 2nd Double value : ");
        double f = sc.nextDouble();

        System.out.println("Addition: "+C.Addition(e,f));
        System.out.println("Substraction: "+C.Substraction(e,f));
        System.out.println("Multiplication: "+C.Multiplication(e,f));
        System.out.println("Division: "+C.Division(e,f));
       
    }

}