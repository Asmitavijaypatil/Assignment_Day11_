import java.util.Scanner;

class Student {

    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return "Name of student: "+name;    
    }
    public int getrollNumber() {
        return rollNumber;
    }
}
public class MainClass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name =sc.nextLine();

        System.out.print("Enter rollNumber: ");
        int rollNumber = sc.nextInt();

        Student s = new Student(name,rollNumber);
        System.out.println(s.getName());
        System.out.println("RollNumber is: "+s.getrollNumber());

    }

        
}