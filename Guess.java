import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int compNumber = (int) (Math.random() * 5) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("I chose a number between 1 and 5. Try to guess it: ");
        System.out.print("Your Guess:");
        int userNumber = scan.nextInt();
        while (!(userNumber == compNumber)) {
            System.out.println("Guess again");
            userNumber = scan.nextInt();
        }
        System.out.println("Congo! You guessed it right.");
        scan.close();
    }
}
