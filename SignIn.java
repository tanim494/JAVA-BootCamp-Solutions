import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java";
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String enteredUserName = scan.next();
        System.out.print("• Password: ");
        String enteredPassword = scan.next();
        while (!(username.equals(enteredUserName))||!(password.equals(enteredPassword))){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            enteredPassword = scan.next();
            System.out.print("• Password: ");
            enteredUserName = scan.next();
        }
        System.out.println("\nSign in succesful. Welcome!");
        scan.close();
    }
}
