import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the capital of France?");
        System.out.println("A) London");
        System.out.println("B) Paris");
        System.out.println("C) Rome");
        System.out.println("D) Berlin");
        System.out.print("Enter your choice (A/B/C/D): ");

        char userChoice = scanner.next().toUpperCase().charAt(0);

        switch (userChoice) {
            case 'A':
                System.out.println("Incorrect. The correct answer is Paris.");
                break;
            case 'B':
                System.out.println("Correct!");
                break;
            case 'C':
                System.out.println("Incorrect. The correct answer is Paris.");
                break;
            case 'D':
                System.out.println("Incorrect. The correct answer is Paris.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}