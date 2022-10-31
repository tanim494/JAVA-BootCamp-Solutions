import java.util.Scanner;

public class CounterTool5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("Pick a number to count by:");
        int diffNumber = scan.nextInt();

        System.out.print("Pick a number to start counting from:");
        int initNumber = scan.nextInt();

        System.out.print("Pick a number to count to:");
        int finalNumber = scan.nextInt();

    for (int i=initNumber;initNumber<=finalNumber;i++){
        System.out.println(initNumber);
        initNumber += diffNumber;
    }
        scan.close();
    }
}
