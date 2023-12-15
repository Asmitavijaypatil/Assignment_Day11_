import java.util.Scanner;

class DataValidator {

    public boolean isValidemail(String email) {
        return email.matches("^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }
    public boolean isValidnumber(String phoneNumber) {
        return phoneNumber.matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$");
    }
    public boolean isValiddate(String date) {
        return date.matches("^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$");
    }

}
public class MainClass5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataValidator d = new DataValidator();

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        if (d.isValidemail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();
        if (d.isValidnumber(phoneNumber)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        if (d.isValiddate(date)) {
            System.out.println("Valid date format.");
        } else {
            System.out.println("Invalid date format.");
        }
    }

}